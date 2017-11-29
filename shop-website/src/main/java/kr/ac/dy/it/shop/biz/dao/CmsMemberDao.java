package kr.ac.dy.it.shop.biz.dao;


import kr.ac.dy.it.shop.biz.dto.CmsMember;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsMemberDao {

	CmsMember selectCmsMemberById(String id);
}
