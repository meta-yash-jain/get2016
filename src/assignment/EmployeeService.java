package assignment;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employees")
public class EmployeeService {

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@PathParam("id") int id) {

		List<Employee> employeeList = EmployeeDAO.getObject().getEmployeeById(id);

		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(employeeList) {
		};
		// Sending the response
		return Response.status(200).entity(generic).build();
	}

	@GET
	@Path("/search/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeByName(@PathParam("name") String name) {
		List<Employee> employeeList = EmployeeDAO.getObject().getEmployeeByName(name);
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(employeeList) {
		};
		// Sending the response
		return Response.status(200).entity(generic).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertEmployee(Employee empVO) {
		EmployeeDAO emp =EmployeeDAO.getObject();

		Boolean flag = emp.insertEmployee(empVO);
		if (flag == true)
			return Response.status(201).build();
		else
			return Response.status(409).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response selectEmployee() {

		EmployeeDAO emp = EmployeeDAO.getObject();
		List<Employee> empList = emp.getEmployees();
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(empList) {
		};
		// Sending the response
		return Response.status(200).entity(generic).build();
	}

	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteEmployeeById(@PathParam("id") int id) {

		EmployeeDAO emp = EmployeeDAO.getObject();
		Boolean flag = emp.deleteEmployee(id);

		// Sending the response
		if (flag == true)
			return Response.status(200).build();
		else
			return Response.status(404).build();
	}
}
