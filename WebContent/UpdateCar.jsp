<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Welcome to Car Becho </title>
		<link rel='stylesheet' type='text/css' href='site.index.css'>
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
		<link rel='stylesheet' href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
	</head>
	
	<body>
		<div id='contact'>
			<h2> Update Car </h2>
		</div>
		<div>
			<form id="updateForm" action="UpdateCarServlet" method="GET">
				<div>
					<label> Company Name </label>
					<input type='text' name='car_company_name' value='<%=request.getParameter("companyName") %>' placeholder='Company Name'/>
				</div>
				<div>
					<label> Model Number  </label>
					<input type='text' name='car_model_number' value='<%=request.getParameter("modalNumber") %>' placeholder='Model Number'/>
				</div>
				<div>
					<label> Name </label>
					<input type='text' name='car_name' value='<%=request.getParameter("carName") %>' placeholder='Name' />
				</div>
				<div>
					<label> Fuel Capacity (in Litres) </label>
					<input type='number' name='car_fuel_capacity' value='<%=request.getParameter("fuelCapacity") %>' placeholder='Fuel Capacity'/>
				</div>
				<div>
					<label> Milage  </label>
					<input type='number'  name='car_milage' value='<%=request.getParameter("milage") %>' placeholder='Milage'/>
				</div>
				<div>
					<label> Price </label>
					<input type='text' name='car_price' value="<%=request.getParameter("price") %>" placeholder='Price'/>
				</div>
				<div>
					<label> Road Tax </label>
					<input type='text' name='car_road_tax' value="<%=request.getParameter("roadTax") %>" placeholder='Road Tax' />
				</div>
				<div>
					<label> Does car have AC ? </label>
					<% String yesChecked=""; String noChecked=""; 
						if(Integer.parseInt(request.getParameter("AC")) == 0){
							
							noChecked="checked";
						}else{
							yesChecked="checked";
						}
						%>
					<input type='radio' name='AC' value='Yes' <%=yesChecked %>/> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='AC' value='No' <%=noChecked %>/> <span id='radiotext'> No </span>
				</div>
				<div>
					<label> Does car have power steering ? </label>
					<% 
						yesChecked=""; noChecked="";
						if(Integer.parseInt(request.getParameter("powerSteering")) == 0){
							
							noChecked="checked";
						}else{
							yesChecked="checked";
						}
						%>
					<input type='radio' name='powerSteering' value='Yes' <%=yesChecked %>/> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='powerSteering' value='No' <%=noChecked %>/> <span id='radiotext'> No </span>
				</div> 
				<div>
					<label> Does car have accessory kit ? </label>
					<% 
						yesChecked=""; noChecked="";
						if(Integer.parseInt(request.getParameter("accessoryKit")) == 0){
							
							noChecked="checked";
						}else{
							yesChecked="checked";
						}
						%>
					<input type='radio' name='accessoryKit' value='Yes' <%=yesChecked %> /> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='accessoryKit' value='No' <%=noChecked %>/> <span id='radiotext'> No </span>
				</div>
				<div>
					<button id='updateButton' type='submit'> <h4 id='buttontext'>  Update  <i class="fa fa-paper-plane" aria-hidden="true"></i> </h4>  </button>
				</div>
				
			</form>
			<div>
				<a href="Index.html"> Home </a>
			</div>
		</div>
	</body>
</html>