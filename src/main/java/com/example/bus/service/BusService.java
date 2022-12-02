package com.example.bus.service;

import java.util.ArrayList;
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
	
	public List<BusDetails> getBusDetails(Bus bus) {
		List<BusDetails> list = new ArrayList<BusDetails>();
		List<BusDetails> list2 = new ArrayList<BusDetails>();
		list = busRepository.findAll();
		System.out.println(list);
		list.stream().forEach(busDetails1 -> {
			if (bus.getSource().equals(busDetails1.getSource())
					&& bus.getDestination().equals(busDetails1.getDestination())
					&& bus.getTravelDate().equals(busDetails1.getTravelDate())) {
				list2.add(busDetails1);
			}
		});

		return list2;
	}
}
