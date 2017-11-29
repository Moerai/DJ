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
public class RegisterController {

    @Autowired
    MemberService registerService;
    
    @RequestMapping("/login/register")
    public String register(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "login/register";
    }
    @RequestMapping("/login/registerchecked")
    public String registerchecked(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "login/registerchecked";
    }
    @RequestMapping("/login/registerFinish")
    public String registerFinish(Model model, HttpServletRequest request, HttpServletResponse response) {
    	
        return "login/registerFinish";
    }
}
