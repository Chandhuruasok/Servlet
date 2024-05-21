package com.server.model;

public class PojoClass {
String userName,email,password,confirmPassword,dob,phoneNumber,gender,food;



public PojoClass(String userName, String email, String password, String confirmPassword, String dob, String phoneNumber,
		String gender, String food) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.dob = dob;
	this.phoneNumber = phoneNumber;
	this.gender = gender;
	this.food = food;
}

public String getFood() {
	return food;
}

public void setFood(String food) {
	this.food = food;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}


@Override
public String toString() {
	return "PojoClass [userName=" + userName + ", email=" + email + ", password=" + password + ", confirmPassword="
			+ confirmPassword + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", food="
			+ food + "]";
}

public PojoClass()
{
	
}
}
