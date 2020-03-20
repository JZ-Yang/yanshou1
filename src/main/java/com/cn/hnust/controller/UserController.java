package com.cn.hnust.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	/*
	 * @RequestMapping("/showUser") public String toIndex(HttpServletRequest
	 * request, Model model) { int userId =
	 * Integer.parseInt(request.getParameter("id")); User user =
	 * this.userService.getUserById(userId); String user1 =
	 * this.userService.getUserById(userId); model.addAttribute("user", user1);
	 * return "showUser"; }
	 */
	@RequestMapping("/showindex")
	public String index(HttpServletRequest request) {
		return "index";
	}

	@RequestMapping("/dologin")
	public String dologin(HttpServletRequest request, Model model) throws UnsupportedEncodingException {

		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ("admin".equals(username) && "admin".equals(password)) {
			return "success";
		} else {
			return "error";
		}
	}

}