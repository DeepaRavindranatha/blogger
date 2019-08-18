package com.example.app.dto;

public class PostRequestDTO {
	private String postName;
	private String  postText;
	private int  postStatus;

	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public PostRequestDTO(String postName, String postText, int postStatus) {
		super();
		this.postName = postName;
		this.postText = postText;
		this.postStatus = postStatus;
	}
	
	
}
