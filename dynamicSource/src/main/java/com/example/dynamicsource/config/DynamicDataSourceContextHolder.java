package com.example.dynamicsource.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName DynamicDataSourceContextHolder
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 11:03
 * @Version: 1.0
 */
public class DynamicDataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    /**
     * 使用ThreadLocal维护变量，ThreadLocal为每个使用该变量的线程提供独立的变量副本，
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本。
     * 后续在aop中在执行目标方法之前，我们从注解获取需要执行哪一个数据源（dataType:slave、master）并保存到CONTEXT_HOLDER这个threadLocal对象中
     * dao层在获取连接时会执行AbstractRoutingDataSource类的determineTargetDataSource方法，而改方法调用其子类的
     * determineCurrentLookupKey方法来获取dataSoucrceType，最终决定时用哪一个数据源对象执行底层的jdbc对数据库的操作
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    /**
     * 设置数据源的变量
     */
    public static void setDataSourceType(String dsType) {
        log.info("切换到{}数据源", dsType);
        CONTEXT_HOLDER.set(dsType);
    }

    /**
     * 获得数据源的变量
     */
    public static String getDataSourceType() {
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清空数据源变量
     */
    public static void clearDataSourceType() {
        CONTEXT_HOLDER.remove();
    }
}

