package com.doctorapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Address;
import com.doctorapp.model.Casesheet;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Hospital;
import com.doctorapp.model.Specialisation;
import com.doctorapp.model.Speciality;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.IHospitalService;
import com.doctorapp.service.ISpecialityService;

@SpringBootApplication
public class SpringDoctorappAllApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappAllApplication.class, args);
	}

	
	private IDoctorService doctorService;
	
	
	@Autowired
	/**
	 * @param doctorService the doctorService to set
	 */
	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}

	private IHospitalService hospitalService;
	
	
	@Autowired
	/**
	 * @param hospitalService the hospitalService to set
	 */
	public void setHospitalService(IHospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}

	private ISpecialityService specialityService;
	
	@Autowired
	/**
	 * @param specialityService the specialityService to set
	 */
	public void setSpecialityService(ISpecialityService specialityService) {
		this.specialityService = specialityService;
	}


	@Override
	public void run(String... args) throws Exception {

//		Address address=new Address("gandhi nagar", "Hyderabad", "Telangana");
//		//Speciality speciality0=new Speciality(Specialisation.DERM.getSpeciality()); 
//		//Speciality speciality1=new Speciality(Specialisation.PHYSICIAN.getSpeciality()); 
//		//Speciality speciality2=new Speciality(Specialisation.NEPH.getSpeciality()); 
//		//Speciality speciality3=new Speciality(Specialisation.NEURO.getSpeciality());
//		Set<Speciality> specialities=new HashSet<>(Arrays.asList(speciality0,speciality1,speciality2,speciality3));
//		
//		Hospital hospital=new Hospital("KIMS","Hyderabad");
		
//		
//		Doctor doctor=new Doctor("Bhargav Raj",5000,"bhargav@gmail.com", 10);
//		doctor.setAddress(address);
//		doctor.setCasesheet(casesheets);
//		doctor.setHospital(hospital);
//		doctor.setSpeciality(specialities);
//		doctorService.addDoctor(doctor);
//		
//		Hospital hospital=new Hospital("Yashoda Hospitals","Hyderabad");
//		Hospital hospital1=new Hospital("Mayuri Hospitals","Hyderabad");
//		Hospital hospital2=new Hospital("Begumpet Hospitals","Hyderabad");
//		Hospital hospital3=new Hospital("Raj Hospitals","Hyderabad");
//		Hospital hospital4=new Hospital("Manipal Hospitals","Hyderabad");
//		Hospital hospital5=new Hospital("Bits Pilani Hospitals","Hyderabad");
//		Hospital hospital6=new Hospital("RIIMS Hospitals","Hyderabad");
//		Hospital hospital7=new Hospital("Appolo Hospitals","Hyderabad");
//		Hospital hospital8=new Hospital("KIMS","Hyderabad");
//		hospitalService.addHospital(hospital);
//		Speciality speciality=new Speciality(Specialisation.DERM.getSpeciality());
//		specialityService.addSpeciality(speciality);
//		Speciality speciality1=new Speciality(Specialisation.GYNO.getSpeciality());
//		specialityService.addSpeciality(speciality1);
//		Speciality speciality2=new Speciality(Specialisation.PHYSICIAN.getSpeciality());
//		specialityService.addSpeciality(speciality2);
//		Speciality speciality3=new Speciality(Specialisation.NEPH.getSpeciality());
//		specialityService.addSpeciality(speciality3);
//		Speciality speciality4=new Speciality(Specialisation.NEURO.getSpeciality());
//		specialityService.addSpeciality(speciality4);
//		Speciality speciality5=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		Speciality speciality6=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		Speciality speciality7=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		Speciality speciality8=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		Speciality speciality9=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		Speciality speciality10=new Speciality(Specialisation.CAR.getSpeciality());
//		specialityService.addSpeciality(speciality5);
//		
		Doctor doctor1=new Doctor("rajini kanth",1000,"kanth@gmail.com", 10);
		Casesheet casesheet0=new Casesheet("Dialysis");
		Casesheet casesheet1=new Casesheet("Cough and Cold");
		Casesheet casesheet2=new Casesheet("Skin Allergy");
		Casesheet casesheet3=new Casesheet("Tumor in Brain");
		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet0,casesheet1,casesheet2,casesheet3));
		Set<Speciality> specialities=new HashSet<>(Arrays.asList(specialityService.getById(80),specialityService.getById(81),specialityService.getById(82)));
		Address address=new Address("gandhi nagar", "Hyderabad", "Telangana");
		doctor1.setAddress(address);
		doctor1.setCasesheet(casesheets);
		doctor1.setHospital(hospitalService.getById(1000));
		doctor1.setSpeciality(specialities);
		doctorService.addDoctor(doctor1);
//		Doctor doctor2=new Doctor("allu arjun",2000,"pushpa@gmail.com", 1);
//		Casesheet casesheet0=new Casesheet("Dialysis");
//		Casesheet casesheet1=new Casesheet("Cough and Cold");
//		Casesheet casesheet2=new Casesheet("Skin Allergy");
//		Casesheet casesheet3=new Casesheet("Tumor in Brain");
//		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet0,casesheet1,casesheet2,casesheet3));
//		Doctor doctor3=new Doctor("prabhas",500,"prabhas@gmail.com", 2);
//		Casesheet casesheet0=new Casesheet("Dialysis");
//		Casesheet casesheet1=new Casesheet("Cough and Cold");
//		Casesheet casesheet2=new Casesheet("Skin Allergy");
//		Casesheet casesheet3=new Casesheet("Tumor in Brain");
//		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet0,casesheet1,casesheet2,casesheet3));
//		Doctor doctor4=new Doctor("Rolex",1000,"rolex@gmail.com", 3);
//		Casesheet casesheet0=new Casesheet("Dialysis");
//		Casesheet casesheet1=new Casesheet("Cough and Cold");
//		Casesheet casesheet2=new Casesheet("Skin Allergy");
//		Casesheet casesheet3=new Casesheet("Tumor in Brain");
//		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet0,casesheet1,casesheet2,casesheet3));
//		Doctor doctor5=new Doctor("nikhil",1000,"nikhil@gmail.com", 4);
//		Doctor doctor6=new Doctor("sonia",1000,"sonia@gmail.com", 5);
//		Doctor doctor7=new Doctor("kamala",1000,"kamala@gmail.com", 5);
//		Doctor doctor8=new Doctor("jyothi",1000,"jyothi@gmail.com", 2);
		
	}

	

}
