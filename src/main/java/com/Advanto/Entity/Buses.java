package com.Advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bname;
	private String bno;
	private String type;
	public Buses(int bid, String bname, String bno, String type) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bno = bno;
		this.type = type;
	}
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Buses [bid=" + bid + ", bname=" + bname + ", bno=" + bno + ", type=" + type + "]";
	}
	
	
	
	
}
