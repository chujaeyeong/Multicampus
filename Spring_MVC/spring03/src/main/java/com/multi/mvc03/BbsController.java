package com.multi.mvc03;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BbsDAO dao;


	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {

		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {

		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(BbsVO bag) {

		System.out.println("delete요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.delete(bag);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
}