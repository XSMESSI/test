package com.example.dynamicsource.config;

/**
 * @ClassName DruidProperties
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 10:37
 * @Version: 1.0
 */

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.activation.DataSource;
import java.util.Map;

/**
 * spring容器启动时将DruidProperties 作为bean对象注入到容器中
 *
 * @ConfigurationProperties 会读取application配置文件，set给DruidProperties属性
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidProperties {
    /**
     * 初始连接数
     */
    private int initialSize;

    /**
     * 最小连接池数量
     */
    private int minIdle;

    /**
     * 最大连接池数量
     */
    private int maxActive;

    /**
     * 配置获取连接等待超时的时间
     */
    private int maxWait;

    /**
     * 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
     */
    private int timeBetweenEvictionRunsMillis;

    /**
     * 配置一个连接在池中最小生存的时间，单位是毫秒
     */
    private int minEvictableIdleTimeMillis;

    /**
     * 配置一个连接在池中最大生存的时间，单位是毫秒
     */
    private int maxEvictableIdleTimeMillis;

    /**
     * 配置检测连接是否有效
     */
    private String validationQuery;

    /**
     * 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
     */
    private boolean testWhileIdle;

    /**
     * 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
     */
    private boolean testOnBorrow;

    /**
     * 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
     */
    private boolean testOnReturn;

    /**
     * key:数据源名称
     * value:数据源配置信息
     */
    private Map<String, Map<String, String>> ds;

    public DataSource dataSource(DruidDataSource datasource) {
        /** 配置初始化大小、最小、最大 */
        datasource.setInitialSize(initialSize);
        datasource.setMaxActive(maxActive);
        datasource.setMinIdle(minIdle);

        /** 配置获取连接等待超时的时间 */
        datasource.setMaxWait(maxWait);

        /** 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 */
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);

        /** 配置一个连接在池中最小、最大生存的时间，单位是毫秒 */
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setMaxEvictableIdleTimeMillis(maxEvictableIdleTimeMillis);

        /** 用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会起作用。*/
        datasource.setValidationQuery(validationQuery);
        /** 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。 */
        datasource.setTestWhileIdle(testWhileIdle);
        /** 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。 */
        datasource.setTestOnBorrow(testOnBorrow);
        /** 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。 */
        datasource.setTestOnReturn(testOnReturn);
        return null;
    }

}

