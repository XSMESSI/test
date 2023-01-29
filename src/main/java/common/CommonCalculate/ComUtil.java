package common.CommonCalculate;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/1/11 18:38
 */
public class ComUtil {

    /**
     * 计算集合大小
     * @param list
     * @return
     */
    public static <S> Integer countSize(List<S> list) {
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        return list.size();
    }
}
