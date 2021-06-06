package com.ssm.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.ssm.po.User;
import com.ssm.po.Word;
import com.ssm.service.UserService;
import com.ssm.service.WordService;
import com.ssm.util.Doc2Html;
import com.ssm.util.MyUtil;

@Controller
@RequestMapping("/upload")
public class UploadController {
	@Autowired
    private WordService wordService;  
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
	public void devDoc(@RequestParam("path")String path,HttpServletResponse response) throws Exception {

	String fileNamepath = path;
	String fileName = fileNamepath.substring(0, fileNamepath.lastIndexOf("."));
	String suffix=fileNamepath.substring(fileNamepath.lastIndexOf(".")+1);
	InputStream input=null;
	OutputStream out=null;
	if(suffix!=null&&!"".equals(suffix)) {
	if("docx".equals(suffix)) {
	//InputStream inputStream = new ByteArrayInputStream(new File("").);
	// File docFile = FileTObyte.byte2File(a, "E:\\" + fileNamepath, fileName);
	
	Doc2Html.docx2Html("D:/upload/"+fileNamepath,"D:/upload/" + fileName+".html");
	input=new FileInputStream("D:/upload/" + fileName+".html");
	response.setContentType("text/html;charset=UTF-8");//解决页面显示乱码 
	out = response.getOutputStream();
	}else if("doc".equals(suffix)) {
	//InputStream inputStream = new ByteArrayInputStream(a);
	// File docFile = FileTObyte.byte2File(a, "E:\\" + fileNamepath, fileName);
	Doc2Html.doc2Html("D:/upload/"+fileNamepath,"D:/upload/" + fileName+".html");
	input=new FileInputStream("D:/upload/" + fileName+".html"); 
	response.setContentType("text/html;charset=UTF-8");//解决页面显示乱码 
	out = response.getOutputStream();
	}
	else {
	/*input=new ByteArrayInputStream(a);
	response.setContentType("application/pdf");
	out = response.getOutputStream();*/
	}
	}
	byte[] b = new byte[512];
	if(out!=null) {
	if(input!=null) {
	while ((input.read(b))!=-1) {
	out.write(b);
	}
	}else {
	System.out.println("InputStream为空。。。");
	}
	}else {
	System.out.println("OutputStream为空。。。");
	}

	out.flush();
	input.close();
	out.close();
	}
	
	
	@RequestMapping(value = "downloadFile", method = RequestMethod.GET)
    @ResponseBody
    public void downloadFile(HttpServletRequest req, HttpServletResponse resp, @RequestParam("id") String id) {
		Word word = wordService.getWordById(id);
		User user = new User();
		user.setId(word.getCreateuserid());
		user.setIntegral(word.getIntegral());
		userService.addintegral(user);
		
		
		User user2 = (User) req.getSession().getAttribute("login_user");
	    if(user2!=null){
	    	User user3 = new User();
			user3.setId(user2.getId());
			user3.setIntegral(word.getIntegral());
			userService.minusintegral(user3);
	    }
	    
		download(resp,id);

	}

	/**
     * @param resp
     * @param name         文件真实名字
     * @param downloadName 文件下载时名字
     */
    public  void download(HttpServletResponse resp, String id) {
    	Word word = wordService.getWordById(id);
       /* String fileName = null;
        try {
            fileName = new String(downloadName.getBytes("GBK"), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
//        String realPath=File.separator+"home"+File.separator+"tomcat"+File.separator+"apache-tomcat-9.0.1"+File.separator+"files";
        String path = "D:/upload/"+word.getPath();
        File file = new File(path);
        resp.reset();
        resp.setContentType("application/octet-stream");
        resp.setCharacterEncoding("utf-8");
        resp.setContentLength((int) file.length());
        resp.setHeader("Content-Disposition", "attachment;filename=" + word.getPath());
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


}
