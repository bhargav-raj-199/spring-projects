package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Hospital;
import com.doctorapp.repository.IHospitalRepository;

@Service
public class HospitalServiceImpl implements IHospitalService{

	private IHospitalRepository hospitalRepository;
	@Autowired
	/**
	 * @param hospitalRepository the hospitalRepository to set
	 */
	public void setHospitalRepository(IHospitalRepository hospitalRepository) {
		this.hospitalRepository = hospitalRepository;
	}

	@Override
	public void addHospital(Hospital hospital) {
		
		hospitalRepository.save(hospital);
		
	}

	@Override
	public void updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalRepository.save(hospital);
		
	}

	@Override
	public void deleteHospital(int hospitalId) {
		// TODO Auto-generated method stub
		hospitalRepository.deleteById(hospitalId);
		
	}

	@Override
	public List<Hospital> getAll() {
		// TODO Auto-generated method stub
		return hospitalRepository.findAll();
	}

	@Override
	public Hospital getById(int hospitalId) {
		// TODO Auto-generated method stub
		return hospitalRepository.findById(hospitalId).get();
	}

	@Override
	public List<Hospital> getByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getByDoctor(String DoctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndCity(String speciality, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndDoctor(String speciality, String DoctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndExperience(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndHospital(String speciality, String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

}
