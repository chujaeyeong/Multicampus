package com.multi.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함. 
// 2가지 방법을 할 수 있음. 
// => 어노테이션(표시)방법, XML방법 

@Component
public class MemberDAO3 {
	
	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요! (클래스 바로 밑에 전역변수로 선언) 
	@Autowired
	SqlSessionTemplate my;
	
	
// 특정한 방법으로 실행하는 클래스 => 모델 클래스 (MVC)


	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.all");
		System.out.println(list.size());
		return list;
	}
	
	public MemberVO one(String id) {
		MemberVO vo = my.selectOne("member.one", id);
		System.out.println(vo);
		return vo;
	}

	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}

	
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//						namespace.id
		return result;
	}
	
	

}