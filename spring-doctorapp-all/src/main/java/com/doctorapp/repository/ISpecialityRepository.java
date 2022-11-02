package com.doctorapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Speciality;


@Repository
public interface ISpecialityRepository extends JpaRepository<Speciality,Integer>{

	@Query("from Speciality s inner join s.doctors d where d.doctorName=?1")
	List<Speciality> getByDoctor(String name);
	@Query("from Speciality s where s.specialityName=?1")
	List<Speciality> getBySpeciality(String specialityName);
	
}
