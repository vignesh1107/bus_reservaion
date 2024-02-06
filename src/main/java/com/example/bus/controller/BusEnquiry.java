package com.example.bus.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.bus.domain.Bus;
import com.example.bus.domain.BusDetails;
import com.example.bus.domain.BusMetadata;
import com.example.bus.service.BusService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BusEnquiry {
	
	@Autowired
	BusService busService;
	
	@GetMapping("/busEnquiry")
	@ResponseStatus(HttpStatus.OK)
	public List<BusDetails> getBusEnquiry(@RequestParam String source,
									 @RequestParam String destination,
									 @RequestParam String travelDate) throws ParseException {
		Bus bus = new Bus(source,destination,travelDate);
//		bus.setSource(source);
//		bus.setDestination(destination);
//		bus.setTravelDate(travelDate);
		BusMetadata busMetadata = new BusMetadata();
		List<BusDetails> list = new ArrayList<BusDetails>();
		List<BusDetails> list2 = new ArrayList<BusDetails>();
		list = busService.getBusDetails(bus);
		if(list.isEmpty()) {
			busMetadata.setMessage("No Buses availables in this route on the mentioned date");
		}else {
		list.forEach(busDetails -> {
			list2.add(busDetails);
		});
		busMetadata.setBusDetails(list2);
		}
		return list;
		
	}

}
