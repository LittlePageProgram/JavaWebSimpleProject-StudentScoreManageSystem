package com.littlepage.service;

import java.util.List;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Student;

public class ModifyStudentService {
	//some problems happened
	public static boolean modifyBySnum(Student student) {
		//search it
		List<Student> list=HibernateUtilsPool.hibernateStudent.getAll(student);
		for (Student student2 : list) {
			//verify
			if(student2.getSnum().equals(student.getSnum())) {
				HibernateUtilsPool.hibernateStudent.modify(student);
				return true;
			}
		}
		return false;
	}
}
