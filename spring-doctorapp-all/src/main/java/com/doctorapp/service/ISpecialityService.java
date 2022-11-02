package com.doctorapp.service;

import java.util.List;

import com.doctorapp.model.Speciality;

public interface ISpecialityService {

	void addSpeciality(Speciality speciality);
	void updateSpeciality(Speciality speciality);
	void deleteSpeciality(int specialityId);
	List<Speciality> getAll();
	Speciality getById(int specialityId);
	
	List<Speciality> getByDoctor(String name);
	List<Speciality> getBySpeciality(String specialityName);
	
	
}
