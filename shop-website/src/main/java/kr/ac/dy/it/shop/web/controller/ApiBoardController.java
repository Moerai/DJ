package kr.ac.dy.it.shop.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Member;

import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ApiBoardController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/api/member/board")
	@ResponseBody
	public ResponseData<Object> board(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>();

	}

	@RequestMapping("/api/member/myboard") // 내가쓴글
	@ResponseBody
	public ResponseData<Object> myboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/reboard") // 댓글단글
	@ResponseBody
	public ResponseData<Object> reboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/allboard") // 모든게시판
	@ResponseBody
	public ResponseData<Object> allboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/hotboard") // 인기게시판
	@ResponseBody
	public ResponseData<Object> hotboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/studyboard") // 공부게시판
	@ResponseBody
	public ResponseData<Object> studyboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/loveboard") // 연애게시판
	@ResponseBody
	public ResponseData<Object> loveboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/drinkboard") // 음주게시판
	@ResponseBody
	public ResponseData<Object> drinkboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/infoboard") // 정보게시판
	@ResponseBody
	public ResponseData<Object> infoboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}

	@RequestMapping("/api/member/hongboboard") // 홍보게시판
	@ResponseBody
	public ResponseData<Object> hongboboard(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		return new ResponseData<Object>(false, "에러임...");

	}
}
