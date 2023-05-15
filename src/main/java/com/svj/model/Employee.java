package com.svj.model;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String mobNo;
	public Employee(int id, String name, String address,String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobNo=mobNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ",mobNo="+mobNo+"]";
	}
	
}
