package _2022._04_April.test_0412;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Leo messi
 * @Date: 2022/04/12/16:10
 * @Description:
 */
public class test_03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println("list = " + list);
        //可以是一个空list但是不能为空
        list.addAll(new ArrayList<>());
        System.out.println("list = " + list);
    }
}
