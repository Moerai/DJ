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
	
	//나의 등급	
	@RequestMapping("/api/member/member_class")
	@ResponseBody
	public ResponseData<Object> member_class(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	
	//프로필 이미지 변경
	@RequestMapping("/api/member/profile_image_change")
	@ResponseBody
	public ResponseData<Object> profile_image_change(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	// 커뮤니티
	@RequestMapping("/api/member/community")
	@ResponseBody
	public ResponseData<Object> community(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	
	//알림설정
	@RequestMapping("/api/member/Alarm_Setting")
	@ResponseBody
	public ResponseData<Object> Alarm_Setting(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	// 쪽지설정
	@RequestMapping("/api/member/Message_Setting")
	@ResponseBody
	public ResponseData<Object> Message_Setting(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	
	// 암호잠금
	
	@RequestMapping("/api/member/Password_Lock")
	@ResponseBody
	public ResponseData<Object> Password_Lock(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	
	//공지사항
	@RequestMapping("/api/member/Notice")
	@ResponseBody
	public ResponseData<Object> Notice(Model model, HttpServletRequest request, 
			HttpServletResponse response,Member parameter) {
			
		return null;
	}
	//문의하기

	
	
	
	

}
