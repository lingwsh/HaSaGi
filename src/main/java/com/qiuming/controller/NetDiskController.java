package com.qiuming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NetDiskController {

	@ResponseBody
	@RequestMapping(value="framework")
	public Object testFramework(){
		
		return "success";
	}
}
