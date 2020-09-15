package com.SpringDemo.mvc.Model;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryCodes;
	private String programmingLang;
	private String[] operatingSystem;

	public Student() {
		countryCodes = new LinkedHashMap<>();
		countryCodes.put("IN", "India");
		countryCodes.put("FR", "France");
		countryCodes.put("GE", "Germany");
		countryCodes.put("BR", "Brazil");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryCodes() {
		return countryCodes;
	}

	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
