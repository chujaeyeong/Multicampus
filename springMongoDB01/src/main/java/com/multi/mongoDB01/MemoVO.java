package com.multi.mongoDB01;

public class MemoVO {
	private String name;
	private double age;
	private String office;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "MemoVO [name=" + name + ", age=" + age + ", office=" + office + ", tel=" + tel + "]";
	}
	
	

}
