package com.main.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description  拦截器配置类
 */
@SpringBootConfiguration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

    @Autowired
    private WebInterceptor webInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(webInterceptor).excludePathPatterns("/jw-crz/token");
//        registry.addInterceptor(webInterceptor).addPathPatterns("/**").excludePathPatterns("/jw-crz/login").excludePathPatterns("/error");
//        registry.addInterceptor(webInterceptor).addPathPatterns("/getUser");
        super.addInterceptors(registry);
    }
}
