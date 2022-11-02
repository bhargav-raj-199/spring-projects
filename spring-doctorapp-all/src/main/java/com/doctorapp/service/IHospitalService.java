package com.doctorapp.service;

import java.util.List;

import com.doctorapp.model.Hospital;

public interface IHospitalService {

	void addHospital(Hospital hospital);
	void updateHospital(Hospital hospital);
	void deleteHospital(int hospitalId);
	List<Hospital> getAll();
	Hospital getById(int hospitalId);
	
	List<Hospital> getByHospital(String hospitalName);
	List<Hospital> getByDoctor(String DoctorName);
	List<Hospital> getByCity(String city);
	List<Hospital> getBySpecialityAndCity(String speciality,String city);
	List<Hospital> getBySpecialityAndDoctor(String speciality,String DoctorName);
	List<Hospital> getBySpeciality(String speciality);
	List<Hospital> getBySpecialityAndExperience(String speciality,int experience);
	List<Hospital> getBySpecialityAndHospital(String speciality,String hospitalName);
	List<Hospital> getBySpecialityAndFees(String speciality,double fees);
	
}
