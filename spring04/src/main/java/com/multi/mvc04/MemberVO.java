package com.multi.mvc04;

public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	// 하나의 변수당 set/get 하나씩 만들어줌. 
	// 가방에 하나씩 값을 넣어주어야함. ==> setter 
	public void setId (String id) {
		this.id = id;
	}
	
	// 가방에 하나씩 값을 꺼내주어야함. ==> getter 
	public String getId () {
		return id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	// 가방에 어떤 값들이 들어있는지 String으로 다 찍어볼 수 있다. 
	
	
	
	
}
