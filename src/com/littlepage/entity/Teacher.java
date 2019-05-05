package com.littlepage.entity;
/**
 * Entity Teacher Table
 * tid         主键（自增）
 * tnum        教师工号
 * name        姓名
 * age         年龄
 * password    密码（默认为学号）
 * subjectId    所教班级外键表
 */
public class Teacher {
	private int tid;
	private String tnum;
	private String name;
	private int age;
	private String password;
	private String subjectId;
	public Teacher() {
	}
	public Teacher(int tid, String tnum, String name, int age, String password, String subjectId) {
		super();
		this.tid = tid;
		this.tnum = tnum;
		this.name = name;
		this.age = age;
		this.password = password;
		this.subjectId = subjectId;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTnum() {
		return tnum;
	}
	public void setTnum(String tnum) {
		this.tnum = tnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tnum=" + tnum + ", name=" + name + ", age=" + age + ", password=" + password
				+ ", subjectId=" + subjectId + "]";
	}
}
