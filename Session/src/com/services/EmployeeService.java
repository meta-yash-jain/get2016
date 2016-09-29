package com.services;

import java.sql.SQLException;
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

import org.apache.catalina.filters.CorsFilter;

import com.model.facade.EmployeeFacade;
import com.model.vo.EmployeeVO;

@Path("/customers")
public class EmployeeService {

	/**
	 * It create and update the employee both if id is provided then it update
	 * else it create an employee
	 * 
	 * @param emVo It is employee value object which store all the data
	 * @return Response status code
	 * @throws SQLException
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEmployee(EmployeeVO emVo) throws SQLException {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		boolean result = employeeFacade.save(emVo);
		if (result)
			return Response.status(200).build();
		else
			return Response.status(409).build();
	}
	
	/**
	 * It get All the employees from the database
	 * @return Response status code and all employees
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		EmployeeFacade employeeFacade = new EmployeeFacade();

		GenericEntity<List<EmployeeVO>> generic = new GenericEntity<List<EmployeeVO>>(employeeFacade.findAll()) {};
		return Response.status(200).header("Access-Control-Allow-Origin", CorsFilter.DEFAULT_ALLOWED_ORIGINS).entity(generic).build();
	}
	
	/**
	 * It get employee according to the id
	 * @param id the unique no of employee identified
	 * @return Response status code and employee
	 */
	@GET
	@Path("{empID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("empID") int id) {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		GenericEntity<List<EmployeeVO>> generic = new GenericEntity<List<EmployeeVO>>(employeeFacade.findById(id)) {};
		return Response.status(200).header("Access-Control-Allow-Origin", CorsFilter.DEFAULT_ALLOWED_ORIGINS).entity(generic).build();
	}
	
	/**
	 * It search employee according to the name
	 * @param name it is name of the employee you want to search
	 * @return Response status code and employee
	 */
	@GET
	@Path("/search/{empName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByName(@PathParam("empName") String name) {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		GenericEntity<List<EmployeeVO>> generic = new GenericEntity<List<EmployeeVO>>(employeeFacade.findByName(name)) {};
		return Response.status(200).header("Access-Control-Allow-Origin", CorsFilter.DEFAULT_ALLOWED_ORIGINS).entity(generic).build();
	}
	
	/**
	 * It delete employee according to the id
	 * @param id it is identification of the employee you want to delete
	 * @return Response status code
	 */
	@DELETE
	@Path("{empID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("empID") int id) {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		boolean result = employeeFacade.removeById(id);
		if (result) {
			return Response.status(200).build();
		}
		return Response.status(409).build();
	}
}
