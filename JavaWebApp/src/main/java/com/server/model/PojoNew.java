package com.server.model;

public class PojoNew {
String userName,email,phoneNumber;
int id;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public PojoNew(String userName, String email, String phoneNumber, int id) {
	super();
	this.userName = userName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.id = id;
}
public PojoNew() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PojoNew [userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", id=" + id + "]";
}



}
