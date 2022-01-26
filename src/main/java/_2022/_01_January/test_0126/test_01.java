package _2022._01_January.test_0126;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/26 13:38
 */
public class test_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("list = " + list);
        list.add(0,"00000");
        list.add(1,"22222");
        System.out.println("list = " + list);
    }
}
