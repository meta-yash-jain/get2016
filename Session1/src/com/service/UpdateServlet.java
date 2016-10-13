package com.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facade.CarFacade;
import com.modal.CarVO;
import com.util.CarDekhoFactory;

/**
 * Servlet implementation class UpdateServlet
 * this controller updates the pre-existing car
 */
@WebServlet
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * parses all the data of the car to be edited 
     * and passes the object to the DAO layer to be inserted into the database
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	//Creating a objects;
    	CarDekhoFactory carDekhoFactory = new CarDekhoFactory();
    	CarVO carVO =  carDekhoFactory.getCar();
    	CarFacade carFacade = carDekhoFactory.getFacade();
    	
        //parses the new values  
        final String make = request.getParameter("make");
        final String model = request.getParameter("model");
        final float engineInCC = Float.parseFloat(request.getParameter("engine"));
        final float fuelCapacity = Float.parseFloat(request.getParameter("fuel"));
        final float milage = Float.parseFloat(request.getParameter("milage"));
        final int price = Integer.parseInt(request.getParameter("price"));
        final boolean isAc = request.getParameter("ac").equals("yes");
        final boolean isPowerSteering = request.getParameter("powersteering").equals("yes");
        final boolean isAccessoryKit = request.getParameter("accessorykit").equals("yes");
        final int vehicleId = Integer.parseInt(request.getSession(false).getAttribute("vehicleId").toString());

  
        carVO.setVehicleId(vehicleId);
        carVO.setMake(make);
        carVO.setModel(model);
        carVO.setEngineInCC(engineInCC);
        carVO.setFuelCapacity(fuelCapacity);
        carVO.setMilage(milage);
        carVO.setPrice(price);
        carVO.setRoadTax(carVO.calculateRoadTax(price));
        carVO.setAc(isAc);
        carVO.setPowerSteering(isPowerSteering);
        carVO.setAccessoryKit(isAccessoryKit);

        //passes this car object to the DAO layer
        carFacade.updateCar(carVO);

        //after updation,fetches an updated list of cars 
        List < CarVO > carList = carFacade.getAllCars();

        //sets this list into the session
        HttpSession session = request.getSession();
        session.setAttribute("carList", carList);

        //redirects the user to the list page
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}