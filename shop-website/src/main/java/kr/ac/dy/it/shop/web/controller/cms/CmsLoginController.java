package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CmsLoginController {

    @Autowired
    MemberService memberService;

    //로그인
    @RequestMapping(path = "/cms/login", method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

        //로그인


        return "cms/login";
    }

    //회원가입
    @RequestMapping("/member/register")
    public String memberRegister(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "member/register";
    }


    //회원관리
    @RequestMapping("/cms/member/memberList")
    public String member(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
    	
    	/*List<Member> members = new ArrayList<Member>();
    	
    	Member member1 = new Member();
    	member1.setUserId("id1");;
    	member1.setUserName("홍길동");
    	member1.setPassword("1223");    	
    	members.add(member1);    	
    	
    	Member member2 = new Member();
    	member2.setUserId("id2");;
    	member2.setUserName("이순신");
    	member2.setPassword("4444");    	
    	members.add(member2);*/
    	
    	
    	List<Member> members = memberService.gets();
    	
    	
    	
    	model.addAttribute("members", members);
    	
    	
    	

        return "cms/member/memberList";
    }
    
    

}
