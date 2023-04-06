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

//	@Autowired
//	ReplyDAO dao2;

	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag, BbsDAO dao) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no, BbsDAO dao) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}

//	@RequestMapping("one2.multi")
//	public void one(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		//검색결과가 있는지 프린트!
//		System.out.println(bag);
//		ArrayList<ReplyVO> list = dao2.list(no);
//		model.addAttribute("list", list);
//		model.addAttribute("bag", bag);
//	}
//	
//	@RequestMapping("one22")
//	@ResponseBody 
//	// ResponseBody : views로 넘어가지 않고 return값이 bag 데이터를 json으로 만들어서 클라이언트로 전송 
//	// 클라이언트 브라우저에서는 success: function(x)
//	// 결과값의 함수의 입력변수인 x로 쏙 들어간다! 
//	public BbsVO one22(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		//검색결과가 있는지 프린트!
//		System.out.println(bag);
//		return bag;
//	}
//	
//	@RequestMapping("list2")
//	public void list(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("list5") // ajax
//	public void list5(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("list55") // ajax
//	@ResponseBody
//	public ArrayList<BbsVO> list55(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		return list;
//	}
//	
//	@RequestMapping("one6")
//	public void one6(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		//검색결과가 있는지 프린트!
//		System.out.println(bag);
//		ArrayList<ReplyVO> list = dao2.list(no);
//		model.addAttribute("list", list);
//		model.addAttribute("bag", bag);
//	}
//	
//	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
//	
//	
//	@RequestMapping("update5")
//	public void update5(BbsVO bag, Model model) {
//		System.out.println("update요청됨.");
//		System.out.println(bag);	
//		dao.update(bag);
//		model.addAttribute("bag", bag);
//	}
//	
//	@RequestMapping("delete5")
//	public void delete5(int no, Model model) {
//		System.out.println("delete요청됨.");
//		System.out.println(no);
//		dao.delete(no);
//		model.addAttribute("no", no);
//	}
//	
	
}