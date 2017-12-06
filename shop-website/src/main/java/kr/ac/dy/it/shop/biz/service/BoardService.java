package kr.ac.dy.it.shop.biz.service;

import kr.ac.dy.it.shop.biz.dao.BoardDao;
import kr.ac.dy.it.shop.biz.dao.MemberDao;
import kr.ac.dy.it.shop.biz.dto.Board;
import kr.ac.dy.it.shop.biz.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardService {

	@Autowired
	BoardDao boardDao;

	public List<Board> allBoard() {
		List<Board> boards = boardDao.boardSelect();
		return boards;
	}
}
