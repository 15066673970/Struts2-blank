package com.jinan.www.actions;

import com.jinan.www.entity.Student;
import com.jinan.www.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class TestParameterPassingMethod1 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private User user;
	private Student student;
	@Override
	public String execute() throws Exception {
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
		if(user.getUsername().equals("admin")) {
			return SUCCESS;
			
		}
		return ERROR;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
