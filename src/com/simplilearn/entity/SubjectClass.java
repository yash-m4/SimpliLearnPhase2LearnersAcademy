package com.simplilearn.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjectClass_05052023")
public class SubjectClass {
	
	@Id
	@GeneratedValue
	@Column(name="subjectClass_id")
	private int scid;

	@Column(name="subjectClass_name")
	private String scname;
	
	@Column(name="subjectS1_name")
	private String s1name;
	
	@Column(name="subjectS2_name")
	private String s2name;
	
	@Column(name="subjectS3_name")
	private String s3name;

	public int getScid() {
		return scid;
	}

	public void setScid(int scid) {
		this.scid = scid;
	}

	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public String getS1name() {
		return s1name;
	}

	public void setS1name(String s1name) {
		this.s1name = s1name;
	}

	public String getS2name() {
		return s2name;
	}

	public void setS2name(String s2name) {
		this.s2name = s2name;
	}

	public String getS3name() {
		return s3name;
	}

	public void setS3name(String s3name) {
		this.s3name = s3name;
	}

	
	
}
