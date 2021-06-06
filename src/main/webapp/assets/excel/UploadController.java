package com.ssm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.ssm.service.UserService;
import com.ssm.util.MyUtil;

@Controller
@RequestMapping("/upload")
public class UploadController {
	 @Autowired
	    private UserService userService;  
	 
	@ResponseBody
	@RequestMapping(value = "/pic", produces = "text/html;charset=utf-8")
	public String importPicFile1(/*
												 * @RequestParam("picParams")
												 * String picParams,
												 */
			 @RequestParam("picFile")  MultipartFile myfile, HttpServletRequest request) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		if (myfile.isEmpty()) {
			map.put("result", "error");
			map.put("msg", "上传文件不能为空");
		} else {
			String originalFilename = myfile.getOriginalFilename();
			try {
				String newFileName = MyUtil.getUUID()+originalFilename.substring(originalFilename.indexOf("."), originalFilename.length());
				String path = "D:/upload/";
				File newFile = new File(path+newFileName);
				if(!newFile.exists()){
					newFile.createNewFile();
				}
 				myfile.transferTo(new File(path+newFileName));
 				
 				String filename = path+newFileName;
 				Workbook workbook = this.readExcel(filename);
 				Sheet sheet = workbook.getSheetAt(0);
 				int rowCount = sheet.getPhysicalNumberOfRows();
 				Row row = null;
 				Cell cell = null;
 				List<String> strlist = new ArrayList<String>();
 				for(int i=0;i<rowCount;i++){
 					row = sheet.getRow(i);
 					if(row==null){
 						continue;
 					}
 					cell = row.getCell(0);	
 					String cellVal = cell.getStringCellValue();
 					if(StringUtils.isEmpty(cellVal)){
 						continue;
 					}
 					strlist.add(cellVal);
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
	        InputStream input = null;  //建立输入流
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
	        }catch (Exception e) {
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
	


}
