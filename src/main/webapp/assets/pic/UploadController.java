package com.ssm.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.ssm.util.MyUtil;

@Controller
@RequestMapping("/upload")
public class UploadController {
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
}
