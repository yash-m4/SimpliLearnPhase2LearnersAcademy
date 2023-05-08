<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Teacher"%>
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
String firstname =request.getParameter("teacherfirstname");


	Teacher t=new Teacher();
	t.setTfname(firstname);

	
	AppDAO.addTeacher(t);
	response.sendRedirect("list-teacher.jsp");
%>
</body>
</html>