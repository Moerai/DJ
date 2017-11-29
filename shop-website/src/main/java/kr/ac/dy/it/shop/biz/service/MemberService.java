package kr.ac.dy.it.shop.biz.service;

import kr.ac.dy.it.shop.biz.dao.MemberDao;
import kr.ac.dy.it.shop.biz.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;

	public List<Member> gets() {

		List<Member> members = memberDao.select();

		return members;
	}

	public Member getMember(Member param) {
		Member member = null;
		member = memberDao.selectUser(param);

		if (member != null) {
			return member;
		} else {
			return new Member();
		}
	}

	/**
	 * 회원가입
	 * @param parameter
	 * @return
	 */
	public boolean addMember(Member parameter) {		
		int affected = memberDao.insertUser(parameter);		
		return affected > 0;
	}
}
