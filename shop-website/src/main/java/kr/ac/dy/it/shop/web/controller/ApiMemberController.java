package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class ApiMemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/api/member/login")
	public @ResponseBody Member apiLogin(Member parameter, HttpSession sesstion) {
	        Member member = memberService.getMember(parameter);
	        return member;
	    }
	
	@RequestMapping("/api/member/idcheck")
	@ResponseBody
	public Member idCheck(String userId, HttpSession sesstion, HttpServletRequest request, HttpServletResponse response) {
	        Member member = memberService.getMemberByUserId(userId);
	        return member;
	    }
	

	@RequestMapping("/api/member/register")
	@ResponseBody
	public ResponseData<Object> register(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		boolean result= memberService.addMember(parameter);

		return new ResponseData<Object>(result,(result ? "회원가입 성공":"회원가입 실패"));
		

	}
	
	
	
}
