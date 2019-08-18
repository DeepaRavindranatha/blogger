package com.example.app.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(notes = "name of the User")

	private String userName;
    @ApiModelProperty(notes = "salary of the user")

    private int userID;
    @ApiModelProperty(notes = "email of the User")

    private String email;
    @ApiModelProperty(notes = "about the User")

    private String aboutUser;

    private Date createDate;
    private Date lastLoginDate;

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAboutUser() {
		return aboutUser;
	}
	public User(String userName, String email, String aboutUser) {
		super();
		this.userName = userName;
		this.email = email;
		this.aboutUser = aboutUser;
	}
	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}
	public User(String userName, int userID, String email, String aboutUser) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.email = email;
		this.aboutUser = aboutUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
