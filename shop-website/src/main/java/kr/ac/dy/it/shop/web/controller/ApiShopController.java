package kr.ac.dy.it.shop.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.MemberService;

public class ApiShopController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/api/member/myitem")//내상품보기
	@ResponseBody
	public String myitem(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {
		return "내상품보기" ;

	}
	@RequestMapping("/api/member/select")//찜목록
	@ResponseBody
	public ResponseData<Object> select(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
	@RequestMapping("/api/member/man")//남성의류
	@ResponseBody
	public ResponseData<Object> man(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
	@RequestMapping("/api/member/woman")//여성의류
	@ResponseBody
	public ResponseData<Object> woman(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
	@RequestMapping("/api/member/bag")//가방
	@ResponseBody
	public ResponseData<Object> bag(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
	@RequestMapping("/api/member/watch")//시계
	@ResponseBody
	public ResponseData<Object> watch(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
	@RequestMapping("/api/member/accessory")//악세사리
	@ResponseBody
	public ResponseData<Object> accessory(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/cosmetics")//화장품
	@ResponseBody
	public ResponseData<Object> cosmetics(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/perfume")//향수
	@ResponseBody
	public ResponseData<Object> perfume(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

		
	}

	@RequestMapping("/api/member/phone")//핸드폰
	@ResponseBody
	public ResponseData<Object> phone(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/elec")//전자기기
	@ResponseBody
	public ResponseData<Object> elec(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/book")//책
	@ResponseBody
	public ResponseData<Object> book(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/etc")//기타
	@ResponseBody
	public ResponseData<Object> etc(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}

	@RequestMapping("/api/member/showall")//전체보기
	@ResponseBody
	public ResponseData<Object> showall(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return null ;

	}
}
