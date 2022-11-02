package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Speciality;
import com.doctorapp.repository.ISpecialityRepository;

@Service
public class SpecialityServiceImpl implements ISpecialityService{

	
	private ISpecialityRepository specialityRepo;
	
	@Autowired
	/**
	 * @param specialityRepo the specialityRepo to set
	 */
	public void setSpecialityRepo(ISpecialityRepository specialityRepo) {
		this.specialityRepo = specialityRepo;
	}
	@Override
	public void addSpeciality(Speciality speciality) {
		specialityRepo.save(speciality);
		
	}

	

	@Override
	public void updateSpeciality(Speciality speciality) {
		specialityRepo.save(speciality);
		
	}

	@Override
	public void deleteSpeciality(int specialityId) {
		specialityRepo.deleteById(specialityId);
	}

	@Override
	public List<Speciality> getAll() {
		return specialityRepo.findAll();
	}

	@Override
	public Speciality getById(int specialityId) {
		return specialityRepo.findById(specialityId).get();
	}
	@Override
	public List<Speciality> getByDoctor(String name) {
		return specialityRepo.getByDoctor(name);
	}
	@Override
	public List<Speciality> getBySpeciality(String specialityName) {
		return specialityRepo.getBySpeciality(specialityName);
	}

}
