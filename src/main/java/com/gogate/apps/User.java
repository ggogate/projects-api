package com.gogate.apps;

public class User {

	private Long id;
	private String first, last, email;

	public User(long l, String first, String email) {
		// TODO Auto-generated constructor stub
		this.id = l;
		this.first = first;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public String getEmail() {
		return email;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}