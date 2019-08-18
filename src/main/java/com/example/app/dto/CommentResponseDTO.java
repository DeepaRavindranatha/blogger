package com.example.app.dto;

import java.sql.Date;

public class CommentResponseDTO {
	private Integer commentId;
	private String comment;
	private Integer likeCount;
	private Integer userId;
	private Date createDate;

	public CommentResponseDTO() {
		
			
	}
	
	public CommentResponseDTO(Integer commentId, String comment, Integer likeCount, Integer userId, Date createDate) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.likeCount = likeCount;
		this.userId = userId;
		this.createDate = createDate;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}
