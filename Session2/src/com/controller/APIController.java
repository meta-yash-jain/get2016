package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.facade.CarFacade;
import com.model.vo.CarVO;


@RestController
@RequestMapping("/cars")
public class APIController {
	
	@Autowired
	CarFacade carfacade;

	
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CarVO>> getCarList() {
        return new ResponseEntity<List<CarVO>>(carfacade.findAll(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "{carid}", method = RequestMethod.GET)
    public ResponseEntity<List<CarVO>> getCarList(@PathVariable("carid") int carid) {
        return new ResponseEntity<List<CarVO>>(carfacade.findById(carid), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> createCar(@RequestBody CarVO carVO) {
    	boolean x =carfacade.save(carVO);
    	if(x) {
    		return new  ResponseEntity<String>("Created SuccessFul", HttpStatus.CREATED);
    	} else {
    		return new  ResponseEntity<String>("Some Error Occured", HttpStatus.BAD_REQUEST);
    	}    	
    }
    
    @RequestMapping(value = "{carid}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateCar(@RequestBody CarVO carvo, @PathVariable("carid") int carid) {
    	boolean x =carfacade.save(carvo);
    	if(x) {
    		return new  ResponseEntity<String>("Created SuccessFul", HttpStatus.OK);
    	} else {
    		return new  ResponseEntity<String>("Some Error Occured", HttpStatus.BAD_REQUEST);
    	}    	
    }
    
    @RequestMapping(value = "{carid}", method = RequestMethod.DELETE)
    public ResponseEntity<String> updateCar(@PathVariable("carid") int carid) {
    
    	boolean x =carfacade.removeById(carid);
    	if(x) {
    		return new  ResponseEntity<String>("Created SuccessFul", HttpStatus.OK);
    	} else {
    		return new  ResponseEntity<String>("Some Error Occured", HttpStatus.BAD_REQUEST);
    	}    	
    }
}
