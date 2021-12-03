package _2021._08_August.test_0803;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/3 17:31
 */
public class test_05_queryWarpper {
    public static void main(String[] args) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("name","xushen");
        System.out.println(wrapper.clone());
    }
}
