package com.example.bus.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.bus.domain.Bus;
import com.example.bus.domain.BusDetails;
import com.example.bus.repository.BusRepository;

@Component
public class BusService{

	@Autowired
	BusRepository busRepository;
	
	public List<BusDetails> getBusDetails(Bus bus) throws ParseException {
		List<BusDetails> list = new ArrayList<BusDetails>();
		List<BusDetails> list2 = new ArrayList<BusDetails>();
		list = busRepository.findAll();
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date = inputFormat.parse(bus.getTravelDate());

		// Define the desired output format
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

		// Format the Date object to a formatted string
		String formattedDate = outputFormat.format(date);
		bus.setTravelDate(formattedDate);
		System.out.println(list);
		list.stream().forEach(busDetails1 -> {
                  busDetails1.setViewSeatsText("View Seats");
			System.out.println(bus.getTravelDate());
			System.out.println(busDetails1.getTravelDate());
			if (bus.getSource().equals(busDetails1.getSource())
					&& bus.getDestination().equals(busDetails1.getDestination())
					&& bus.getTravelDate().equals(busDetails1.getTravelDate())) {
				list2.add(busDetails1);
			}
		});

		return list2;
	}
}
