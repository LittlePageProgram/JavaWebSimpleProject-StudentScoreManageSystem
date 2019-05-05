package com.littlepage.service;

import java.util.List;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Student;

public class SearchStudentService {
	public static Student searchBySnum(String snum) {
		List<Student> li=HibernateUtilsPool.hibernateStudent.getAll(new Student());
		for (Student student : li) {
			if(snum.equals(student.getSnum())) return student;
		}
		return null;
	}
}
