package _2023._01_January;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/1/5 19:38
 */
public class test_0105 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("CollectionUtils.isNotEmpty(list) = " + CollectionUtils.isNotEmpty(list));
        List<Integer> listNum = null;
        boolean empty = CollectionUtils.isEmpty(listNum);
        boolean aNull = Objects.isNull(listNum);
        System.out.println(aNull);
        System.out.println(empty);
    }
}
