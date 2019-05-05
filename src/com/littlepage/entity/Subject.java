package com.littlepage.entity;
/**
 * Entity Subject Table
 *
 */
public class Subject {
	private int subjectId;
	private String snum;
	private String sname;
	private String scid;
	private int studyScore;
	public Subject() {}
	public Subject(int subjectId, String snum, String sname, String scid, int studyScore) {
		super();
		this.subjectId = subjectId;
		this.snum = snum;
		this.sname = sname;
		this.scid = scid;
		this.studyScore = studyScore;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScid() {
		return scid;
	}
	public void setScid(String scid) {
		this.scid = scid;
	}
	public int getStudyScore() {
		return studyScore;
	}
	public void setStudyScore(int studyScore) {
		this.studyScore = studyScore;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", snum=" + snum + ", sname=" + sname + ", scid=" + scid
				+ ", studyScore=" + studyScore + "]";
	}
}
