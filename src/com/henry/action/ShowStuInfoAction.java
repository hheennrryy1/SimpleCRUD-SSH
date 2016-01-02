package com.henry.action;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.henry.entity.StudentInfo;
import com.henry.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("showStuInfoAction")
public class ShowStuInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	List<StudentInfo> stuInfos;
	private int size;
	@Autowired
	private StudentService studentService;
	
	public String execute() throws Exception {
		stuInfos = studentService.QueryAll();
		size = stuInfos.size();
		return "success";
	}
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public List<StudentInfo> getStuInfos() {
		return stuInfos;
	}
	
	public void setStuInfos(List<StudentInfo> stuInfos) {
		this.stuInfos = stuInfos;
	}
}
