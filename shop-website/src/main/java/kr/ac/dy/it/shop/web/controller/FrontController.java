package kr.ac.dy.it.shop.web.controller;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class FrontController {

    @Autowired
    MemberService memberService;
    
    @RequestMapping("/login/front")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "login/front";
    }
}
