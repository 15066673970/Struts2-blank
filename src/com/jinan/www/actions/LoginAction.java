package com.jinan.www.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
    public static final String MESSAGE = "LoginSuccess.message";
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		setMessage(getText(MESSAGE));
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	
	
	
}
