package com.simplilearn.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iam_assign")
public class Assign {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="class_id")
	private String classID;
	
	@Column(name="subject1_id")
	private String subject1ID;
	
	@Column(name="teacher_id")
	private String teacherID;
	
	@Column(name="student_id")
	private String studentID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	public String getSubject1ID() {
		return subject1ID;
	}

	public void setSubject1ID(String subject1id) {
		subject1ID = subject1id;
	}
	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Assign(int id, String classID, String subject1id, String subject2id, String subject3id, String subject4id,
			String teacherID, String studentID) {
		super();
		this.id = id;
		this.classID = classID;
		subject1ID = subject1id;
		
		this.teacherID = teacherID;
		this.studentID = studentID;
	}

	public Assign() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
