package com.example.dynamicsource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName YamlDynamicDataSourceProvider
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/5/22 10:57
 * @Version: 1.0
 */
@Configuration
@EnableConfigurationProperties(DruidProperties.class)
public class YamlDynamicDataSourceProvider implements DynamicDataSourceProvider {

    @Autowired
    DruidProperties druidProperties;

    /**
     * 加载配置文件中的数据源
     *
     * @return
     */

    @Override
    public Map<String, DataSource> loadDataSources() {
        //创建一个和配置文件数据源相同大小的map
        Map<String, DataSource> ds = new HashMap<>(druidProperties.getDs().size());
        try {
            //从配置类中获取数据源map, key：数据源名称(master,salve) value：数据源配置信息（url,name,password,driver）
            Map<String, Map<String, String>> map = druidProperties.getDs();
            //获取map中的所有的key(master,slave)
            Set<String> keySet = map.keySet();
            for (String s : keySet) {
                //根据数据源配置信息创建DruidDataSource对象
                DruidDataSource dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(map.get(s));
                //将创建的dataSource数据源对象保存到map中， key:数据源名称、 value:dataSource数据源对象
                // druidProperties.dataSource(dataSource) 配置数据源信息，最大链接数、空闲时间等
                ds.put(s, druidProperties.dataSource(dataSource));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
}

