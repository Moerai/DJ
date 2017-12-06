package kr.ac.dy.it.shop.web.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CmsMarketController {

    //상품리스트
    @RequestMapping("/cms/market/productList")
    public String productList(Model model, HttpSession session) {
        if(session.getAttribute("id") == null)
            return "redirect:/cms/login";

        return "cms/market/productList";
    }

    //금지어목록
    @RequestMapping("/cms/market/productProhibit")
    public String prohibit(Model model, HttpSession session) {
        if(session.getAttribute("id") == null)
            return "redirect:/cms/login";

        return "cms/market/productProhibit";
    }
}