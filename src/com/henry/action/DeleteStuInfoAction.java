package com.henry.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.henry.entity.StudentInfo;
import com.henry.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("deleteStuInfoAction")
public class DeleteStuInfoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String message;
	private StudentInfo stuInfo;

	@Autowired
	private StudentService studentService;
	
	public String execute() throws Exception {
		studentService.remove(stuInfo);
		message = "É¾³ý³É¹¦!";
		return "success";
	}
	
	
	public StudentInfo getStuInfo() {
		return stuInfo;
	}
	
	
	public void setStuInfo(StudentInfo stuInfo) {
		this.stuInfo = stuInfo;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
