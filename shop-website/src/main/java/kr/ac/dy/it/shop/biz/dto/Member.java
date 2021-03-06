package kr.ac.dy.it.shop.biz.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode

public class Member {

	String userName;
	String state;
	String userId;
	String password;
	int exp;
	String nickName;
	String email;
	String phone;
	String address;
	String studentNum;
	
	//회원등급관련	
	String memberLevel;
	int memberCount;
}
