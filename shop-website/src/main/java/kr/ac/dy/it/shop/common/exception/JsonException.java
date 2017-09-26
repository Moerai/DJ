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
public class JsonException extends CommonException {

    public JsonException(String message) {
        super(RESPONSE_TYPE_JSON, ACTION_TYPE_ALERT, message, URL_LOGIN);
    }

}