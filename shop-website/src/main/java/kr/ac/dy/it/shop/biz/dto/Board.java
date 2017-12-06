package kr.ac.dy.it.shop.biz.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode

public class Board {
	
	int id;
	String userId;
	String nickname;
	int boardType;
	String title;
	String content;
	String regDt;
	int viewCount;
	int recCount;
	

	
	
	

}
