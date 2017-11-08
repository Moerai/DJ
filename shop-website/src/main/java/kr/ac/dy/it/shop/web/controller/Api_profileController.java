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
import java.util.List;

@Slf4j
@Controller
public class Api_profileController {
	
	@Autowired
	MemberService memberService;
	
	//환경설정
	@RequestMapping("/api/member/environmentSetting")
	@ResponseBody
	public ResponseData<Object> environmentSetting(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;

	}
	
	
	// 회원정보수정
	@RequestMapping("/api/member/memberUpdata")
	@ResponseBody
	public ResponseData<Object> memberUpdata(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;

	}
	
	
	

}
