package com.doctorapp.service;

import java.util.List;

import com.doctorapp.model.Casesheet;
import com.doctorapp.model.Doctor;

public interface IDoctorService {

	void addDoctor(Doctor doctor);
	void updateDoctor(Doctor doctor);
	void deleteDoctor(int doctorId);
	List<Doctor> getAll();
	Doctor getById(int doctorId);
	List<Doctor> getByHospital(String hospitalName);
	List<Doctor> getBySpecialityAndCity(String speciality,String city);
	List<Doctor> getBySpeciality(String speciality);
	List<Doctor> getBySpecialityAndExperience(String speciality,int experience);
	List<Doctor> getBySpecialityAndHospital(String speciality,String hospitalName);
	List<Doctor> getBySpecialityAndFees(String speciality,double fees);
	Doctor getByCaseSheet(int casesheetId);
	
}
