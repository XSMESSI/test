import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/29 14:02
 */
public interface sqlModelDao {

    /**
     * 插入单条数据
     * @return
     */
    Integer inserAlone();

    /**
     * 集合的形式批量插入
     * @return
     */
    Integer insertList(@Param("list") List<SystemNotice> list);
}
