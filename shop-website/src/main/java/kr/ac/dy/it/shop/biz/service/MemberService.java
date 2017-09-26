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

}

