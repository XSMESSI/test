package _2021._07_July.test_0722;




import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;


import java.util.Arrays;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/22 16:19
 */
public class _0722test01CollectionUtils {
    public static void main(String[] args) {
        String arr1[] = new String[]{"A","B","C","D","E","F"};
        String arr2[] = new String[]{"D","E","F","H","C","J"};

        List<String> list1 = Arrays.asList(arr1);
        List<String> list2 = Arrays.asList(arr2);
        /**
         * 判断是否为空：
         */
        if (CollectionUtils.isEmpty(list1)){
            System.out.println("list1集合为空");
        }else {
            System.out.println("list1集合的长度为"+list1.size());
        }

        /**
         * 判断是否不为空：
         */
        if(CollectionUtils.isNotEmpty(list2)){
            System.out.println("list2集合不为空，长度为："+list2.size());
        }


        /**
         * 求两个集合的
         */

//        System.out.println(CollectionUtils.union(list1,list2));


    }
}
