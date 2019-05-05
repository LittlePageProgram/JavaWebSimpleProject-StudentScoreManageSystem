package com.littlepage.dao;

/**
 * Copyright (c) 2019 Shanghai University of Electric Power
 * @function: curd any entity you want, introducing the entity to the generic
 * then you can complete crud
 * @author:Little Page
 * @version:1.0
 */

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils<T> {
	public static void reloadTables() {
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        sf.close();
	}
	
	public void add(T t) {
		Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
        session.save(t);
        ts.commit();
        sf.close();
	}
	
	public void modify(T t) {
		Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
        session.update(t);
        ts.commit();
        session.close();
        sf.close();
	}
	
	public void delete(T t) {
		Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
        session.delete(t);
        ts.commit();
        session.close();
        sf.close();
	}
	
	public List<T> getAll(T t) {
		//t's className, for query
		String clazzName=t.getClass().toString();
		clazzName=clazzName.substring(clazzName.lastIndexOf('.')+1, clazzName.length());
		//query start
		Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
        String hql="from "+clazzName;
        Query query=session.createQuery(hql);
        @SuppressWarnings("unchecked")
		List<T> list=query.list();
        ts.commit();
        session.close();
        sf.close();
        return list;
	}
}
