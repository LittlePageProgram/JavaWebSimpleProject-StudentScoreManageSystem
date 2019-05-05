package com.littlepage.entity;
/**
 * Entity Student Table
 * private int sid;
	private String snum;
	private String name;
	private int age;
	private String clazz;
	private String nativePlace;
	private String password;
	private String subjectId;
 */
public class Student {
	private int sid;
	private String snum;
	private String name;
	private int age;
	private String clazz;
	private String nativePlace;
	private String password;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String snum, String name, int age, String clazz, String nativePlace, String password) {
		super();
		this.sid = sid;
		this.snum = snum;
		this.name = name;
		this.age = age;
		this.clazz = clazz;
		this.nativePlace = nativePlace;
		this.password = password;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
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
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snum=" + snum + ", name=" + name + ", age=" + age + ", clazz=" + clazz
				+ ", nativePlace=" + nativePlace + ", password=" + password + "]";
	}
}
