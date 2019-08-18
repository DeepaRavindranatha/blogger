package com.example.app.dto;

import java.sql.Date;
import java.util.List;


public class PostResponseDTO {
	private Integer  postId;
	private String postName;
	private String  postText;
	private Integer likeCount;
	private Date createDate;
	private List<CommentResponseDTO> comments;
	
	public PostResponseDTO() {
	
	}
	
	public PostResponseDTO(Integer postId, String postName, String postText, Integer likeCount, Date createDate, List<CommentResponseDTO> comments	) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postText = postText;
		this.likeCount = likeCount;
		this.createDate = createDate;
		this.comments = comments;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

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

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<CommentResponseDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentResponseDTO> comments) {
		this.comments = comments;
	}
	
	
	
}
