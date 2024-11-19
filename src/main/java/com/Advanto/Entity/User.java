package com.Advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String uname;
	private long conNo;
	private String email;
    private String passward;
	public User(int id, String uname, long conNo, String email, String passward) {
		super();
		this.id = id;
		this.uname = uname;
		this.conNo = conNo;
		this.email = email;
		this.passward = passward;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getConNo() {
		return conNo;
	}
	public void setConNo(long conNo) {
		this.conNo = conNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", conNo=" + conNo + ", email=" + email + ", passward="
				+ passward + "]";
	}
    
	
}
