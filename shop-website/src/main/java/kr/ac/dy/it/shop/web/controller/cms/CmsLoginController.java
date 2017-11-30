package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.dto.CmsMember;
import kr.ac.dy.it.shop.biz.service.CmsMemberService;
import kr.ac.dy.it.shop.common.exception.FrontException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class CmsLoginController {

	@Autowired
	CmsMemberService cmsMemberService;

	// 로그인
	@RequestMapping("/cms/login")
	public String login(HttpSession session) {
		if(session.getAttribute("id") != null)
			return "redirect:/cms/member/memberList";
		return "cms/login";
	}

	// 로그아웃
	@RequestMapping("/cms/logout")
	public String logout(HttpSession session) {
		session.invalidate();//session id초기화
		return "redirect:/cms/login";
	}

	// 로그인
	@RequestMapping(path = "/cms/login", method = RequestMethod.POST)
	public String loginSubmit(Model model, CmsMember parameter, HttpSession session) {
		if (parameter.getId().isEmpty()) {
			throw new FrontException("아이디를 입력해주세요.", "cms/login");
		}else if( parameter.getPw().isEmpty()) {
			throw new FrontException("비밀번호를 입력해주세요.","cms/login");
		}

		CmsMember member = cmsMemberService.selectCmsMemberById(parameter.getId());

		if (member == null) {
			throw new FrontException("아이디 혹은 비밀번호가 올바르지 않습니다.", "cms/login");
		} else {
			if (member.getPw().equals(parameter.getPw())) {
				session.setAttribute("id", member.getId());
				return "redirect:/cms/member/memberList";
			}else {
				throw new FrontException("아이디 혹은 비밀번호가 올바르지 않습니다.", "cms/login");
			}
		}
	}

}