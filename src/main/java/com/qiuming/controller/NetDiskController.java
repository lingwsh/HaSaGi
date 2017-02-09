package com.qiuming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiuming.dao.HsgUserDao;
import com.qiuming.entity.HsgUser;

@Controller
public class NetDiskController {

	@Autowired
	HsgUserDao userDao;
	
	@ResponseBody
	@RequestMapping(value="framework")
	public Object testFramework(){
		HsgUser user = userDao.get(1l);
		return user;
	}
	
}
