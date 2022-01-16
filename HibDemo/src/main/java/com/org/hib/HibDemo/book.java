package com.org.hib.HibDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="book1")
public class book {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int bno;
	private String bname;
	private int price;
	public int getbno() {
		return bno;
	
	}
	public void setbno(int bno) {
		this.bno=bno;
	}
	public String getbname() {
		return bname;
	
	}
	public void setbname(String bname) {
		this.bname=bname;
	
	}
	public int price() {
		return price;
	
	}
	public void setprice(int price) {
		this.price=price;
	
	}


}

