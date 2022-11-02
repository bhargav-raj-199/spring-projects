package com.doctorapp.model;

public enum Specialisation {
PHYSICIAN("General Physician"),
DERM("Dermatology"),
NEURO("Neurologist"),
GYNO("Gynecologis"),
CAR("Cardiologist"),
NEPH("Nephrologist"),
DENT("Dentist"),
ORTHO("Orthopedician"),
PEADO("Pediatrician"),
PSHYC("Psychiatrist"),
SUR("Surgeon");
	
	

	private String specialityName;

	private Specialisation(String specialityName) {
		this.specialityName = specialityName;
	}

	/**
	 * @return the specialityName
	 */
	public String getSpeciality() {
		return specialityName;
	}
	
	
	
}
