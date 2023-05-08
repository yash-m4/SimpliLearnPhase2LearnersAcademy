<%@page import="java.io.PrintWriter"%>
<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Subject"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subject List</title>
</head>
<body style="background-color:hsl(0, 0%, 90%);">
<%
List<Subject> subjects=AppDAO.listSubject();
request.setAttribute("slist", subjects);
PrintWriter pw = response.getWriter();

pw.println("<html><body>");
pw.println("<table>");
pw.println("<tr>");
pw.println("<th>Subject ID--------- </th>");
pw.println("<th>Subject Name </th>");
pw.println("</tr>");


for(Subject s:subjects)
{

	
	pw.println("<tr>");

	pw.println("<td>"+s.getSid()+"<td>");
	pw.println("<td>"+s.getSname()+"<td>");
	
	pw.println("</tr>");
	
	
}



pw.println("</table>");
pw.println("</body></html>");
%>
<Button onclick="location.href='admin.jsp'">Click here for home page</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='add-subject.jsp'">Click here to add another subject</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</body>
</html>