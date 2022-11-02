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

import com.doctorapp.model.Speciality;
import com.doctorapp.service.ISpecialityService;


@RestController
@RequestMapping("doctor-api")
public class SpecialityController {


	private ISpecialityService specialityService;

	
	@Autowired
	/**
	 * @param specialityService the specialityService to set
	 */
	public void setSpecialityService(ISpecialityService specialityService) {
		this.specialityService = specialityService;
	}
	
	@PostMapping("/specialities")
	ResponseEntity<Void> addSpeciality(@RequestBody Speciality speciality)
	{
		specialityService.addSpeciality(speciality);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/specialities")
	ResponseEntity<Void> updateSpeciality(Speciality speciality)
	{
		specialityService.updateSpeciality(speciality);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	@DeleteMapping("/specialities/{specialityId}")
	ResponseEntity<Void> deleteSpeciality(@PathVariable int specialityId)
	{
		specialityService.deleteSpeciality(specialityId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/specialities")
	ResponseEntity<List<Speciality>> getAll()
	{
		List<Speciality> specialities = specialityService.getAll();
		return ResponseEntity.ok().body(specialities);
	}
	
	@GetMapping("/specialities/specialityId/{specialityId}")
	ResponseEntity<Speciality> getById(@PathVariable int specialityId)
	{
		Speciality specialities = specialityService.getById(specialityId);
		return ResponseEntity.ok().body(specialities);
	}
	
	@GetMapping("/specialities/doctorName/{name}")
	ResponseEntity<List<Speciality>> getByDoctor(@PathVariable String name)
	{
		List<Speciality> specialities = specialityService.getByDoctor(name);
		return ResponseEntity.ok().body(specialities);
	}
	
	@GetMapping("/specialities/specialityName/{name}")
	ResponseEntity<List<Speciality>> getBy(@PathVariable String name)
	{
		List<Speciality> specialities = specialityService.getBySpeciality(name);
		return ResponseEntity.ok().body(specialities);
	}
	
}
