//package com.example.ownframe.config;
//
//import com.example.ownframe.interceptor.ResponseResultInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebAppConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        ResponseResultInterceptor responseResultInterceptor = new ResponseResultInterceptor();
//        registry.addInterceptor(responseResultInterceptor);
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//}
