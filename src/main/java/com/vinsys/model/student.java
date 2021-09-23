package com.vinsys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_details")

public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int stu_id;
	@Column
	private String name;
	@Column
	private long contact_no;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public student(int stu_id, String name, long contact_no, String address, String city, int marks) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.contact_no = contact_no;
		this.address = address;
		this.city = city;
		this.marks = marks;
	}


	
	public student() {
		super();
		//TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [stu_id=" + stu_id + ", name=" + name + ", contact_no=" + contact_no + ", address=" + address
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

	

}
