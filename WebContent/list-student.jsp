<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>

</head>
<body style="background-color:hsl(0, 0%, 90%);">
	<%
List<Student> students=AppDAO.listStudent();
request.setAttribute("stulist", students);
PrintWriter pw = response.getWriter();

pw.println("<html><body>");
pw.println("<table>");
pw.println("<tr>");
pw.println("<th>Student ID---------- </th>");
pw.println("<th>Student Name </th>");
pw.println("</tr>");


for(Student s:students)
{

	
	pw.println("<tr>");

	pw.println("<td>"+s.getId()+"<td>");
	pw.println("<td>"+s.getFname()+"<td>");
	pw.println("</tr>");
	
	
}



pw.println("</table>");
pw.println("</body></html>");
%>
<Button onclick="location.href='admin.jsp'">Click here for home page</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='add-student.jsp'">Click here to add another Student</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>