package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

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
	
	
	

	@RequestMapping("/api/member/register")
	@ResponseBody
	public ResponseData<Object> register(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {
		
		parameter.setUserName(parameter.getUserName() + "바보");
		
		
		return new ResponseData<Object>(true, parameter);
		

	}
	
	
	
}
