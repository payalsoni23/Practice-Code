package com.SpringDemo.mvc.Model;

import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.SpringDemo.mvc.Validation.CourseCode;

public class Student {

	@Size(min = 10, max = 10, message = "must have 10 digits")
//	@NotNull(message = "is required")
	@Pattern(regexp = "^[0-9]{10}", message = "only digits allowed")
	private String mobileNumber;

	@Min(value = 1, message = "must be greater than 0")
	@Max(value = 9, message = "must be less than 10")
	@NotNull(message = "is required")
	private Integer passes;

//	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@CourseCode
	private String code;

	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryCodes;
	private String programmingLang;
	private String[] operatingSystem;

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", countryCodes="
				+ countryCodes + ", programmingLang=" + programmingLang + ", operatingSystem="
				+ Arrays.toString(operatingSystem) + "]";
	}

	public Student() {
		countryCodes = new LinkedHashMap<>();
		countryCodes.put("IN", "India");
		countryCodes.put("FR", "France");
		countryCodes.put("GE", "Germany");
		countryCodes.put("BR", "Brazil");
	}

	public Integer getPasses() {
		return passes;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setCountryCodes(LinkedHashMap<String, String> countryCodes) {
		this.countryCodes = countryCodes;
	}

	public void setPasses(Integer passes) {
		this.passes = passes;
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

	public String getCourseCode() {
		return code;
	}

	public void setCourseCode(String courseCode) {
		code = courseCode;
	}

}
