package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    MemberService registerService;
    
    @RequestMapping("/member/register")
    public String register(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "member/register";
    }
    @RequestMapping("/member/registerchecked")
    public String registerchecked(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "member/registerchecked";
    }
    @RequestMapping("/member/registerfinish")
    public String registerFinish(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "member/registerfinish";
    }
    
    @RequestMapping("/member/main")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "member/main";
    }

	
}
