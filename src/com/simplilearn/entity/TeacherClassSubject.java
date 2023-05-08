package com.simplilearn.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TeacherClassSubject_05052023")
public class TeacherClassSubject {

	@Id
	@GeneratedValue
	@Column(name="TeacherClassSubject_id")
	private int tcscid;

	@Column(name="teacher_name")
	private String teacherscname;
	
	@Column(name="Class_name")
	private String tsclassname;
	
	@Column(name="subjectS1_name")
	private String tcsubject1name;
	
	@Column(name="subjectS2_name")
	private String tcsubject2name;
	
	@Column(name="subjectS3_name")
	private String tcs3ubjectname;

	public int getTcscid() {
		return tcscid;
	}

	public void setTcscid(int tcscid) {
		this.tcscid = tcscid;
	}

	public String getTeacherscname() {
		return teacherscname;
	}

	public void setTeacherscname(String teacherscname) {
		this.teacherscname = teacherscname;
	}

	public String getTsclassname() {
		return tsclassname;
	}

	public void setTsclassname(String tsclassname) {
		this.tsclassname = tsclassname;
	}

	public String getTcsubject1name() {
		return tcsubject1name;
	}

	public void setTcsubject1name(String tcsubject1name) {
		this.tcsubject1name = tcsubject1name;
	}

	public String getTcsubject2name() {
		return tcsubject2name;
	}

	public void setTcsubject2name(String tcsubject2name) {
		this.tcsubject2name = tcsubject2name;
	}

	public String getTcs3ubjectname() {
		return tcs3ubjectname;
	}

	public void setTcs3ubjectname(String tcs3ubjectname) {
		this.tcs3ubjectname = tcs3ubjectname;
	}
	
	
	
	
	
}
