package kr.ac.dy.it.shop.biz.dao;


import kr.ac.dy.it.shop.biz.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

	List<Member> select();
	Member selectUser(Member param);

	int insertUser(Member parameter);

	Member selectUserByUserId(Member parameter);

	
	/**
	 * 멤버의 등급별 회원수를 리턴함
	 */
	List<Member> selectExp(Member parameter);


}
