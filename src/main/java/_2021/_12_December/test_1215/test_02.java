package _2021._12_December.test_1215;

import java.util.*;

/**
 * @Description 差集计算
 * @Author XuShen
 * @Date 2021/12/20 18:39
 */
public class test_02 {
    public static void main(String[] args) {
        //差集的含义：bto有的元素，但是view没有的元素
        List<String> listbto = Arrays.asList(new String[]{"1","2","3","5","6","7"});
        List<String> listView = Arrays.asList(new String[]{"2","3","4","8"});
        Set<String> setBto = new HashSet<>(listbto);
        Set<String> setView = new HashSet<>(listView);
        setBto.removeAll(setView);
//        setView.removeAll(setBto);
        System.out.println("setBto = " + setBto);
//        System.out.println("setView = " + setView);
    }

}
