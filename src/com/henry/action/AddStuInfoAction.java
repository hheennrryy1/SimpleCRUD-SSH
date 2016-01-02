package com.henry.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.henry.entity.StudentInfo;
import com.henry.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("addStuInfoAction")
public class AddStuInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private StudentInfo stuInfo;
	@Autowired
	private StudentService studentService;

	public void validate() {
		this.clearFieldErrors();
		if (!stuInfo.getId().matches("[0-9]{4,}")) {
			addFieldError("stuInfo.id", "学号输入不合法!");
		} 
		if(studentService.findStuInfoById(stuInfo.getId()) != null) {
			addFieldError("stuInfo.id", "学号不能重复!");
		}
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
		studentService.saveInfo(stuInfo);
		return "success";
	}
	
	
	public StudentInfo getStuInfo() {
		return stuInfo;
	}
	
	public void setStuInfo(StudentInfo stuInfo) {
		this.stuInfo = stuInfo;
	}
}
