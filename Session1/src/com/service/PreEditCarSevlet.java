package com.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modal.CarVO;

/**
 * Servlet implementation class PreEditCarSevlet
 * Controls the flow before editing a car's data
 */
@WebServlet
public class PreEditCarSevlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreEditCarSevlet() {
        super();

    }

    /**
     *parses the information of the car to be edited and sends the user to the edit page
     */
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
  	
    	//get the vehicle id of the car to be edited
        int vehicleId = Integer.parseInt(request.getParameter("vehicleId").toString());
        HttpSession session = request.getSession();
        if (session != null) {
            //get list of all cars from the session and decide which vehicle is to be edited
            List < CarVO > carList = (List < CarVO > ) session.getAttribute("carList");
            for (CarVO car: carList) {
                //matching vehicle found
                //interpolate the pre-existing data about that vehicle in the edit from 
                if (car.getVehicleId() == vehicleId) {
                    request.setAttribute("make", car.getMake());
                    request.setAttribute("model", car.getModel());
                    request.setAttribute("engine-capacity", car.getEngineInCC());
                    request.setAttribute("fuel-capacity", car.getFuelCapacity());
                    request.setAttribute("milage", car.getMilage());
                    request.setAttribute("price", car.getPrice());
                    request.setAttribute("isAC", car.isAc());
                    request.setAttribute("isPowerSteering", car.isPowerSteering());
                    request.setAttribute("isAccessoryKit", car.isAccessoryKit());
                    request.setAttribute("btn-value", "update");
                    session.setAttribute("vehicleId", vehicleId);
                    request.getRequestDispatcher("create.jsp").forward(request, response);
                }
            }
        }
    }
}