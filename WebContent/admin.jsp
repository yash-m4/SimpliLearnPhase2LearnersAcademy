<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:hsl(0, 0%, 90%);">
<% String username=(String)session.getAttribute("username");%>
<h3 style="color : Blue;"> Hello <%=username %></h3>

<nav>
<Button onclick="location.href='add-class.jsp'">Add Classes</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='add-teacher.jsp'">Add Teachers</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='add-student.jsp'">Add Students</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='add-subject.jsp'">Add Subjects</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br></br>
<Button onclick="location.href='assign-techer-class-subject.jsp'">Assign Teacher, Classes, Subjects and Student</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br></br>
<Button onclick="location.href='view-student.jsp'">View Students List</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Button onclick="location.href='list.jsp'">View Class Report</Button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</nav>

<br></br><br></br>
<Button onclick="location.href='logout.jsp'">LOGOUT</Button>
</body>
</html>