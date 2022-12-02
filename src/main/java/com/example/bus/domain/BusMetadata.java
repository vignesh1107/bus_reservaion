package com.example.bus.domain;

import java.util.List;

public class BusMetadata {
	private List<BusDetails> busDetails;

	public List<BusDetails> getBusDetails() {
		return busDetails;
	}

	public void setBusDetails(List<BusDetails> busDetails) {
		this.busDetails = busDetails;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
