package com.simplilearn.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.entity.*;
import com.simplilearn.entity.Class;

public class HibernateUtil {
static SessionFactory sessionFactory=null;
public static SessionFactory buildSessionFactor()
{
	if (sessionFactory!=null)
	{
		return sessionFactory;
	}
	// step 1 creating configuration object
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class).addAnnotatedClass(Subject.class).addAnnotatedClass(Class.class).addAnnotatedClass(SubjectClass.class).addAnnotatedClass(StudentClass.class).addAnnotatedClass(TeacherClassSubject.class).addAnnotatedClass(Assign.class);
	sessionFactory=cfg.buildSessionFactory();
	return sessionFactory;
	
}
}