package com.simplilearn.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentClass_05052023")
public class StudentClass {
	@Id
	@GeneratedValue
	@Column(name="studentClass_id")
	private int stcid;

	@Column(name="student_name")
	private String stcname;
	
	@Column(name="class_name")
	private String cstname;

	public int getStcid() {
		return stcid;
	}

	public void setStcid(int stcid) {
		this.stcid = stcid;
	}

	public String getStcname() {
		return stcname;
	}

	public void setStcname(String stcname) {
		this.stcname = stcname;
	}

	public String getCstname() {
		return cstname;
	}

	public void setCstname(String cstname) {
		this.cstname = cstname;
	}
	
	
}
