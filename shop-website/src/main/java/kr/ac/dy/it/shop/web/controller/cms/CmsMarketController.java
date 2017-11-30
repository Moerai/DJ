package kr.ac.dy.it.shop.web.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CmsMarketController {

    //상품등록
    @RequestMapping("/cms/market/productadd")
    public String productadd(Model model, HttpServletRequest request, HttpServletResponse response) {



        return "cms/market/productadd";
    }

    //상품리스트
    @RequestMapping("/cms/market/productList")
    public String productList(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "cms/market/productList";
    }

    //금지어목록
    @RequestMapping("/cms/market/productProhibit")
    public String prohibit(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/market/productProhibit";
    }
}