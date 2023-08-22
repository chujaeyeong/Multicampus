package com.multi.mvc03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class PlaceController {

	@Autowired
	PlaceDAO dao;


	@RequestMapping("insert10.place")
	public void insert(PlaceVO bag) {

		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
		// 
	}
	
	@RequestMapping("update10.place")
	public void update(PlaceVO bag) {

		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("delete10.place")
	public void delete(String name) {

		System.out.println("delete요청됨.");
		System.out.println(name);
		System.out.println(dao);
		dao.delete(name);
	}
	
	@RequestMapping("one10.place")
	public void one(String name, Model model) {
		System.out.println("one요청됨.");
		System.out.println(name);
		PlaceVO bag = dao.one(name);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list10.place")
	public void list(Model model) {
		List<PlaceVO> list = dao.list();
		model.addAttribute("list", list);
	}
}