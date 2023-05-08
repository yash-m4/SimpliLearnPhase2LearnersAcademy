package com.simplilearn.doa;

import java.util.List;

import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.*;
import com.simplilearn.entity.Class;
import com.simplilearn.util.HibernateUtil;

public class AppDAO {
public static void addStudent(Student student){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(student);
	tx.commit();
	session.close();
}

public static List<Student> listStudent(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<Student> students=session.createQuery(" from Student ").list();
	session.close();
	return students;
}


public static void addTeacher(Teacher teacher){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(teacher);
	tx.commit();
	session.close();
}

public static List<Teacher> listTeacher(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<Teacher> teachers=session.createQuery(" from Teacher ").list();
	session.close();
	return teachers;
}

public static void addSubject(Subject subject){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(subject);
	tx.commit();
	session.close();
}

public static List<Subject> listSubject(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<Subject> subjects=session.createQuery(" from Subject ").list();
	session.close();
	return subjects;
}

public static void addClass(Class classs){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(classs);
	tx.commit();
	session.close();
}

public static List<Class> listClass(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<Class> Classss=session.createQuery(" from Class ").list();
	session.close();
	return Classss;
}
public static void addSubjectClass(SubjectClass sclasss){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(sclasss);
	tx.commit();
	session.close();
}

public static List<SubjectClass> listSubjectClass(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<SubjectClass> sClassss=session.createQuery(" from SubjectClass ").list();
	session.close();
	return sClassss;
}

public static void addStudentClasss(StudentClass sstclasss){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(sstclasss);
	tx.commit();
	session.close();
}


public static List<StudentClass> listStudentClass(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<StudentClass> stClassss=session.createQuery(" from StudentClass ").list();
	session.close();
	return stClassss;
}


public static void addTeacherClassSubject(TeacherClassSubject tcs){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(tcs);
	tx.commit();
	session.close();
}

public static List<TeacherClassSubject> listTeacherClassSubject(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<TeacherClassSubject> tcs=session.createQuery(" from TeacherClassSubject ").list();
	session.close();
	return tcs;
}



/**
 * @author Yash
 * @category methods for union table for class assign
 * @param sstclasss
 */
public static void addStudentClass(Assign assign){
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	// step 3 begin transaction
	Transaction tx=session.beginTransaction();
	// step 4 save session
	session.save(assign);
	tx.commit();
	session.close();
}

public static List<Assign> listAssign(){
	
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	//step 3 DB Query
	List<Assign> assign=session.createQuery(" from Assign ").list();
	session.close();
	return assign;
}


public static List<Assign> fetchDetails(String className){
	System.out.println("className"+className);
	String f = "FROM Assign E WHERE E.classID =";
	String a="'";
	String b="'";
	String hql=f+a+className+b;
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	List<Assign> assign = session.createQuery(hql).list();
	for(Assign ab:assign){
		System.out.println(ab.getStudentID());
		System.out.println(ab.getClassID());
	}
	session.close();
	return assign;
}
// to update 

public static  void updateTable(String className,String teache,String sub1){
	System.out.
	println("check1");
	String hql = "UPDATE Assign set subject1ID = 'demo1' , subject2ID = 'demo2'  WHERE classID = 'Demotest'";
	String f = "UPDATE Assign set ";
	String a="'";
	String b="'";
	String d=",";
	String su1="subject1ID =";
	String stu="studentID =";
	String su3="subject3ID =";
	String teach="teacherID =";
	String cla="WHERE classID =";
	String fi=f+su1+a+sub1+b+d+teach+a+teache+b+cla+a+className+b;
	System.out.println("check1   "+fi);
	// step 1 build session factory object
		SessionFactory sf=HibernateUtil.buildSessionFactor();
		// step 2 open session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("check2");
		int result = session.createQuery(fi).executeUpdate();
//		System.out.println("check3");
//		query.setParameter("subject1ID", sub1);
//		System.out.println("check4");
//		query.setParameter("classID", className);
		System.out.println("check5");
		System.out.println("check6");
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
}
// for adding student to class 

public static  void updateTable(String className,String student){
	System.out.
	println("check1");
	String hql = "UPDATE Assign set subject1ID = 'demo1' , subject2ID = 'demo2'  WHERE classID = 'Demotest'";
	String f = "UPDATE Assign set ";
	String a="'";
	String b="'";
	String d=",";
	String stu="studentID =";
	String cla="WHERE classID =";
	String fi=f+stu+a+student+b+cla+a+className+b;
	System.out.println("check1   "+fi);
	// step 1 build session factory object
		SessionFactory sf=HibernateUtil.buildSessionFactor();
		// step 2 open session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("check2");
		int result = session.createQuery(fi).executeUpdate();
//		System.out.println("check3");
//		query.setParameter("subject1ID", sub1);
//		System.out.println("check4");
//		query.setParameter("classID", className);
		System.out.println("check5");
		System.out.println("check6");
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
}
// assign clas and subject  
public static  void updateTable2(String className,String subject ){
	System.out.
	println("check1");
	String hql = "UPDATE Assign set subject1ID = 'demo1' , subject2ID = 'demo2'  WHERE classID = 'Demotest'";
	String f = "UPDATE Assign set ";
	String a="'";
	String b="'";
	String d=",";
	String stu="subject1ID =";
	String cla="WHERE classID =";
	String fi=f+stu+a+subject+b+cla+a+className+b;
	System.out.println("check1   "+fi);
	// step 1 build session factory object
		SessionFactory sf=HibernateUtil.buildSessionFactor();
		// step 2 open session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("check2");
		int result = session.createQuery(fi).executeUpdate();
//		System.out.println("check3");
//		query.setParameter("subject1ID", sub1);
//		System.out.println("check4");
//		query.setParameter("classID", className);
		System.out.println("check5");
		System.out.println("check6");
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
}

/**
 * @author Yash Mishra
 * @see method to check duplicate 
 */

public static List<Assign> checkDuplicate (String className,String student,String teacher,String subject){
	System.out.println("className"+className);
	String f = "FROM Assign E WHERE E.classID =";
	String a="'";
	String b="'";
	String d=" and ";
	String stu=" E.studentID =";
	String tech=" E.teacherID =";
	String sub=" E.subject1ID =";
	String hql=f+a+className+b+d+stu+a+student+b+d+tech+a+teacher+b+d+sub+a+subject+b;
	// step 1 build session factory object
	SessionFactory sf=HibernateUtil.buildSessionFactor();
	// step 2 open session
	Session session=sf.openSession();
	List<Assign> assign = session.createQuery(hql).list();
	for(Assign ab:assign){
		System.out.println(ab.getStudentID());
		System.out.println(ab.getClassID());
	}
	session.close();
	return assign;
}
}
