package com.littlepage.service;

import java.util.List;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Administrator;

public class SearchAdminService {
	public static Administrator searchByAnum(String anum) {
		List<Administrator> li=HibernateUtilsPool.hibernateAdministrator.getAll(new Administrator());
		for (Administrator administrator : li) {
			if(anum.equals(administrator.getAnum())) {
				return administrator;
			}
		}
		return null;
	}
}
