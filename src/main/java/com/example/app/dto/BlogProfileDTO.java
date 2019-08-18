package com.example.app.dto;

public class BlogProfileDTO {
	private String displayName;
	private String blogName;
	private String aboutBlog;
	private String aboutUser;

	public BlogProfileDTO(String blogName, String aboutBlog, String aboutUser, String displayName) {
		super();
		this.blogName = blogName;
		this.aboutBlog = aboutBlog;
		this.aboutUser = aboutUser;
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
