package com.iotu.onlineexam.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotu.onlineexam.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private IUserService userService;
}
