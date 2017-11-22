package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

        return "cms/member/memberList";
    }

}
