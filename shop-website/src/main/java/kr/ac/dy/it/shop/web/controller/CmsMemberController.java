package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Controller
public class CmsMemberController {

    @Autowired
    MemberService memberService;
    @RequestMapping("/cms/login")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/login";
    }

    @RequestMapping("/cms/member/memberList")
    public String member(Model model, HttpServletRequest request, HttpServletResponse response) {


        return "cms/member/memberList";
    }

}
