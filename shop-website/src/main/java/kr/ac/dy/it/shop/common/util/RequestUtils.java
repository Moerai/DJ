package kr.ac.dy.it.shop.common.util;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by PARK on 2017-03-03.
 */
@Slf4j
public class RequestUtils {

    public static String getServerUrl(HttpServletRequest request) {
        return request.getScheme() + "://" + getHost(request);
    }

    public static String getHost(HttpServletRequest request) {

        String host = StringUtils.Empty;

        try {
            URL url = new URL(request.getRequestURL().toString());
            host = url.getHost();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return host;
    }

    public static String getClientIP(HttpServletRequest request) {

        String ip = request.getHeader("X-FORWARDED-FOR");

        if (ip == null || ip.length() == 0) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0) {
            ip = request.getHeader("WL-Proxy-Client-IP");  // 웹로직
        }

        if (ip == null || ip.length() == 0) {
            ip = request.getRemoteAddr() ;
        }

        return ip;
    }


}
