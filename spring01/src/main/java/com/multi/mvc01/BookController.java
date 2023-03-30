package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao; // 전역변수(글로벌변수) 선언

	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {
		System.out.println("브라우저에서 북마크 insert요청됨.");
		System.out.println();
		System.out.println(dao);
		dao.insert(bag);

	}

	@RequestMapping("one3.multi")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		
		BookDTO bag = dao.one(id); // bag에 검색결과가 들어있을거임. 
		model.addAttribute("bag", bag);
		// views까지 전달 할 속성으로 추가해주세요.
	}
	
	@RequestMapping("list3.multi")
	public void list(Model model) {
		ArrayList<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	

}