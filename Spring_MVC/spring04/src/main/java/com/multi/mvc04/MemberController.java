package com.multi.mvc04;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {
	
	@Autowired
	MemberDAO3 dao; // 전역변수(글로벌변수) 
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색

	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		
		// dao에게 insert 요청~! 
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		
		dao.delete(id);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO vo = dao.one(id);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MemberVO> list = dao.list();
		// view 아래까지 전달할 데이터를 model 객체를 이용해서 
		// 속성으로 지정해주세요. 
		model.addAttribute("list", list); // 속성으로 지정 
	}
	
	
	
}