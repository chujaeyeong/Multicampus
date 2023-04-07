package com.multi.mvc03;

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

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class PlaceDAO {
	
	@Autowired
	SqlSessionTemplate my;


	public int insert(PlaceVO bag) {
		int result = my.insert("place.create", bag);
		return result;
	}
	
	public int update(PlaceVO bag) {
		int result = my.update("place.update", bag);
		return result;
	}
	
	public int delete(String name) {
		int result = my.delete("place.delete", name);
		return result;
	}
	
	public PlaceVO one(String name) {
		PlaceVO bag = my.selectOne("place.one", name);
		return bag;
	}
	
	public List<PlaceVO> list() {
		List<PlaceVO> list = my.selectList("place.all");
		return list;
	}

}
