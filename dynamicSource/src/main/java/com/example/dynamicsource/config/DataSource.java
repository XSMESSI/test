package com.example.dynamicsource.config;

/**
 * @ClassName DataSource
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 11:06
 * @Version: 1.0
 */

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author llp
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface DataSource {

    String dataSourceName() default DynamicDataSourceProvider.DEFAULT_DATASOURCE;

    @AliasFor("dataSourceName")
    String value() default DynamicDataSourceProvider.DEFAULT_DATASOURCE;
}

