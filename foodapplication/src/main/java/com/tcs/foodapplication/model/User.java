package com.tcs.foodapplication.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Entity Bean Class - A Bean Class representing Database Table
//Bean Class

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int userId;
	
	private String username;
	private String password;
	private String email;
	private String mobile;
	
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private Role role;
	
	@ManyToMany
	private Set<Role> role;
	
//	@OneToMany(fetch=FetchType.EAGER, mappedBy="user", cascade=CascadeType.ALL)
//	private Set<Cart> cart;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String password, String email, String mobile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
}
