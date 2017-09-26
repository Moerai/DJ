package kr.ac.dy.it.shop.web.interceptor;


import kr.ac.dy.it.shop.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class CommonInterceptor extends HandlerInterceptorAdapter {

    private StopWatch stopWatch;

    private StopWatch getStopWatchInstance() {
        if (stopWatch == null) {
            stopWatch = new StopWatch();
        }
        return stopWatch;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("timestamp", StringUtils.getTimeStamp());

        /*
        LoginUser loginUser = LoginSession.getLoginUser(request.getSession());
        if (loginUser != null) {
            request.setAttribute(LoginSession.LOGIN_USER_ATTR_NAME, loginUser);
        }
        */

        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
