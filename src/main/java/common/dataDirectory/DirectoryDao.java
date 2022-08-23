package common.dataDirectory;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/23 11:14
 */
public interface DirectoryDao {

    /**
     * 获取数据库中所有表信息
     * @param dbName
     * @return
     */
    List<DataDirectory> getAllTableInfo(@Param("dbName") String dbName);

    /**
     * 表格的注释
     * @param dbName
     * @return
     */
    List<DataDirectory> getTableCommoent(@Param("dbName") String dbName);
}
