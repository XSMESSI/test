package _2021._08_August.test_0809;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/9 11:49
 */
public class test_01 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();

        str.add("mssi");
        str.add("123");
        str.add("ffff");

        System.out.println(str.get(1).equals("123"));
    }
}
