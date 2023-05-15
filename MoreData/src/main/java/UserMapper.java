import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/24 9:30
 */
public interface UserMapper {

    /**
     * 批量插入用户
     * @param userList
     */
    void batchInsertUser(@Param("list") List<User> userList);


}

