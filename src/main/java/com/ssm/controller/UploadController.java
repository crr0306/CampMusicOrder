package com.ssm.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.ssm.common.ExcelUtil;
import com.ssm.common.MyConstant;
import com.ssm.po.Signlog;
import com.ssm.po.SignlogExample;
import com.ssm.service.SignlogService;
import com.ssm.service.UserService;
import com.ssm.util.Doc2Html;
import com.ssm.util.MyUtil;

@Controller
@RequestMapping("/upload")
public class UploadController {
	@Autowired
	private UserService userService;
	@Autowired
	private SignlogService signlogService;
	/**
	 * 导出报表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/exportexcel")
	@ResponseBody
	public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "学生1");
		map.put("phone", "11111111111");

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "学生2");
		map2.put("phone", "2222222222222222");

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("name", "学生3");
		map3.put("phone", "33333333333333333333");

		list.add(map);
		list.add(map2);
		list.add(map3);

		String[] title = { "名称", "手机" };

		String fileName = "学生信息表" + System.currentTimeMillis() + ".xls";
		String sheetName = "学生信息表";

		String[][] content = new String[list.size()+1][title.length];

		for (int i = 0; i < list.size(); i++) {
			content[i] = new String[title.length];
			HashMap<String, String> obj = list.get(i);
			content[i][0] = obj.get("name").toString();
			content[i][1] = obj.get("phone").toString();

		}
		HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
		this.setResponseHeader(response, fileName);
		OutputStream os = response.getOutputStream();
		wb.write(os);
		os.flush();
		os.close();
	}

	// 发送响应流方法
	public void setResponseHeader(HttpServletResponse response, String fileName) {
		try {
			try {
				fileName = new String(fileName.getBytes(), "ISO8859-1");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.setContentType("application/octet-stream;charset=ISO8859-1");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
			response.addHeader("Pargam", "no-cache");
			response.addHeader("Cache-Control", "no-cache");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@ResponseBody
	@RequestMapping(value = "/excel", produces = "text/html;charset=utf-8")
	public String excel(/*
						 * @RequestParam("picParams") String picParams,
						 */
			@RequestParam("excelFile") MultipartFile myfile, HttpServletRequest request) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		if (myfile.isEmpty()) {
			map.put("result", "error");
			map.put("msg", "上传文件不能为空");
		} else {
			String originalFilename = myfile.getOriginalFilename();
			try {
				String newFileName = MyUtil.getUUID()
						+ originalFilename.substring(originalFilename.indexOf("."), originalFilename.length());
				String path = MyConstant.filePath;
				File newFile = new File(path + newFileName);
				if (!newFile.exists()) {
					newFile.createNewFile();
				}
				myfile.transferTo(new File(path + newFileName));

				String filename = path + newFileName;
				Workbook workbook = this.create(filename);
				Sheet sheet = workbook.getSheetAt(0);
				int rowCount = sheet.getPhysicalNumberOfRows();
				Row row = null;
				Cell cell = null;
				List<ArrayList<String>> strlist = new ArrayList<ArrayList<String>>();
				for (int i = 1; i < rowCount; i++) {

					List<String> strlist2 = new ArrayList<String>();

					row = sheet.getRow(i);
					if (row == null) {
						continue;
					}
					cell = row.getCell(0);
					cell.setCellType(Cell.CELL_TYPE_STRING);
					String cellVal = cell.getStringCellValue();
					if (StringUtils.isEmpty(cellVal)) {
						continue;
					}
					strlist2.add(cellVal);
					cell = row.getCell(1);
					cell.setCellType(Cell.CELL_TYPE_STRING);
					cellVal = cell.getStringCellValue();
					if (StringUtils.isEmpty(cellVal)) {
						continue;
					}
					strlist2.add(cellVal);

					System.out.println(strlist2);

					strlist.add((ArrayList<String>) strlist2);

				}
				map.put("result", "success");
				map.put("msg", newFileName);
				map.put("data", strlist);
			} catch (Exception e) {
				map.put("result", "error");
				map.put("msg", e.getMessage());

			}
		}
		return JSONObject.toJSONString(map);
	}

	public static Workbook readExcel(String fileName) {
		Workbook workbook = null;
		InputStream input = null; // 建立输入流
		try {
			input = new FileInputStream(fileName);
			if (fileName.endsWith("xlsx")) {
				workbook = new XSSFWorkbook(input);
			} else {
				workbook = new HSSFWorkbook(input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return workbook;
	}

	

	public static Workbook create(String fileName) throws     
    IOException,InvalidFormatException {
		InputStream in = null; // 建立输入流
		in = new FileInputStream(fileName);
        if (!in.markSupported()) {
            in = new PushbackInputStream(in, 8);
        }
        if (POIFSFileSystem.hasPOIFSHeader(in)) {
            return new HSSFWorkbook(in);
        }
        if (POIXMLDocument.hasOOXMLHeader(in)) {
            return new XSSFWorkbook(OPCPackage.open(in));
        }
        throw new IllegalArgumentException("你的excel版本目前poi解析不了");

    }
	
	
	@ResponseBody
	@RequestMapping(value = "/pic", produces = "text/html;charset=utf-8")
	public String importPicFile1(/*
									 * @RequestParam("picParams") String
									 * picParams,
									 */
			@RequestParam("picFile") MultipartFile myfile, HttpServletRequest request) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		if (myfile.isEmpty()) {
			map.put("result", "error");
			map.put("msg", "上传文件不能为空");
		} else {
			String originalFilename = myfile.getOriginalFilename();
			try {
				String newFileName = MyUtil.getUUID()
						+ originalFilename.substring(originalFilename.indexOf("."), originalFilename.length());
				String path = MyConstant.filePath;
				File newFile = new File(path + newFileName);
				if (!newFile.exists()) {
					newFile.createNewFile();
				}
				myfile.transferTo(new File(path + newFileName));
				map.put("result", "success");
				map.put("msg", newFileName);
			} catch (Exception e) {
				map.put("result", "error");
				map.put("msg", e.getMessage());

			}
		}
		return JSONObject.toJSONString(map);
	}

	@RequestMapping("/devDoc")
	@ResponseBody
	public void devDoc(@RequestParam("path") String path, HttpServletResponse response) throws Exception {

		String fileNamepath = path;
		String fileName = fileNamepath.substring(0, fileNamepath.lastIndexOf("."));
		String suffix = fileNamepath.substring(fileNamepath.lastIndexOf(".") + 1);
		InputStream input = null;
		OutputStream out = null;
		if (suffix != null && !"".equals(suffix)) {
			if ("docx".equals(suffix)) {
				// InputStream inputStream = new ByteArrayInputStream(new
				// File("").);
				// File docFile = FileTObyte.byte2File(a, "E:\\" + fileNamepath,
				// fileName);

				Doc2Html.docx2Html(MyConstant.filePath + fileNamepath, MyConstant.filePath + fileName + ".html");
				input = new FileInputStream(MyConstant.filePath + fileName + ".html");
				response.setContentType("text/html;charset=UTF-8");// 解决页面显示乱码 
				out = response.getOutputStream();
			} else if ("doc".equals(suffix)) {
				// InputStream inputStream = new ByteArrayInputStream(a);
				// File docFile = FileTObyte.byte2File(a, "E:\\" + fileNamepath,
				// fileName);
				Doc2Html.doc2Html(MyConstant.filePath + fileNamepath, MyConstant.filePath + fileName + ".html");
				input = new FileInputStream(MyConstant.filePath + fileName + ".html");
				response.setContentType("text/html;charset=UTF-8");// 解决页面显示乱码 
				out = response.getOutputStream();
			} else {
				/*
				 * input=new ByteArrayInputStream(a);
				 * response.setContentType("application/pdf"); out =
				 * response.getOutputStream();
				 */
			}
		}
		byte[] b = new byte[512];
		if (out != null) {
			if (input != null) {
				while ((input.read(b)) != -1) {
					out.write(b);
				}
			} else {
				System.out.println("InputStream为空。。。");
			}
		} else {
			System.out.println("OutputStream为空。。。");
		}

		out.flush();
		input.close();
		out.close();
	}

	@RequestMapping(value = "downloadFile", method = RequestMethod.GET)
	@ResponseBody
	public void downloadFile(HttpServletRequest req, HttpServletResponse resp, @RequestParam("id") String id) {

		download(resp, id);

	}

	/**
	 * @param resp
	 * @param name
	 *            文件真实名字
	 * @param downloadName
	 *            文件下载时名字
	 */
	public void download(HttpServletResponse resp, String id) {
		/*
		 * String fileName = null; try { fileName = new
		 * String(downloadName.getBytes("GBK"), "ISO-8859-1"); } catch
		 * (UnsupportedEncodingException e) { e.printStackTrace(); }
		 */
		// String
		// realPath=File.separator+"home"+File.separator+"tomcat"+File.separator+"apache-tomcat-9.0.1"+File.separator+"files";
		String path = MyConstant.filePath + id;
		File file = new File(path);
		resp.reset();
		resp.setContentType("application/octet-stream");
		resp.setCharacterEncoding("utf-8");
		resp.setContentLength((int) file.length());
		resp.setHeader("Content-Disposition", "attachment;filename=" + id);
		byte[] buff = new byte[1024];
		BufferedInputStream bis = null;
		OutputStream os = null;
		try {
			os = resp.getOutputStream();
			bis = new BufferedInputStream(new FileInputStream(file));
			int i = 0;
			while ((i = bis.read(buff)) != -1) {
				os.write(buff, 0, i);
				os.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	@RequestMapping(value = "downloadFile2", method = RequestMethod.GET)
	@ResponseBody
	public void downloadFile2(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("sheet1");
		HSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("姓名");
		row0.createCell(1).setCellValue("时间");

		SignlogExample example = new SignlogExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();

		List<Signlog> datalist = signlogService.selectByExample(example);

		// 在sheet里创建往下的行
		for (int i = 0; i < datalist.size(); i++) {
			Signlog db = datalist.get(i);
			HSSFRow row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(db.getCreateusername() != null ? db.getCreateusername().toString() : "");
			row.createCell(1)
					.setCellValue(db.getCreatedate() != null ? (MyUtil.formatDate2(db.getCreatedate())) : "");
		}
		
		String path = MyConstant.filePath ;
		String filename = MyUtil.getUUID() + ".xlsx";
		FileOutputStream output = new FileOutputStream(path + filename);
		wb.write(output);// 写入磁盘  
		output.close();
		download(resp, filename);
		
	}

	
	
}
