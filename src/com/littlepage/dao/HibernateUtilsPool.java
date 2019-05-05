package com.littlepage.dao;

/**
 * Copyright (c) 2019 Shanghai University of Electric Power
 * @function: The instance is a pool that we do not new hibernate entity repeat
 * @author:Little Page
 * @version:1.0
 */

import com.littlepage.entity.*;

public class HibernateUtilsPool {
	public static HibernateUtils<Student> hibernateStudent=new HibernateUtils<>();
	public static HibernateUtils<Teacher> hibernateTeacher=new HibernateUtils<>();
	public static HibernateUtils<Administrator> hibernateAdministrator=new HibernateUtils<>();
	public static HibernateUtils<Subject> hibernateSubject=new HibernateUtils<>();
	public static HibernateUtils<Score> hibernateScore=new HibernateUtils<>();
}
