package com.doctorapp.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctorapp.model.Hospital;
import com.doctorapp.service.IHospitalService;

@RestController
@RequestMapping("doctor-api")
public class HospitalController {

	private IHospitalService hospitalService;

	
	@Autowired
	/**
	 * @param hospitalService the hospitalService to set
	 */
	public void setHospitalService(IHospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}
	
	@PostMapping("/hospitals")
	ResponseEntity<Void> addHospital(@RequestBody Hospital hospital)
	{
		hospitalService.addHospital(hospital);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/hospitals")
	ResponseEntity<Void> updateHospital(Hospital hospital)
	{
		hospitalService.updateHospital(hospital);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	@DeleteMapping("/hospitals/{hospitalId}")
	ResponseEntity<Void> deleteHospital(@PathVariable int hospitalId)
	{
		hospitalService.deleteHospital(hospitalId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/hospitals")
	ResponseEntity<List<Hospital>> getAll()
	{
		List<Hospital> hospitals = hospitalService.getAll();
		return ResponseEntity.ok().body(hospitals);
	}
	
	@GetMapping("/hospitals/hospitalId/{hospitalId}")
	ResponseEntity<Hospital> getById(@PathVariable int hospitalId)
	{
		Hospital hospitals = hospitalService.getById(hospitalId);
		return ResponseEntity.ok().body(hospitals);
	}
	
	
}
