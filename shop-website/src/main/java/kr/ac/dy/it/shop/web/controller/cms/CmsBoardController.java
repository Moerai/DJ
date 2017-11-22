package kr.ac.dy.it.shop.web.controller.cms;

import kr.ac.dy.it.shop.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CmsBoardController {

    @Autowired
    MemberService memberService;

    //광고관리
    @RequestMapping("/cms/ad/manageAD")
    public String ad(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/ad/manageAD";
    }

    //상품관리
    @RequestMapping("/cms/market/productList")
    public String productList(Model model, HttpServletRequest request, HttpServletResponse response) {



        return "cms/market/productList";
    }

    //금지어목록
    @RequestMapping("/cms/market/productProhibit")
    public String prohibit(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/market/productProhibit";
    }

    //공지사항관리
    @RequestMapping("/cms/board/notice")
    public String notice(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/notice";
    }

    //게시판관리
    @RequestMapping("/cms/board/boardList")
    public String boardList(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/boardList";
    }

    //게시판등록
    @RequestMapping("/cms/board/boardRegister")
    public String boardRegister(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/boardRegister";
    }

    //공지상세
    @RequestMapping("/cms/board/noticeClassfy")
    public String classfy(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/noticeClassify";
    }

    //Q&A
    @RequestMapping("/cms/board/qna")
    public String qna(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/qna";
    }

    //FAQ
    @RequestMapping("/cms/board/faq")
    public String faq(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "cms/board/faq";
    }
}
