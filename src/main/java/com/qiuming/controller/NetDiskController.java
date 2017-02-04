package com.qiuming.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiuming.dao.CommentNoteDao;
import com.qiuming.entity.CommentNote;
import com.qiuming.entity.TestBean;

@Controller
public class NetDiskController {

//	@Autowired
//	CommentNoteDao cnDao;
	
	@ResponseBody
	@RequestMapping(value="framework")
	public Object testFramework(){
//		CommentNote note = cnDao.selectByPrimaryKey(1);
//		return note;
		return "sss";
	}
	
}
