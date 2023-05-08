<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="com.simplilearn.entity.Assign"%>
<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.TeacherClassSubject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Addes</title>
</head>
<body style="background-color:hsl(0, 0%, 90%);">
<%
String teacher=request.getParameter("Teacher2");
String klass=request.getParameter("Class2");
String subject=request.getParameter("Subject21");
String student=request.getParameter("Student");
System.out.println("klass,student,teacher,subject "+klass +student +teacher +subject);

/* TeacherClassSubject tsc=new TeacherClassSubject();
tsc.setTeacherscname(Teacher2);
tsc.setTsclassname(Class2);
tsc.setTcsubject1name(Subject21);
tsc.setTcsubject2name(Subject22);
tsc.setTcs3ubjectname(Subject23); */
//List<Assign> asignList=AppDAO.fetchDetails(Class2);

List<Assign> checkList=AppDAO.checkDuplicate(klass,student,teacher,subject);
PrintWriter pw = response.getWriter();
if(checkList.isEmpty()){
	 Assign assign=new Assign();
	 assign.setClassID(klass);
	 assign.setTeacherID(teacher);
	 assign.setSubject1ID(subject);
	 assign.setStudentID(student);
	 AppDAO.addStudentClass(assign);
	 pw.println("<div>");
		pw.println("<h1> Data  Submitted Succesfully</h1>");
		pw.println("</div>");
}else{
	
	pw.println("<div>");
	pw.println("<h1> Data Already Submitted </h1>");
	pw.println("</div>");
}
// AppDAO.addTeacherClassSubject(tsc); */
// response.sendRedirect("assign-teacher-classs-subject-list.jsp");

%>
<br/><br/>
<Button onclick="location.href='assign-techer-class-subject.jsp'">Assign Another</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='admin.jsp'">Go to Main Menu</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>