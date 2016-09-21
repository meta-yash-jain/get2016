<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@page import = "model.CarVO" %>
<%@page import = "model.CarFacade" %>
<%@page import = "java.util.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Cars</title>
</head>
<body>
	<% 
		CarFacade facade = new CarFacade();
		List<CarVO> listOfCars = facade.getAllCars();
	%>
	<table>
		<tr>
			<th> Company Name </th>
			<th> Model Number </th>
			<th> Car Name </th>
			<th> Fuel Capacity (in Litres) </th>
			<th> Milage </th>
			<th> Price </th>
			<th> Road Tax </th>
			<th> AC </th>
			<th> Power Steering </th>
			<th> Accessory Kit </th>
		</tr>
		<% for(CarVO car : listOfCars){  %>
		<tr>
			<td> <%=car.getCompanyName() %> </td>
			<td> <%=car.getModelNumber() %> </td>
			<td> <%=car.getName() %> </td>
			<td> <%=car.getFuelCapacity() %> </td>
			<td> <%=car.getMilege() %> </td>
			<td> <%=car.getPrice() %> </td>
			<td> <%=car.getRoadTax() %> </td>
			<% String result = "Yes";
			if(car.isAcPresent() == 0) {
				result="No";
			}else{
				result="Yes";
			}
			%>
			<td> <%=result %> </td>
			<% if(car.isPowerSteeringPresent() == 0){
				result = "No";
			}else{
				result = "Yes";
			} %>
			<td> <%=result %> </td>
			<% if(car.isAccessoryKitPresent() == 0){
				result = "No";
			}else{
				result = "Yes";
			} %>
			<td> <%=result %> </td>
			<td> <a href="updateCar.jsp?companyName=<%=car.getCompanyName()%>&
						modalNumber=<%=car.getModelNumber()%>&carName=<%= car.getName()%>&fuelCapacity=
						<%=car.getFuelCapacity()%>&milage=<%=car.getMilege()%>&price=<%=car.getPrice()%>&
						roadTax=<%=car.getRoadTax()%>&AC=<%=car.isAcPresent()%>&
						powerSteering=<%=car.isPowerSteeringPresent()%>
						&accessoryKit=<%=car.isAccessoryKitPresent()%>"> Edit </a> </td>
			
			<td> <a href="detailedCarView.jsp?companyName=<%=car.getCompanyName() %>&
						modalNumber=<%= car.getModelNumber()%>&carName=<%= car.getName()%>&fuelCapacity=
						<%=car.getFuelCapacity()%>&milage=<%=car.getMilege()%>&price=<%=car.getPrice()%>&
						roadTax=<%=car.getRoadTax()%>&AC=<%=car.isAcPresent()%>&
						powerSteering=<%=car.isPowerSteeringPresent()%>&accessoryKit=
						<%=car.isAccessoryKitPresent()%> "> Detailed View </a> </td>				
		</tr>
		<%} %>
	</table>
	<div>
		<a href="index.html"> Home </a>
	</div>
</body>
</html>