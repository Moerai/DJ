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
public class ApiMemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/api/member/login")
	@ResponseBody
	public ResponseData<Object> index(Model model, HttpServletRequest request, HttpServletResponse response,
			Member parameter) {

		if (parameter.getUserId() != null && parameter.getUserId().equals("test") && parameter.getPassword() != null
				&& parameter.getPassword().equals("1234")) {
			return new ResponseData<Object>();
		} else {
			return new ResponseData<Object>(false, " 회원정보가 정확하지 않습니다. ");
		}

	}

}
