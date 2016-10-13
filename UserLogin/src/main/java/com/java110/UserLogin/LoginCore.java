package com.java110.UserLogin;

import java.util.Map;

/**
 * 用户登录
 * @author admin
 *
 */
public class LoginCore {
	
	
	/**
	 * 校验用户信息
	 * @param info
	 * @return
	 */
	public Boolean judgeUserInfo(Map info){
		if(info == null ){
			return false;
		}
		String username = info.get("username") == null ? "" : info.get("username").toString();
		String pwd = info.get("pwd") == null ? "" : info.get("pwd").toString();
		
		if("admin".equals(username)&& "admin123".equals(pwd)){
			return true;
		}
		
		return false;
	}

}
