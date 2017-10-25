package kr.ac.dy.it.shop.biz.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Header {

	private boolean result;
	private int resultCode;
	private String message;

	public Header(boolean result, int resultCode, String message) {
		this.result = result;
		this.resultCode = resultCode;
		this.message = message;
	}

}
