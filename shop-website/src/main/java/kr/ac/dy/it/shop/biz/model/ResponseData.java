package kr.ac.dy.it.shop.biz.model;

import kr.ac.dy.it.shop.common.util.StringUtils;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseData<T> {

	private Header header;
	private T body;

	public ResponseData() {
		this(true, null, 0, StringUtils.Empty);
	}

	public ResponseData(boolean result, T body) {
		this(result, body, 0, StringUtils.Empty);
	}

	public ResponseData(boolean result, T body, int resultCode) {
		this(result, body, resultCode, StringUtils.Empty);
	}

	public ResponseData(boolean result, T body, String message) {
		this(result, body, 0, message);
	}

	public ResponseData(boolean result, T body, int resultCode, String message) {
		header = new Header(result, resultCode, message);
		this.body = body;
	}

	public ResponseData(boolean result, String message) {
		this(result, (T) "", 0, message);
	}

}
