<%@page import="java.io.PrintWriter"%>
<%@page import="com.simplilearn.doa.AppDAO"%>
<%@page import="com.simplilearn.entity.Assign"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.table {
	width: 53%;
	height: 14cm;
	float: none;
}
  table, th, td {
  border: 1.5px solid black;
  border-collapse: separate;
  text-align: center;
}  
th{
background-color: yellow;
}
.whi{
 border: 1.5px solid black;
  border-collapse: separate;
}
h3{
margin-left: 4.5cm;
}
#table1{
margin-right:0.5cm;
height: 10cm;
margin-left: 1cm;
}
</style>
</head>
<body  style="background-color:hsl(0, 0%, 90%);">
<div>
			<%
			List<Assign> assign=AppDAO.listAssign();
			PrintWriter pw = response.getWriter();
			int slno=0;
			pw.println("<h3 >List of Class and Student</h3>");
			pw.println("<div class='table'><div id='table1'>");
			pw.println("<table style='width:100%' class='whi'>");
			pw.println("<tr><th class='whi'>S.No</th><th  class='whi'>ClassName</th><th  class='whi'>StudentName</th></tr>");
			for(Assign a:assign)
			{
				slno++;
				pw.println("<tr>");
				pw.println("<td class='whi'>"+slno+"</td>");
				pw.println("<td class='whi'>"+a.getClassID()+"</td>");
				pw.println("<td class='whi'>"+a.getStudentID()+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("</div></div>");
			%>
			
		
</div>
</body>
</html>