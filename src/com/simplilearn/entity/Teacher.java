package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iam_teacher")
public class Teacher {
@Id
@GeneratedValue
@Column(name="teacher_id")
private int tid;

@Column(name="teacher_fname")
private String tfname;



public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}

public String getTfname() {
	return tfname;
}

public void setTfname(String tfname) {
	this.tfname = tfname;
}



}
