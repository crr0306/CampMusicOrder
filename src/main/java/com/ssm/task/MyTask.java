package com.ssm.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;

@Component
public class MyTask {
	

	@Autowired
	private UserMapper userMapper;
/*	
	 @Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
	    public void taskCycle() {
	        //System.out.println("使用SpringMVC框架配置定时任务");
		 
		 User user = userMapper.selectByPrimaryKey("1");
		 
		 
		 System.out.println(user!=null?user.getName():"-------------------");
		 
	    }*/
}
