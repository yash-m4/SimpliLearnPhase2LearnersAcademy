<%@page import="com.simplilearn.entity.Student"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Class"%>
<%@page import="com.simplilearn.entity.Subject"%>
<%@page import="com.simplilearn.entity.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#hlw{
height: 1cm;
width: 6cm;
font-size:0.35cm ;
text-align: center;
border-radius: 5px;

}
#submit{
height: 1cm;
width: 3cm;
color: white;
background-color: red;
margin-left: 3.5cm;
border-color: red;
border-radius: 5px;
font-size: 0.6cm;
}
</style>
</head>
<body style="background-color:hsl(0, 0%, 90%);">
<%
List<Class> classs=AppDAO.listClass();
request.setAttribute("clist", classs);

List<Subject> subjects=AppDAO.listSubject();
request.setAttribute("slist", subjects);

List<Teacher> teachers=AppDAO.listTeacher();
request.setAttribute("tlist", teachers);

List<Student> students=AppDAO.listStudent();

PrintWriter pw = response.getWriter();


pw.println("<h3 style='font-family: monospace;'> Assign Teacher to a Class for Subjects </h3>");

pw.println("<br/>");

pw.println("<div>");
pw.println("<form method=post action =assign-teacher-class-subject-submit.jsp>");

String style="style=text-align: center;";

pw.println("<select name=Teacher2 id='hlw'>");
pw.println("<option style='text-align: center;'>Select Teacher</option>");
for(Teacher t:teachers)
{
	pw.println("<option "+style+">"+ t.getTfname()+"</option>");
	
}
pw.println("</select>");

pw.println("<select name=Student id='hlw'>");
pw.println("<option>Select Student</option>");
for(Student s:students)
{
	pw.println("<option>"+ s.getFname()+"</option>");
	
}
pw.println("</select>");


pw.println("<div>");

pw.println("<select name=Class2 id='hlw'>");
pw.println("<option>Select Class</option>");
for(Class c:classs)
{
	pw.println("<option>"+ c.getCname()+"</option>");
	
}
pw.println("</select>");


pw.println("<select name=Subject21 id='hlw'>");
pw.println("<option>Select Subject</option>");
for(Subject s:subjects)
{
	pw.println("<option>"+ s.getSname()+"</option>");
	
}
pw.println("</select >");
pw.println("<br><br>");
pw.println("<input type=submit value=Submit id='submit'>");
pw.println("</form>");
pw.println("</div>");

%>
</body>
</html>