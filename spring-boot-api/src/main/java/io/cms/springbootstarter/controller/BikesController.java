package io.cms.springbootstarter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.cms.springbootstarter.models.Bike;
import io.cms.springbootstarter.repository.BikeRepository;

@RestController
@RequestMapping("api/v1/bikes")
public class BikesController {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	@GetMapping
	public List<Bike> list(){
		List<Bike> blist = new ArrayList<>();
		blist = bikeRepository.findAll();
		return blist;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		
	}
	
	@GetMapping("{id}")
	public Bike get(@PathVariable("id") long id) {
		return bikeRepository.getOne(id); 
	}
}
