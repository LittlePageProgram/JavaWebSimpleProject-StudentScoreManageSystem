package com.littlepage.service;

import java.util.List;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Student;

public class AddStudentService {
	/**
	 * deal with the info of student
	 * @param sNum
	 * @param sName
	 * @param sAge
	 * @param sClass
	 * @param nativePlace
	 * @return 0 is insert into database success, 1 if exist the students info and -1 if info not fit the string rules
	 */
	public static int dealWith(String sNum,String sName,String sAge,String sClass,String nativePlace) {
		if(sNum!=null&&sNum.matches("\\d+")&&sName!=null&&sAge!=null&&sAge.matches("\\d+")&&sClass!=null&&nativePlace!=null) {
			Student student=new Student(0, sNum, sName, Integer.parseInt(sAge), sClass, nativePlace, sNum);
			List<Student> list=HibernateUtilsPool.hibernateStudent.getAll(student);
			for (Student student2 : list) {
				if(student2.getSnum().equals(sNum)) return 1;
			}
			HibernateUtilsPool.hibernateStudent.add(student);
			return 0;
		}
		return -1;
	}
}
