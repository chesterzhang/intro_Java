package indi.chester.interceptor;

import indi.chester.exception.GraceException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class UserInfoInterceptor implements HandlerInterceptor {
    /**
     *前置拦截, 访问controller之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("userId");
        String userToken = request.getHeader("userToken");

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userToken)) {
            log.error("用户校验不通过，信息不完整");
            GraceException.display("用户校验不通过，信息不完整");
            return false;
        }

        // 假设真实的用户id是0001，用户token是abc
        if (!userId.equalsIgnoreCase("0001")
                || !userToken.equalsIgnoreCase("abc")) {
            log.error("用户权限不通过");
            GraceException.display("用户校验不通过，信息不通过");
            return false;
        }

        log.info("用户权限已经通过");
        return true;//只有return true, 才会被送到后面处理, 若 return false 会被直接拦截
    }

    /**
     * 目标资源已被Spring MVC 框架处理, return以后, 产生响应文本之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 响应文本以后,比如生成json字符串,html以后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
