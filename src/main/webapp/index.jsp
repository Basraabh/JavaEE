<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{ 
	background-color: #ee8328;
}

#container{
	background-color: #207394;
	height: 350px;
	width:250px;
	margin-left: 600px;
	padding-left: 70px;
	padding-top: 20px;
}

#id, #name, #contact, #city, #email{
	background-color: #eedd7a;
}

#sub{
	background-color: #e14318;
}
</style>


</head>
<body>

		<%
		
		out.print("Hello from a script tag java code");
		%>
		
		<!-- -Declaration Tag for declaring variables or methods -->
		
		<%
			String name = "Cestar College";
		
		%>
		
		<!-- Expression Tag works without ; at the end -->
		
		<%=
			name //prints without using out line statement
		%>
		
		
		<div id = "container">
		<form action = "Helloworld">
		Employee ID: <input type = "text" name = "e_id" id = "id"><br><br>
		
		Employee Name: <input type = "text" name = "e_name" id = "name"><br><br>
		
		Employee Contact: <input type = "text" name = "e_contact" id = "contact"><br><br>
		
		Employee City: <input type = "text" name = "e_city" id = "city"><br><br>
		
		Employee Email: <input type = "text" name = "e_email" id = "email"><br><br>
		
		<input type = "submit" value = "submit" id = "sub"><br><br>
		
		</form>
		</div>
</body>
</html>