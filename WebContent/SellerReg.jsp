<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="register" method="post">
	<table >
	<tr>
		<td><input type="text" name=fname required></td>
		<td><input type="text" name=cname ></td>
	</tr>
	<tr>
		<td><input type="text" name=lname required></td>
		<td><input type="text" name=caddress ></td>
	</tr>
	<tr>
		<td><input type="text" name=nic required></td>
		<td><input type="text" name=cmobile></td>
	
	</tr>
	<tr>
		<td><input type="text" name=email required></td>
		
	</tr>
	<tr>
		<td><input type="text" name=mobile required></td>
		
	</tr>
	<tr>
		<td><input type="text" name=address required></td>
		
	</tr>
	<tr>
		<td><input type="text" name=postalcode required></td>
		
	</tr>
	<tr>
		<td><input type="password" name=pwd required></td>
		
	</tr>
	<tr>
		<td><input type="password" name=repwd required></td>
		<td><input type="submit" name="submit" value="Register" ></td>
	</tr>
	
	</table>
	</form>

</body>
</html>