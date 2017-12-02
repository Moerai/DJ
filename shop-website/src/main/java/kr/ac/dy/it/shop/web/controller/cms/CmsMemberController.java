package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CmsMemberController {

	@Autowired
	MemberService memberService;

	// 탈퇴회원
	@RequestMapping("/cms/member/members")
	public String memberse(Model model, HttpSession session) {
		if(session.getAttribute("id") == null)
			return "redirect:/cms/login";

		List<Member> members1 = memberService.gets();

		model.addAttribute("members", members1);
		return "cms/member/members";
	}

	// 회원등급
	@RequestMapping("/cms/member/memberRank")
	public String memberRank(Model model, HttpSession session) {
		if(session.getAttribute("id") == null)
			return "redirect:/cms/login";
		return "cms/member/memberRank";
	}

	// 회원관리
	@RequestMapping("/cms/member/memberList")
	public String member(Model model, HttpSession session) {
		if(session.getAttribute("id") == null)
			return "redirect:/cms/login";
		/*
		 * List<Member> members = new ArrayList<Member>();
		 *
		 * Member member1 = new Member(); member1.setUserId("id1");;
		 * member1.setUserName("홍길동"); member1.setPassword("1223");
		 * members.add(member1);
		 *
		 * Member member2 = new Member(); member2.setUserId("id2");;
		 * member2.setUserName("이순신"); member2.setPassword("4444");
		 * members.add(member2);
		 */

		List<Member> members1 = memberService.gets();

		model.addAttribute("members", members1);

		return "cms/member/memberList";
	}

	// 회원수정
	@RequestMapping("/cms/member/memberModifi")
	public String memberModifier(Model model, HttpSession session) {
		if(session.getAttribute("id") == null)
			return "redirect:/cms/login";

		return "cms/member/memberModifi";
	}
}