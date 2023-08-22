package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeetingController {
	
	@Autowired
	MeetingDAO dao; // 전역변수(글로벌변수) 
	
	@RequestMapping("MeetingInsert")
	public void insert(MeetingVO bag) {

		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);

		dao.insert(bag);
	}
	
//	@RequestMapping("MeetingUpdate")
//	public void update(MeetingVO bag) {
//		System.out.println("update요청됨.");
//		System.out.println(bag);
//		
//		dao.update(bag);
//	}
//	
//	
//	@RequestMapping("MeetingDelete")
//	public void delete(String rank) {
//		System.out.println("delete요청됨.");
//		System.out.println(rank);
//		
//		dao.delete(rank);
//	}
//	
//	@RequestMapping("MeetingOne")
//	public void one(String rank, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(rank);
//		
//		MeetingVO bag = dao.one(rank);
//		// bag에 검색결과 다 들어있음. 
//		// views 아래 one.jsp로 쓸 수 있도록 설정해주어야함. 
//		model.addAttribute("bag", bag);
//		// views까지 전달할 속성으로 추가해주세요. 
//	}
	
	@RequestMapping("MeetingList")
	public void list(Model model) {
		// Model은 컨트롤러의 list를 view/list.jsp까지만 전달할 수 있는 객체 
		ArrayList<MeetingVO> list = dao.list();
		model.addAttribute("list", list);
	}

}
