package _2021._12_December.test_1215;

import java.util.*;

/**
 * @Description 差集计算，list转为set集合
 * @Author XuShen
 * @Date 2021/12/20 18:39
 */
public class test_02 {
    public static void main(String[] args) {
        List<String> listbto = Arrays.asList(new String[]{"1","2","3","5","6","7"});
        List<String> listView = Arrays.asList(new String[]{"2","3","4"});
        Set<String> setBto = new HashSet<>(listbto);
        Set<String> setView = new HashSet<>(listView);
        setBto.removeAll(setView);
        System.out.println(setBto);

    }

}
