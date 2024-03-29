package com.example.app.dto;


public class UserRequestDTO {

	private String userName;

    private String email;

    private String password;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public UserRequestDTO(String userName, String email,  String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
