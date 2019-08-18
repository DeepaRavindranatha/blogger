package com.example.app.dto;

public class UserResponseDTO {
	private String userName;

    private String email;
   
    private int userId;


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public UserResponseDTO(String userName, String email,  int userId) {
		this.userName = userName;
		this.email = email;
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
