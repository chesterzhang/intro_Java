package indi.chester.restful.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器
public class MyInterceptor implements HandlerInterceptor {

    //前置处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURL()+"准备执行");
        return true;//只有return true, 才会被送到后面处理
    }

    //目标资源已被Spring MVC 框架处理, return以后, 产生响应文本之前
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(request.getRequestURL()+"目标处理成功");
    }

    //响应文本以后,比如生成json字符串,html以后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(request.getRequestURL()+"响应内容已产生");
    }
}
