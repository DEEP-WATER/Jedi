package com.jedi.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jedi.bean.User;
import com.jedi.service.IUserService;



@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("/addUser")    
    public String addUser(HttpServletRequest request,Model model){    
        User user = new User(); 
        user.setId(String.valueOf(request.getParameter("id")));    
        user.setName(String.valueOf(request.getParameter("name")));    
        userService.addUser(user);    
        return "redirect:/user/userList";    
    }  
	
}
