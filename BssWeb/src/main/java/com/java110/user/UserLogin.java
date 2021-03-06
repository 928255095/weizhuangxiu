package com.java110.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java110.UserLogin.LoginCore;

/**
 * 用户登录
 * @author admin
 *
 */
public class UserLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		Map<String,String> info = new HashMap<String,String>();
		info.put("username", username);
		info.put("pwd", pwd);
		LoginCore loginCore = new LoginCore();
		//校验用户信息
		if(loginCore.judgeUserInfo(info)){
			req.getRequestDispatcher("/html/success.jsp").forward(req, resp);
			return;
		}
		resp.sendRedirect("/html/error.html");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

}
