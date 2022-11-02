package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Casesheet;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.IDoctorRepository;


@Service
public class DoctorServiceImpl implements IDoctorService{

	private IDoctorRepository doctorRepository;
	@Autowired
	/**
	 * @param doctorRepository the doctorRepository to set
	 */
	public void setDoctorRepository(IDoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorRepository.deleteById(doctorId);
	}

	@Override
	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getById(int doctorId) {
		return doctorRepository.findById(doctorId).get();
	}

	@Override
	public List<Doctor> getByHospital(String hospitalName) {
		return doctorRepository.getByHospital(hospitalName);
	}

	@Override
	public List<Doctor> getBySpecialityAndCity(String speciality, String city) {
		return doctorRepository.getBySpecialityAndCity(speciality, city);
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		return doctorRepository.getBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) {
		// TODO Auto-generated method stub
		return doctorRepository.getBySpecialityAndExperience(speciality, experience);
	}

	@Override
	public List<Doctor> getBySpecialityAndHospital(String speciality, String hospitalName) {
		return doctorRepository.getBySpecialityAndHospital(speciality, hospitalName);
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return doctorRepository.getBySpecialityAndFees(speciality, fees);
	}

	@Override
	public Doctor getByCaseSheet(int casesheetId) {
		// TODO Auto-generated method stub
		return doctorRepository.getByCaseSheet(casesheetId);
	}

}
