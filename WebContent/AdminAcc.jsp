<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Administrator</title>
		<link rel="stylesheet" type="text/css" href="header.css">
<meta charset="ISO-8859-1">

</head>
<body bgcolor="DarkSlateGray">


		
		<ul id="b1">
			<li class="a2"><img src="batch.png" width="260px" height="100px" class ="a19" >
			<li><a href="Home.jsp" class="a1">HOME</a></li>
			<li><a href="Login.jsp" class="a0">LOG IN</a></li>
			<li><a href="#" class="a0">ABOUT US</a></li>
		</ul>
		
		
		<hr class="a4">
		<ul id="b9">
			<li><a href="#">My Account</a></li>
			<li><a href="propertymanage.jsp">Buy Property</a></li>
			<li><a href="#">Sell Property</a></li>
			<li><a href="#">Sellers</a></li>
			<li><a href="#">Buyers</a></li>
			<li><a href="PropertyDelete.jsp">Delete Property</a></li>
			<li>
				<form action="sold" method="post">
					<input style="height:1cm;margin-top:0.2cm" type= "submit" name="sold" value="Sold/Reserved Property"></form></li>
			
		</ul>
		<br>
		<br>
		<br>
		<table>
	<c:forEach var="ad" items="${admin}">
	<tr>
		<td>Administrator ID:</td>
		<td>${ad.id}
	</tr>
	<tr>
		<td>First Name  :</td>
		<td>${ad.firstname}</td>
	</tr>
	
	<tr>
		<td>Last Name  :</td>
		<td>${ad.lastname}</td>
	</tr>
	
	<tr>
		<td>NIC  :</td>
		<td>${ad.nic}</td>
	</tr>
	
	
		
	
	

	<%--${buy.password} --%>
	
	
	
	</c:forEach>
	</table>
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