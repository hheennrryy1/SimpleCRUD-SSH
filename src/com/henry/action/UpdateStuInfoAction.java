package com.henry.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.henry.entity.StudentInfo;
import com.henry.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("updateStuInfoAction")
public class UpdateStuInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private StudentInfo stuInfo;
	private String message;
	@Autowired
	private StudentService studentService;
	
	public void validate() {
		this.clearFieldErrors();
		if (!stuInfo.getName().matches("[\u4E00-\u9FA5]{2,4}")) {
			addFieldError("stuInfo.name", "�������벻�Ϸ�!");
		}
		if (!String.valueOf(stuInfo.getAge()).matches("[1-9][0-9]{0,1}")) {
			addFieldError("stuInfo.age", "����ֵ�Ƿ�!");
		}
		if (stuInfo.getWeight() > 250) {
			addFieldError("stuInfo.weight", "����ֵ�Ƿ�! ");
		}
	}
	
	public String execute() throws Exception {
		studentService.updateStuInfo(stuInfo);
		message = "�޸ĳɹ�!";
		return "success";
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public StudentInfo getStuInfo() {
		return stuInfo;
	}
	
	public void setStuInfo(StudentInfo stuInfo) {
		this.stuInfo = stuInfo;
	}
}
