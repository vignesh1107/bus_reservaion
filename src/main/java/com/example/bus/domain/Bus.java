package com.example.bus.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bus {
	
	public Bus(String source, String destination, String travelDate) {
		super();
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
	}

	@Override
	public String toString() {
		return "Bus [source=" + source + ", destination=" + destination + ", travelDate=" + travelDate + "]";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Integer bus_id;

	private String source;

	private String destination;
	
	private String travelDate;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
}
