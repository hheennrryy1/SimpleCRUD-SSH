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
			addFieldError("stuInfo.name", "姓名输入不合法!");
		}
		if (!String.valueOf(stuInfo.getAge()).matches("[1-9][0-9]{0,1}")) {
			addFieldError("stuInfo.age", "年龄值非法!");
		}
		if (stuInfo.getWeight() > 250) {
			addFieldError("stuInfo.weight", "体重值非法! ");
		}
	}
	
	public String execute() throws Exception {
		studentService.updateStuInfo(stuInfo);
		message = "修改成功!";
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
