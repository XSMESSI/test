package com.example.dynamicsource.config;

/**
 * @ClassName DynamicDataSource
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 11:09
 * @Version: 1.0
 */

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    DynamicDataSourceProvider dynamicDataSourceProvider;

    /**
     *
     * @param dynamicDataSourceProvider
     */
    public DynamicDataSource(DynamicDataSourceProvider dynamicDataSourceProvider) {
        this.dynamicDataSourceProvider = dynamicDataSourceProvider;
        //目标数据源
        Map<Object, Object> targetDataSources = new HashMap<>(dynamicDataSourceProvider.loadDataSources());
        //目标数据源
        super.setTargetDataSources(targetDataSources);
        //指定默认的数据源
        super.setDefaultTargetDataSource(dynamicDataSourceProvider.loadDataSources().get(DynamicDataSourceProvider.DEFAULT_DATASOURCE));
        //AbstractRoutingDataSource实现了InitializingBean即可，创建实例之后会执行afterPropertiesSet方法
//        super.afterPropertiesSet();
    }

    /**
     * 	protected DataSource determineTargetDataSource() {
     * 		Assert.notNull(this.resolvedDataSources, "DataSource router not initialized");
     * 		Object lookupKey = determineCurrentLookupKey();
     * 	    resolvedDataSources 这个map包含了所有数据源信息，根据key获取指定的数据源对象
     * 		DataSource dataSource = this.resolvedDataSources.get(lookupKey);
     * 		if (dataSource == null && (this.lenientFallback || lookupKey == null)) {
     * 			dataSource = this.resolvedDefaultDataSource;
     *                }
     * 		if (dataSource == null) {
     * 			throw new IllegalStateException("Cannot determine target DataSource for lookup key [" + lookupKey + "]");
     *        }
     * 		return dataSource;* 	}
     *
     *
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        /**
         * 在aop中我们对被@DataSource注解修饰的目标方法/类 声明了数据源类型（master/salve）
         * 当目标方法的dao层去获取连接时，AbstractRoutingDataSource类的determineTargetDataSource 方法，而改方法调用了determineCurrentLookupKey 抽象方法
         * 我们对这个方法进行了重新，进而实现动态的获取数据源对象
         *
         *  如果dao层时使用mybatis则，时根据mapperProxy代理对象去执行目标方法，通过defaultSqlSession去执行crud,底层去获取connection连接时会调用 determineTargetDataSource方法
         */
        String dataSourceType = DynamicDataSourceContextHolder.getDataSourceType();
        return dataSourceType;
    }
}

