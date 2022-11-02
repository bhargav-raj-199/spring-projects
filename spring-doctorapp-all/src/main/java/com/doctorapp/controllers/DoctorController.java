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

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

@RestController
@RequestMapping("doctor-api")
public class DoctorController {

	@Autowired
	private IDoctorService doctorService;
	@PostMapping("/doctors")
	ResponseEntity<Void> addDoctor(@RequestBody Doctor doctor){
		doctorService.addDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/doctors")
	ResponseEntity<Void> updateDoctor(@RequestBody Doctor doctor){
		doctorService.updateDoctor(doctor);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@DeleteMapping("/doctors/{doctorId}")
	ResponseEntity<Void> deleteDoctor(@PathVariable int doctorId){
		doctorService.deleteDoctor(doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/doctors")
	ResponseEntity<List<Doctor>> getAll(){
		List<Doctor> doctors=doctorService.getAll();
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/doctorId/{doctorId}")
	ResponseEntity<Doctor> getById(@PathVariable int doctorId){
		Doctor doctor=doctorService.getById(doctorId);
		return ResponseEntity.ok().body(doctor);
	}
	
	@GetMapping("/doctors/hospital/{name}")
	ResponseEntity<List<Doctor>> getByHospital(@PathVariable("name")String hospitalName){
		List<Doctor> doctors=doctorService.getByHospital(hospitalName);
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/casesheet/{casesheetId}")
	ResponseEntity<Doctor> getByCaseSheet(@PathVariable("casesheetId")int casesheetId){
		Doctor doctor=doctorService.getByCaseSheet(casesheetId);
		return ResponseEntity.ok().body(doctor);
	}
	
	@GetMapping("/doctors/sepicality/{speciality}/city/{city}")
	ResponseEntity<List<Doctor>> getBySpecialityAndCity(@PathVariable("speciality")String speciality,@PathVariable("city")String city){
		List<Doctor> doctors=doctorService.getBySpecialityAndCity(speciality, city);
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/sepicality/{speciality}")
	ResponseEntity<List<Doctor>> getBySpeciality(@PathVariable("speciality")String speciality){
		List<Doctor> doctors=doctorService.getBySpeciality(speciality);
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/sepicality/{speciality}/experienece/{experienece}")
	ResponseEntity<List<Doctor>> getBySpecialityAndExperience(@PathVariable("speciality")String speciality,@PathVariable("experience")int experience){
		List<Doctor> doctors=doctorService.getBySpecialityAndExperience(speciality, experience);
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/sepicality/{speciality}/name/{name}")
	ResponseEntity<List<Doctor>>  getBySpecialityAndHospital(@PathVariable("speciality")String speciality,@PathVariable("name")String hospitalName){
		List<Doctor> doctors=doctorService.getBySpecialityAndHospital(speciality, hospitalName);
		return ResponseEntity.ok().body(doctors);
	}
	
	@GetMapping("/doctors/sepicality/{speciality}/fees/{fees}")
	ResponseEntity<List<Doctor>> getBySpecialityAndFees(@PathVariable("speciality")String speciality,@PathVariable("fees")double fees){
		List<Doctor> doctors=doctorService.getBySpecialityAndFees(speciality, fees);
		return ResponseEntity.ok().body(doctors);
	}
	
	
	
}
