package com.mightyjava.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mightyjava.service.UserService;

@Singleton
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = -416566523583300983L;
	
	@Inject
	private UserService userService;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		response.getWriter().println("User Name : " + userName + " and Password : " + password + " Status :"
				+ userService.authenticate(userName, password));
	}
}
