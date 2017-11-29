package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.dto.CmsMember;
import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.service.CmsMemberService;
import kr.ac.dy.it.shop.biz.service.MemberService;
import kr.ac.dy.it.shop.common.exception.FrontException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CmsLoginController {

    @Autowired
    MemberService memberService;

    @Autowired
    CmsMemberService cmsMemberService;

    //로그인
    @RequestMapping("/cms/login")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/login";
    }
    //로그인
    @RequestMapping(path = "/cms/login", method = RequestMethod.POST)
    public String loginSubmit(Model model, CmsMember parameter, HttpSession session) {
        if(parameter.getId() == null || parameter.getPw() == null){
            throw new FrontException("아이디를 입력해주세요.", "cms/login");
        }

        CmsMember member = cmsMemberService.selectCmsMemberById(parameter.getId());

        if(member == null){
            throw new FrontException("아이디가 없습니다.", "cms/login");
        }else{
            if(member.getPw().equals(parameter.getPw())){
                session.setAttribute("id", member.getId());
                return "redirect:/cms/member/memberList";
            }
        }


        return "cms/login";
    }

    @RequestMapping(path = "/cms/test", method = {RequestMethod.POST,RequestMethod.GET})
    public String test(Model model, HttpServletRequest request, HttpServletResponse response) {

        //로그인


        return "cms/test";
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
    	members.add(member2);
    	*/
    	
    	List<Member> members1 = memberService.gets();
    	
    	model.addAttribute("members", members1);
    	
        return "cms/member/memberList";
    }
    
    

}
