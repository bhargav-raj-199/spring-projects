package com.doctorapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Speciality {

	@Id
	@GeneratedValue(generator="speciality_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="speciality_gen",sequenceName="speciality_seq",initialValue=80,allocationSize=1)
	private Integer specialityId;
	@Column(name="specialityname")
	private String specialityName;
	@JsonIgnore
	@ManyToMany(mappedBy="speciality")
	private Set<Doctor> doctors;
	public Speciality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Speciality(String specialityName) {
		super();
		this.specialityName = specialityName;
	}
	/**
	 * @return the specialityId
	 */
	public Integer getSpecialityId() {
		return specialityId;
	}
	/**
	 * @param specialityId the specialityId to set
	 */
	public void setSpecialityId(Integer specialityId) {
		this.specialityId = specialityId;
	}
	/**
	 * @return the specialityName
	 */
	public String getSpecialityName() {
		return specialityName;
	}
	/**
	 * @param specialityName the specialityName to set
	 */
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	@Override
	public String toString() {
		return "Speciality [specialityName=" + specialityName + "]";
	}
	
	
}
