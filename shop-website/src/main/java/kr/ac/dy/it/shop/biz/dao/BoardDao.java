package kr.ac.dy.it.shop.biz.dao;


import kr.ac.dy.it.shop.biz.dto.Board;
import kr.ac.dy.it.shop.biz.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//
@Mapper
public interface BoardDao {

	List<Board> select();
	Board selectUser(Board param);

	int insertBoard(Board parameter);
	

	Board selectUserByUserId(Board parameter);



}
