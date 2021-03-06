package kr.ac.dy.it.shop.web.controller;

import kr.ac.dy.it.shop.biz.dto.Board;
import kr.ac.dy.it.shop.biz.dto.Member;
import kr.ac.dy.it.shop.biz.model.ResponseData;
import kr.ac.dy.it.shop.biz.service.BoardService;
import kr.ac.dy.it.shop.biz.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class ApiBoardrController {

	@Autowired
	BoardService boardService;

	@RequestMapping("/api/board/list")
	public @ResponseBody List<Board> apiBoard(Board parameter, HttpSession sesstion) {
		List<Board> boardList = boardService.allBoard();
	        return boardList;
	    }
	
	
}
