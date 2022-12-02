package com.example.bus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bus.domain.BusDetails;
import com.example.bus.repository.BusRepository;

@RestController
public class StoringAvailableBus {

	@Autowired
	BusRepository busRepository;

	@PostMapping("/storingAvailableBus")
	public String storingAvailableBus(@RequestBody BusDetails busDetails) {
		List<BusDetails> list = new ArrayList<BusDetails>();
		list = busRepository.findBusByDetails(busDetails.getSource(),busDetails.getDestination(),busDetails.getBusName(),busDetails.getTravelDate());
		System.out.println(list);
		if(list.isEmpty()) {
		busRepository.save(busDetails);
		return "Success";
		}else {
			return "Record Already Exists";
		}

	}
}
