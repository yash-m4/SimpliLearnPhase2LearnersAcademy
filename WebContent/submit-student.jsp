<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Student"%>
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
String firstname =request.getParameter("firstname");


	Student st=new Student();
	st.setFname(firstname);

	
	AppDAO.addStudent(st);
	response.sendRedirect("list-student.jsp");
%>

</body>
</html>