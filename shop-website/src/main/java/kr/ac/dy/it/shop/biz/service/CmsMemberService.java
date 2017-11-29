package kr.ac.dy.it.shop.biz.service;


import kr.ac.dy.it.shop.biz.dao.CmsMemberDao;
import kr.ac.dy.it.shop.biz.dto.CmsMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CmsMemberService {

    @Autowired
    CmsMemberDao cmsMemberDao;

    public CmsMember selectCmsMemberById(String id) {

        return cmsMemberDao.selectCmsMemberById(id);
    }

}

