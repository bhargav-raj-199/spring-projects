package com.doctorapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Doctor;


@Repository
public interface IDoctorRepository extends JpaRepository<Doctor,Integer>{

	@Query("from Doctor d inner join d.hospital h where h.hospitalName=?1")
	List<Doctor> getByHospital(String hospitalName);
	@Query("from Doctor d inner join d.address a where d.speciality=?1 and a.city=?2")
	List<Doctor> getBySpecialityAndCity(String speciality,String city);
	List<Doctor> getBySpeciality(String speciality);
	List<Doctor> getBySpecialityAndExperience(String speciality,int experience);
	@Query("from Doctor d inner join d.hospital h where d.speciality=?1 and h.hospitalName=?2")
	List<Doctor> getBySpecialityAndHospital(String speciality,String hospitalName);
	List<Doctor> getBySpecialityAndFees(String speciality,double fees);
	@Query("from Doctor d inner join d.casesheet c where c.caseId=?1")
	Doctor getByCaseSheet(int casesheetId);
	
}
