package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {
	
	@Autowired
	MemberDAO3 dao; // 전역변수(글로벌변수) 
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
		System.out.println(bag);
		// dao를 이용해서 DB처리할예정. 
		// views아래로 넘어가게 되어있음. 
		// views아래 login.jsp를 호출하게됨. 
		int result = dao.login(bag); // 1, 0
		if (result == 1) {
			return "ok"; //view아래 파일을 띄워줌 
		} else {
			// 로그인에 실패했을 때 views 아래가 아니고, webapp아래 
			// member.jsp로 가고싶은 경우! 리다이렉트 (redirect)로 방향을 틀어라 
			// webapp 아래서 찾기 때문에, jsp 확장자명도 꼭 붙여줘야함 
			return "redirect:member.jsp";
		}
	}

	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	
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
		
		MemberVO bag = dao.one(id);
		// bag에 검색결과 다 들어있음. 
		// views 아래 one.jsp로 쓸 수 있도록 설정해주어야함. 
		model.addAttribute("bag", bag);
		// views까지 전달할 속성으로 추가해주세요. 
	}
	
	@RequestMapping("list")
	public void list(MemberVO bag) {
		System.out.println("list요청됨.");
		System.out.println(bag);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
}