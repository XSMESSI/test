package com.example.dynamicsource.config;

/**
 * @ClassName DynamicDataSourceProvider
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 10:55
 * @Version: 1.0
 */

import javax.activation.DataSource;
import java.util.Map;

/**
 * 加载所有的数据源
 */
public interface DynamicDataSourceProvider {

    String DEFAULT_DATASOURCE = "master";
    /**
     * 加载所有的数据源
     * @return
     */
    Map<String, DataSource> loadDataSources();
}

