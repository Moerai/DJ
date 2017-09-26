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
public class FrontException extends CommonException {

    public FrontException(String message) {
        this(RESPONSE_TYPE_HTML, ACTION_TYPE_ALERT_AND_HISTORYBACK, message, "");
    }

    public FrontException(String message, String location) {
        this(RESPONSE_TYPE_HTML, ACTION_TYPE_ALERT_AND_LOCATION, message, location);
    }

    public FrontException(int responseType, int actionType, String message, String location) {
        super(responseType, actionType, message, location);
    }
}