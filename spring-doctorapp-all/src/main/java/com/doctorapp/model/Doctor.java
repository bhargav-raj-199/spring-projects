package com.doctorapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(generator="doctor_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="doctor_gen",sequenceName="doctor_seq",initialValue=100,allocationSize=1)
	private Integer doctorId;
	
	@Column(name="doctorname")
	private String doctorName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	@ManyToMany(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	@JoinTable(name="doctor_speciality",
	joinColumns=@JoinColumn(name="doctor_id"),
	inverseJoinColumns=@JoinColumn(name="speciality_id"))
	private Set<Speciality> speciality;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="doctor_id")
	private Set<Casesheet> casesheet;
	private double fees;
	//@Column(unique=true)
	private String email;
	private int experience;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="hospital")
	private Hospital hospital;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, double fees, String email, int experience) {
		super();
		this.doctorName = doctorName;
		this.fees = fees;
		this.email = email;
		this.experience = experience;
	}
	/**
	 * @return the doctorId
	 */
	public Integer getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * @return the speciality
	 */
	public Set<Speciality> getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(Set<Speciality> speciality) {
		this.speciality = speciality;
	}
	
	/**
	 * @return the casesheet
	 */
	public Set<Casesheet> getCasesheet() {
		return casesheet;
	}
	/**
	 * @param casesheet the casesheet to set
	 */
	public void setCasesheet(Set<Casesheet> casesheet) {
		this.casesheet = casesheet;
	}
	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return hospital;
	}
	/**
	 * @param hospital the hospital to set
	 */
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", fees=" + fees + ", email=" + email
				+ ", experience=" + experience + "]";
	}
	
	
	
	
	
	
}
