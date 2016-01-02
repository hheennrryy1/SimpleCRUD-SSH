package com.henry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.henry.DAO.StudentDao;
import com.henry.entity.StudentInfo;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public void saveInfo(StudentInfo stuInfo) {
		studentDao.saveInfo(stuInfo);
	}
	
	public StudentInfo findStuInfoById(String id) {
		return studentDao.findStuInfoById(id);
	}

	public List<StudentInfo> QueryAll() {
		return studentDao.QueryAll();
	}
	
	public void updateStuInfo(StudentInfo stuInfo) {
		studentDao.updateStuInfo(stuInfo);
	}
	
	public void remove(StudentInfo stuInfo) {
		studentDao.remove(stuInfo);
	}
}
