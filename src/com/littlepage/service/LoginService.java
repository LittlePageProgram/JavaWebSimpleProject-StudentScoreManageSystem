package com.littlepage.service;

import java.util.List;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Administrator;
import com.littlepage.entity.Student;
import com.littlepage.entity.Teacher;

public class LoginService {
	public static int dealWith(String loginName, String password) {
		List<Administrator> adminArr=HibernateUtilsPool.hibernateAdministrator.getAll(new Administrator());
		for (Administrator administrator : adminArr) {
			if(administrator.getAnum().equals(loginName)&&administrator.getPassword().equals(password)) return 1;
		}
		List<Teacher> teaArr=HibernateUtilsPool.hibernateTeacher.getAll(new Teacher());
		for (Teacher teacher : teaArr) {
			if(teacher.getTnum().equals(loginName)&&teacher.getPassword().contentEquals(password)) return 2;
		}
		List<Student> stuArr=HibernateUtilsPool.hibernateStudent.getAll(new Student());
		for (Student student : stuArr) {
			if(student.getSnum().equals(loginName)&&student.getPassword().equals(password)) return 3;
		}
		return -1;
	}
}
