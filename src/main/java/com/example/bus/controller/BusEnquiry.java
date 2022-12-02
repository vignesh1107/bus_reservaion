package com.example.bus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bus.domain.Bus;
import com.example.bus.domain.BusDetails;
import com.example.bus.domain.BusMetadata;
import com.example.bus.service.BusService;

@RestController
public class BusEnquiry {
	
	@Autowired
	BusService busService;
	
	@GetMapping("/busEnquiry")
	public BusMetadata getBusEnquiry(@RequestBody Bus bus){
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
		return busMetadata;
		
	}

}
