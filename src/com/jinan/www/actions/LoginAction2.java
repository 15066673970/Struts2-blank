package com.jinan.www.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.jinan.www.daoimpl.UserDaoImpl;
import com.jinan.www.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import sun.misc.BASE64Encoder;

public class LoginAction2 extends ActionSupport {
	/**
	 * 
	 */
	UserDaoImpl userDaoImpl = new UserDaoImpl();
	private static final long serialVersionUID = 1L;
  public static final String MESSAGE = "LoginSuccess.message";
	private String username;
	private String password;
	private String message;
	
	

	@Override
	public String execute() throws Exception {
		System.out.println("username="+username);
		BASE64Encoder encoder = new BASE64Encoder();
		password = encoder.encode(password.getBytes("UTF-8"));
		System.out.println("password="+password);
		User user = userDaoImpl.findByUsernameAndPassword(username, password);
		if(user!=null) {
//		if(getPassword().equals("111111")&&getUsername().equals("zs")) {
			String loginMsg = "欢迎你，"+username;
			ActionContext actionContext  = ActionContext.getContext();
			actionContext.put("loginMsg",loginMsg);
			
			setMessage(getText(MESSAGE));
			return SUCCESS;
			/**
			 * 
			 * 在action里面往前台传递参数的方式二获取actionContext对象
			 * 
			ActionContext actionContext  = ActionContext.getContext();
			actionContext.put("loginMsg",loginMsg);
			
			setMessage(getText(MESSAGE));
			return SUCCESS;
			*/
		}
		ActionContext actionContext  = ActionContext.getContext();
		actionContext.put("errorMsg", "登录失败");
		return ERROR;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) { 
		System.out.println("-------");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("======");
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
