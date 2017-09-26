package kr.ac.dy.it.shop.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by PARK on 2017-02-08.
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class CmsException extends CommonException {

    public CmsException(String message) {
        super(RESPONSE_TYPE_HTML, ACTION_TYPE_ALERT_AND_LOCATION, message, URL_LOGIN);
    }

}
