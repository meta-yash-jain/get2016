<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Detailed Car View </title>
		<link rel='stylesheet' type='text/css' href='style.css'>
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
		<link rel='stylesheet' href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
	</head>
	
	<body>
		<div id='contact'>
			<h2> Detailed Car Information </h2>
		</div>
		<div>
			<div>
				<label> Company Name : </label>
				<% String companyName = request.getParameter("companyName"); %>
				<span> <%=companyName%> </span>
			</div>
			<div>
				<label> Model Number :  </label>
				<% String modelNumber = request.getParameter("modalNumber"); %>
				<span> <%= modelNumber%> </span>
			</div>
			<div>
				<label> Car Name : </label>
				<% String carName = request.getParameter("carName"); %>
				<span> <%= carName%> </span>
			</div>
			<div>
				<label> Fuel Capacity (in Litres) : </label>
				<%String fuelCapacity = request.getParameter("fuelCapacity"); %>
				<span> <%=fuelCapacity%> </span>
			</div>
			<div>
				<label> Milage : </label>
				<% String milage = request.getParameter("milage"); %>
				<span> <%=milage%> </span>
			</div>
			<div>
				<label> Price : </label>
				<%String price = request.getParameter("price"); %>
				<span> <%=price%> </span>
			</div>
			<div>
				<label> Road Tax : </label>
				<%String roadTax = request.getParameter("roadTax"); %>
				<span> <%=roadTax%> </span>
			</div>
			<div>
				<label> Does car have AC ? : </label>
				<% String isAcPresent = "Yes"; 
				   if(Integer.parseInt(request.getParameter("AC")) == 0){
					   isAcPresent = "No";
					}
				%>
				<span> <%=isAcPresent%> </span>
			</div>
			<div>
				<label> Does car have power steering ? : </label>
				<% 
					String isPowerSteeringPresent = "Yes";
					if(Integer.parseInt(request.getParameter("powerSteering")) == 0){
						isPowerSteeringPresent = "No";
					}
				%>
				<span> <%=isPowerSteeringPresent %> </span>
			</div> 
			<div>
				<label> Does car have accessory kit ? : </label>
				<% 
					String isAccessoryKitPresent = "Yes";
					if(Integer.parseInt(request.getParameter("accessoryKit")) == 0){	
						isAccessoryKitPresent = "No";
					}
				%>
				<span> <%=isAccessoryKitPresent %> </span>
			</div>
			<div>
				<a href="index.html"> Home </a>
			</div>
		</div>
	</body>
</html>