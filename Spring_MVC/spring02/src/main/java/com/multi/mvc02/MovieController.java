package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러로 등록, 싱글톤 생성 
public class MovieController {

	@RequestMapping("movie")
	public void com(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("복숭아");
		list.add("포도");
		list.add("귤");
		list.add("오렌지");
		model.addAttribute("list", list);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("제주도");
		list2.add("일본");
		list2.add("베트남");
		list2.add("스위스");
		model.addAttribute("list2", list2);
	}
}