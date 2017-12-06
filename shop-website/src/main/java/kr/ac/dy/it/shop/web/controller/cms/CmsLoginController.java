package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.dto.CmsMember;
import kr.ac.dy.it.shop.biz.service.CmsMemberService;
import kr.ac.dy.it.shop.common.util.ResponseUtils;
import kr.ac.dy.it.shop.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class CmsLoginController {

	@Autowired
	CmsMemberService cmsMemberService;

	// 로그인
	@RequestMapping("/cms/login")
	public String login(HttpSession session) {
		if (session.getAttribute("id") != null)
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
	public String loginSubmit(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session
			, CmsMember parameter) {

		CmsMember member = cmsMemberService.selectCmsMemberById(parameter.getId());

		// 입력값 체크
		if (StringUtils.isEmpty(parameter.getId())) {
			ResponseUtils.htmlAlertAndHistoryback(response, "아이디를 입력해주세요.");
		}
		if (StringUtils.isEmpty(parameter.getPw())) {
			ResponseUtils.htmlAlertAndHistoryback(response, "비밀번호를 입력해주세요.");
		}
		if (member == null) {
			ResponseUtils.htmlAlertAndHistoryback(response, "이디 혹은 비밀번호가 올바르지 않습니다.");
			return "";
		}
		if (StringUtils.equals(member.getPw(), parameter.getPw())) {
			session.setAttribute("id", member.getId());
			return "redirect:/cms/member/memberList";
		}
		ResponseUtils.htmlAlertAndHistoryback(response, "아이디 혹은 비밀번호가 올바르지 않습니다.");
		return "";
	}
}