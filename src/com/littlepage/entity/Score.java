package com.littlepage.entity;
/**
 * Entity Score Table
 * scid             主键
 * clazz            科目
 * score            成绩
 * time             学年
 */
public class Score {
	private int scid;
	private String subject;
	private int score;
	private String time;
	private int isRetake;
	public Score() {}
	public Score(int scid, String subject, int score, String time, int isRetake) {
		super();
		this.scid = scid;
		this.subject = subject;
		this.score = score;
		this.time = time;
		this.isRetake = isRetake;
	}
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getIsRetake() {
		return isRetake;
	}
	public void setIsRetake(int isRetake) {
		this.isRetake = isRetake;
	}
	@Override
	public String toString() {
		return "Score [scid=" + scid + ", subject=" + subject + ", score=" + score + ", time=" + time + ", isRetake="
				+ isRetake + "]";
	}
}
