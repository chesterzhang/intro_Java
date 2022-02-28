package indi.chester;

import indi.chester.interceptor.UserInfoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//在IoC容器中注册拦截器
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    public UserInfoInterceptor userInfoInterceptor() {
        return new UserInfoInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        registry.addInterceptor(userInfoInterceptor())
                .addPathPatterns("/user_info_upload");
    }
}
