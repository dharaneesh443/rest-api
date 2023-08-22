package com.example.putandDeleteMapping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.putandDeleteMapping.model.Hotelmodel;
import com.example.putandDeleteMapping.service.Hotelservice;

@RestController
public class Hotelcontroller {
	@Autowired
	Hotelservice ser;
	@PostMapping("/savehotel")
	public Hotelmodel savehotelDe(@RequestBody Hotelmodel hm) {
		return ser.saveDetails(hm);
	}
	@PutMapping("/updatehotel")
	public Hotelmodel updatehotelDe(@RequestBody Hotelmodel hm) {
		return ser.updateDetails(hm);
	}
	@DeleteMapping("/deletehotel/{id}")
	public ResponseEntity<String>deletehotelInfo(@PathVariable int id){
		boolean deleted=ser.deleteHotel(id);
		
		if(deleted) {
			return ResponseEntity.ok("Hotel with ID"+id+"deleted successfully");
		}
		else {
			return
					ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID"+id+"not found");
					
		}
	}
	@DeleteMapping("/byrepparm")
	public String removedRequestParm(@RequestParam("id") int id) {
		ser.deleteHotel(id);
		return "Hotel with Id "+id+" is deleted";
	}
	@GetMapping("/gethotel")
	public List<Hotelmodel>getHotelDe(){
		return ser.getDetails();
	}

}
