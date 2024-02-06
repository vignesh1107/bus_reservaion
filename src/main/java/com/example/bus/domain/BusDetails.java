package com.example.bus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus_details")
public class BusDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;

    private String source;

    private String destination;

    private String travelDate;

    private String busName;

    private Integer totalSeats;


    private Integer availableSeats;

    private String time;

    private String viewSeatsText;

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

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }


    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getViewSeatsText() {
        return viewSeatsText;
    }

    public void setViewSeatsText(String viewSeatsText) {
        this.viewSeatsText = viewSeatsText;
    }

    public BusDetails() {
        super();
    }

    @Override
    public String toString() {
        return "BusDetails [id=" + id + ", source=" + source + ", destination=" + destination + ", travelDate="
                + travelDate + ", busName=" + busName + ", totalSeats=" + totalSeats + ", availableSeats="
                + availableSeats + ", time=" + time + "]";
    }

    public BusDetails(String source, String destination, String travelDate, String busName, Integer totalSeats,
                      Integer availableSeats, String time) {
        super();
        this.source = source;
        this.destination = destination;
        this.travelDate = travelDate;
        this.busName = busName;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.time = time;
    }


}
