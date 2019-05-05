package com.littlepage.entity;
/**
 * Entity Administrator Table
 * aid      主键（自增）
 * anum     管理员工号
 * name     姓名
 * age      年龄
 * password 密码
 */
public class Administrator {
	private int aid;
	private String anum;
	private String name;
	private int age;
	private String password;
	public Administrator() {
	}
	public Administrator(int aid, String anum, String name, int age, String password) {
		super();
		this.aid = aid;
		this.anum = anum;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
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
	@Override
	public String toString() {
		return "Administrator [aid=" + aid + ", anum=" + anum + ", name=" + name + ", age=" + age + ", password="
				+ password + "]";
	}
}
