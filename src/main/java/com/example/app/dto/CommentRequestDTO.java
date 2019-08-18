package com.example.app.dto;

public class CommentRequestDTO {
	private Integer userId;
	private String comment;
	public CommentRequestDTO(Integer userId, String comment) {
		super();
		this.userId = userId;
		this.comment = comment;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
