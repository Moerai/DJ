package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CmsIndexController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/shop-website/cms/login")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {


        return "shop-website/cms/login";
    }

}
