package com.example.dynamicsource.config;

/**
 * @ClassName DataSourceAspect
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 11:07
 * @Version: 1.0
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * order默认最低优先级，Integer.MAX_VALUE
 * 值越小优先级越高
 */
@Aspect
@Order(1)
@Component
public class DataSourceAspect {
    @Pointcut("@annotation(com.example.dynamicsource.config.DataSource)"
            + "|| @within(com.example.dynamicsource.config.DataSource)")
    public void dsPc() {

    }

    @Around("dsPc()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //获取目标方法的@DataSource 数据源注解
        DataSource dataSource = getDataSource(point);
        //判断@DataSource注解对象是否为空，如果不为空则添加到threadLocal中（当前线程）
        if (Objects.nonNull(dataSource)) {
            DynamicDataSourceContextHolder.setDataSourceType(dataSource.dataSourceName());
        }

        try {
            //执行目标方法
            return point.proceed();
        } finally {
            // 这里使用try finally，不论目标方法是否执行成功，都需要销毁当前线程数据源 在执行方法之后
            DynamicDataSourceContextHolder.clearDataSourceType();
        }
    }

    /**
     * 获取需要切换的数据源
     */
    public DataSource getDataSource(ProceedingJoinPoint point) {
        //获取方法签名对象
        MethodSignature signature = (MethodSignature) point.getSignature();
        //AnnotationUtils.findAnnotation
        //简单理解就是先从目标方法上去获取@DataSource这个注解，没有找到在去从类上获取；因此如果方法和类上都含有这个注解则方法的优先级时高于类的
        DataSource dataSource = AnnotationUtils.findAnnotation(signature.getMethod(), DataSource.class);
        return dataSource;
    }
}

