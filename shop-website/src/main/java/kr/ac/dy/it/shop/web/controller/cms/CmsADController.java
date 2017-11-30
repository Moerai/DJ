package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CmsADController {

    @Autowired
    MemberService memberService;

    //광고관리
    @RequestMapping("/cms/ad/manageAD")
    public String ad(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/ad/manageAD";
    }
}