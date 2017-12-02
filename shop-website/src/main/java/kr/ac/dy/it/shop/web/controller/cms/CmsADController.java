package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CmsADController {

    @Autowired
    MemberService memberService;

    //광고관리
    @RequestMapping("/cms/ad/manageAD")
    public String ad(Model model, HttpSession session) {
        if(session.getAttribute("id") == null)
            return "redirect:/cms/login";

        return "cms/ad/manageAD";
    }
}