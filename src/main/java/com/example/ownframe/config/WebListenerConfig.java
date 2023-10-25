package com.example.ownframe.config;

import com.example.ownframe.listener.MyListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebListenerConfig {

    /**
     *  创建一个 ServletListenerRegistrationBean 对象，
     *  并设置其 listener 属性为 MyListener 对象来注册监听器
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener(){
        System.out.println("执行了注册监听器");
        ServletListenerRegistrationBean<MyListener> myListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        myListenerServletListenerRegistrationBean.setListener(new MyListener());
        return myListenerServletListenerRegistrationBean;

    }

}
