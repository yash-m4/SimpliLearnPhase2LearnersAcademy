<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.TeacherClassSubject"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<TeacherClassSubject> teachersclasssub=AppDAO.listTeacherClassSubject();
request.setAttribute("tsclist", teachersclasssub);


PrintWriter pw = response.getWriter();
pw.println("<html><body>");
pw.println("<table>");
pw.println("<tr>");
pw.println("<th> ID </th>");
pw.println("<th>Teacher name </th>");
pw.println("<th>Class</th>");
pw.println("<th>Subject1</th>");
pw.println("<th>Subject2</th>");
pw.println("<th>Subject3</th>");
pw.println("</tr>");


for(TeacherClassSubject tsc:teachersclasssub)
{
	pw.println("<tr>");
	pw.println("<td>"+tsc.getTcscid()+"<td>");
	pw.println("<td>"+tsc.getTeacherscname()+"<td>");
	pw.println("<td>"+tsc.getTsclassname()+"<td>");
	pw.println("<td>"+tsc.getTcsubject1name()+"<td>");
	pw.println("<td>"+tsc.getTcsubject2name()+"<td>");
	pw.println("<td>"+tsc.getTcs3ubjectname()+"<td>");
	pw.println("</tr>");
}



pw.println("</table>");
pw.println("</body></html>");
%>
<a href="admin.jsp">Click here for home page</a><br/><br/>
<a href="assign-teacher-class-subject.jsp">Click here to add another teacher to a class for subjects</a>
</body>
</html>