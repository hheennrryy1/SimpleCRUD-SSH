package com.henry.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.henry.entity.StudentInfo;
import com.henry.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("findStuInfoAction")
public class FindStuInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private StudentInfo stuInfo;
	@Autowired
	private StudentService studentService;
	
	@Override
	public void validate() {
		this.clearFieldErrors();
		stuInfo = studentService.findStuInfoById(stuInfo.getId());
		if(stuInfo==null) {
			this.addFieldError("stuInfo.id", "Ñ§ºÅ²»´æÔÚ!");
		}
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	public String executeDelete() throws Exception {
		return "success";
	}
	
	
	public StudentInfo getStuInfo() {
		return stuInfo;
	}
	
	public void setStuInfo(StudentInfo stuInfo) {
		this.stuInfo = stuInfo;
	}
}
