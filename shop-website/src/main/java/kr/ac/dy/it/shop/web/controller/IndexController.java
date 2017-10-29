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
public class IndexController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {

        List<Member> memberList = memberService.gets();
        
        String name ="박성수";
        
        model.addAttribute("userName",name);

        model.addAttribute("members", memberList);


        log.info("############################################# - 1");
        log.info(memberList.toString());



        return "index"; //물리적 주소값을 반환해준다.
    }
    
    @RequestMapping("/member/login")
    String memberLogin() {
    	
    	
    	
    	return"member/login";
    }
    

}