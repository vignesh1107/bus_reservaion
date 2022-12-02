package com.example.bus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bus.domain.BusDetails;

@Repository
public interface BusRepository extends JpaRepository<BusDetails, String> {
	
	@Query(value = "SELECT * FROM bus_details u WHERE u.source = :source and u.destination = :destination and u.bus_name=:bus_name and u.travel_date=:td", 
			  nativeQuery = true)
	List<BusDetails> findBusByDetails(@Param("source") String source,@Param("destination") String destination,@Param("bus_name") String bus_name,@Param("td") String travel_date);
	
}
