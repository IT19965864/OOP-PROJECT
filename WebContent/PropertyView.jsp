<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Property View</title>
	<link rel="stylesheet" type="text/css" href="header.css">


	<style>
		table,td, th{
            border: 1px solid white;
            border-collapse: collapse;
       
	</style>
	
</head>
	
<body bgcolor="DarkSlateGray" style="background-image:url('vin.jpg') ;opacity: 0.9; background-repeat: no-repeat;background-size: 100% 12cm;background-position-y: 17PX" >
	
	<ul id="b1">
			<li class="a2"><img src="batch.png" width="260px" height="100px" class ="a19" >
			<li><a href="Home.jsp" class="a1">HOME</a></li>
			<li><a href="Login.jsp" class="a0">LOG IN</a></li>
			<li><a href="#" class="a0">ABOUT US</a></li>
		</ul>
		
		
		<hr class="a4">
		
		
		
	
	<c:forEach var = "pr" items= "${pr1Details}">
	<table style="width:30% ; background-color:gray">
	
		<tr>
			<td>PROPERTY ID </td>
			<td><b>${pr.propertyID}</b></td>
		</tr>
		<tr>
			<td>OWNER ID </td>
			<td><b>${pr.ownerID}</b></td>
		</tr>
		<tr>
			<td>LOCATION </td>
			<td><b>${pr.location}</b></td>
		</tr>
		<tr>
			<td>AREA(IN PERCH) </td>
			<td><b>${pr.area}</b></td>
		</tr>
		<tr>
			<td>VALUE(PER PERCH)</td>
			<td><b>${pr.value}</b></td>
		</tr>
		<tr>
			<td>CATEGORY </td>
			<td><b>${pr.category}</b></td>
		</tr>
		<tr>
			<td>TYPE</td>
			<td><b>${pr.type}</b></td>
		</tr>
	</table>
	<br>
	</c:forEach>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	
	
	
	<div>
		<hr class="a4">
		<ul id="b3">
		
		<li class="a8">Property Master Pvt Ltd.</li>
		</ul>
		</div>
		<br>
		<br>
		
		<ul id="b4">
		<li class="a9">SHERE THE MOMENT</li>
		<li class="a10">QUICK LINKS</li>
		</ul>
		<ul id="b7">
		<li><a href="#" class="a14"><img src="fb.png" width="30px" height="30px" ></a></li>
		<li><a href="#"class="a15"><img src="twt.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a16"><img src="insta.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a17"><img src="youtube.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a18"><img src="in.png" width="30px" height="30px"></a></li>
		</ul>
		<ul id="b5">
		<li><a href="#">FAQ</a></li>
		<li><a href="#">Contact Us</a></li>
		<li><a href="#">Privacy & Policy</a></li>
		<li><a href="#">Terms & Condition</a></li>
		<li><a href="#">Technical support</a></li>
		</ul>

		<ul id="b6">
		<li class="a11">All right Reserved</li>
		<li class="a12">Copyright 2020 Property Master PVT LTD</li>
		</ul>

</body>
</html>