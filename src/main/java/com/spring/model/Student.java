package com.spring.model;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;




public class Student {
	
	@javax.validation.constraints.NotNull(message = "required")
	@javax.validation.constraints.Size(min =1 , message = "reqired" )
	private String fname;
	
	private String lname;
	
	@NotNull(message = "required")
	@Max(value = 50 , message = "must be 50 or younger ")
	@Min(value = 20 , message = "must be 20 or older ")
	private String age;
	
	private Integer code;
	
	public Integer getCode() {
		return code;
	}



	public void setCode(Integer code) {
		this.code = code;
	}

	@NotNull(message = "required")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid Email")      // fixed email regexp from google
	private String email;
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	private String country ;
	
	private HashMap<String, String> countryOptions;
	
	private String language;
	
	private String []players;
	

	public Student() {
		countryOptions=new HashMap<>();
	    countryOptions.put("Egypt", "EG");
	    countryOptions.put("Brazel", "BR");
	    countryOptions.put("France", "FR");
	    countryOptions.put("Germany", "GE");
	}

	

	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}
	
	 



	public String[] getPlayers() {
		return players;
	}



	public void setPlayers(String[] players) {
		this.players = players;
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
