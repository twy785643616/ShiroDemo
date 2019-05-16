package com.twy.demo6;

public class Penson {
	private String pname;
	private Integer age;
	private Address homeAddr;
	private Address companyAddr;
	public Penson(){
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(Address companyAddr) {
		this.companyAddr = companyAddr;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person "+pname+","+age+","+homeAddr+","+companyAddr+"-----";
		
	}
}
