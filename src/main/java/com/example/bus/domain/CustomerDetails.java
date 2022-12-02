package com.example.bus.domain;

public class CustomerDetails {

	private String firstName;

	private String lastName;

	private Integer age;

	private String sex;

	private String seatNo;

	@Override
	public String toString() {
		return "CustomerDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex
				+ ", seatNo=" + seatNo + ", UserName=" + UserName + ", phoneNo=" + phoneNo + ", alternatePhoneNo="
				+ alternatePhoneNo + ", emailAddress=" + emailAddress + "]";
	}

	public CustomerDetails(String firstName, String lastName, Integer age, String sex, String seatNo, String userName,
			Integer phoneNo, Integer alternatePhoneNo, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.seatNo = seatNo;
		UserName = userName;
		this.phoneNo = phoneNo;
		this.alternatePhoneNo = alternatePhoneNo;
		this.emailAddress = emailAddress;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getAlternatePhoneNo() {
		return alternatePhoneNo;
	}

	public void setAlternatePhoneNo(Integer alternatePhoneNo) {
		this.alternatePhoneNo = alternatePhoneNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	private String UserName;
	
	private Integer phoneNo;
	
	private Integer alternatePhoneNo;

	private String emailAddress;

}
