package com.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facade.CarFacade;
import com.modal.CarVO;
import com.util.CarDekhoFactory;

/**
 * Servlet implementation class CreateCarServlet
 * Handles the logic for getting data for car to be created
 */
@WebServlet
public class CreateCarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * parses the car data from the request object and passes the CarVO to the DAO Layer
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	//Creating a objects;
    	CarDekhoFactory carDekhoFactory = new CarDekhoFactory();
    	CarVO carVO =  carDekhoFactory.getCar();
    	CarFacade carFacade = carDekhoFactory.getFacade();
        
    	
    	//parse value of different fields of a car
        final String make = request.getParameter("make");
        final String model = request.getParameter("model");
        final float engineInCC = Float.parseFloat(request.getParameter("engine"));
        final float fuelCapacity = Float.parseFloat(request.getParameter("fuel"));
        final float milage = Float.parseFloat(request.getParameter("milage"));
        final int price = Integer.parseInt(request.getParameter("price"));
        final boolean isAc = request.getParameter("ac").equals("yes");
        final boolean isPowerSteering = request.getParameter("powersteering").equals("yes");
        final boolean isAccessoryKit = request.getParameter("accessorykit").equals("yes");

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

        //pass the car object to the DAO layer
        carFacade.addCar(carVO);

        //after creating a car,redirect the user to the list page
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}