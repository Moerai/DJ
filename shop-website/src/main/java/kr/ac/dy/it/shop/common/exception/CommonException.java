package kr.ac.dy.it.shop.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by PARK on 2017-02-08.
 */

@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonException extends RuntimeException {

    public static final int ACTION_TYPE_ALERT = 1;
    public static final int ACTION_TYPE_LOCATION = 2;
    public static final int ACTION_TYPE_ALERT_AND_HISTORYBACK = 3;
    public static final int ACTION_TYPE_ALERT_AND_LOCATION = 4;

    public static final String MSG_DEFAULT_ERROR = " 처리중 문제가 발생하였습니다. ";
    public static final String MSG_LOGIN_AND_USING = " 로그인 이후에 이용해 주세요. ";

    public static final String URL_MAIN = "/";
    public static final String URL_LOGIN = "/member/login";

    public static final int RESPONSE_TYPE_HTML = 1;
    public static final int RESPONSE_TYPE_JSON = 2;

    protected int responseType;
    protected int actionType;
    protected String message;
    protected String location;

    public CommonException() {
        this(RESPONSE_TYPE_HTML, ACTION_TYPE_LOCATION, MSG_LOGIN_AND_USING, URL_LOGIN);
    }

    public CommonException(int responseType, int actionType, String message, String location) {
        this.responseType = responseType;
        this.actionType = actionType;
        this.message = message;
        this.location = location;
    }

}