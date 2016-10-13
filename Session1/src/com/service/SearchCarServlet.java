package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facade.CarFacade;
import com.modal.CarVO;
import com.util.CarDekhoFactory;

/**
 * Servlet implementation class SearchCarServlet
 * searches the car based on various parameters
 */
@WebServlet
public class SearchCarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCarServlet() {
        super();

    }

    /**
     *performs a search for a car based on parameters
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //parse the search parameter
        String filter = request.getParameter("search-parameter");
        List < CarVO > carList = new ArrayList < CarVO > ();
        CarFacade carFacade = new CarDekhoFactory().getFacade();
        switch (filter) {
            //if the search is to be performed on the basis of make or model
            //then parse the value of make or model
            case "make":
            case "model":
                String parameter = request.getParameter("search-value-string");
                carList = carFacade.searchCar(filter, parameter);
                break;
                //if the search is to be performed on the basis of engine,fuel,milage,price
                //then parse the value of above parameters
            case "engine":
            case "fuel-capacity":
            case "milage":
            case "price":
                int minValue = Integer.parseInt(request.getParameter("search-value-number-min"));
                int maxValue = Integer.parseInt(request.getParameter("search-value-number-max"));
                carList = carFacade.searchCar(filter, minValue, maxValue);
            default:
                break;
        }
        //set the list of results in request attribute
        request.setAttribute("carList", carList);
        //redirect the user to the search results page
        request.getRequestDispatcher("searchResults.jsp").forward(request, response);
    }
}