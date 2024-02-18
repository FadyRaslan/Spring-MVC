package com.spring.model;

import java.util.HashMap;

public class Student {
	
	private String fname;
	
	private String lname;
	
	private String age;
	
	private String country ;
	
	private HashMap<String, String> countryOptions;
	

	public Student() {
		countryOptions=new HashMap<>();
	    countryOptions.put("Egypt", "EG");
	    countryOptions.put("Brazel", "BR");
	    countryOptions.put("France", "FR");
	    countryOptions.put("Germany", "GE");
	}

	

	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}



	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}



	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	

}
