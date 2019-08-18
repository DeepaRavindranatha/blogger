package com.example.app.dto;

public class BlogProfileResponseDTO {
	private String displayName;
	private String blogName;
	private String aboutBlog;
	private String aboutUser;
	
    private String email;
    
    private Integer userId;

	public BlogProfileResponseDTO(String displayName, String blogName, String aboutBlog, String aboutUser, String email,
			Integer userId) {
		super();
		this.displayName = displayName;
		this.blogName = blogName;
		this.aboutBlog = aboutBlog;
		this.aboutUser = aboutUser;
		this.email = email;
		this.userId = userId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getAboutBlog() {
		return aboutBlog;
	}

	public void setAboutBlog(String aboutBlog) {
		this.aboutBlog = aboutBlog;
	}

	public String getAboutUser() {
		return aboutUser;
	}

	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
    
}
