package com.henry.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.henry.entity.StudentInfo;

@Repository
public class StudentDao {
	private SessionFactory sessionFactory;
	
	@Autowired
	public StudentDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveInfo(StudentInfo stuInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(stuInfo);
	}

	public StudentInfo findStuInfoById(String id) {
		Session session = sessionFactory.getCurrentSession();
		StudentInfo studentInfo = (StudentInfo) session.get(StudentInfo.class, id);
		return studentInfo;
	}
	
	public List<StudentInfo> QueryAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from StudentInfo");
		return query.list();
	}
	
	public void updateStuInfo(StudentInfo stuInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.update(stuInfo);
	}
		
	public void remove(StudentInfo stuInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(stuInfo);
	}
}
