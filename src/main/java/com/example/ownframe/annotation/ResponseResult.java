package com.example.ownframe.annotation;


import java.lang.annotation.*;

/**
 * 作用在 类 、 方法上的注解
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface ResponseResult {
}
