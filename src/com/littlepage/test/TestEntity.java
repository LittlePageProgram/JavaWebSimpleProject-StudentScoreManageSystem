package com.littlepage.test;

import com.littlepage.dao.HibernateUtils;
import com.littlepage.entity.Administrator;

public class TestEntity {
	public static void main(String[] args) {
		HibernateUtils.reloadTables();
	}
}
