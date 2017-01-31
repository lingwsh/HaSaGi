package com.qiuming.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiuming.entity.TestBean;

@Controller
public class NetDiskController {

	@ResponseBody
	@RequestMapping(value="framework")
	public Object testFramework(TestBean tb){
		
		return tb;
	}
	
}
