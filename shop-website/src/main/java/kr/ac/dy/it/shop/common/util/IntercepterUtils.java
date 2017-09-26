package kr.ac.dy.it.shop.common.util;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by PARK on 2017-02-26.
 */
@Slf4j
public class IntercepterUtils {

    public static void headerLog(HttpServletRequest request) {

        StringBuilder sb = new StringBuilder();

        sb.append(StringUtils.CRLF).append(StringUtils.LINE_BAR)
                .append(StringUtils.CRLF).append("#### [HTTP INFO__] ##############")
                .append(StringUtils.CRLF).append(String.format(StringUtils.FORMAT_LOG, "requestURI", request.getRequestURI()))
                .append(StringUtils.CRLF).append(String.format(StringUtils.FORMAT_LOG, "queryString", request.getQueryString()))
                .append(StringUtils.CRLF).append(String.format(StringUtils.FORMAT_LOG, "method", request.getMethod()))
                .append(StringUtils.CRLF).append("#### [HTTP HEADER] ##############");

        Enumeration headerNames = request.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String name = (String) headerNames.nextElement();
                String value = request.getHeader(name);
                sb.append(StringUtils.CRLF).append(String.format(StringUtils.FORMAT_LOG, name, value));
            }
        }
        sb.append(StringUtils.CRLF).append(StringUtils.LINE_BAR);

        log.info(sb.toString());

    }

    public static void setLoginUser(HttpServletRequest request) {

		/*
        HttpSession session = request.getSession();
		LoginUser loginUser = LoginSession.getLoginUser(session);
		if (loginUser != null) {
			request.setAttribute(LoginSession.LOGIN_USER_ATTR_NAME, loginUser);
		}
		*/

    }
}
