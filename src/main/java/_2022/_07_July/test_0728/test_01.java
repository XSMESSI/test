package _2022._07_July.test_0728;

import java.util.Objects;

/**
 * @Description 方法测试
 * @Author XuShen
 * @Date 2022/7/28 9:35
 */
public class test_01 {
    public static void main(String[] args) {
        String var1 = "hello";
        String var2 = null;
        System.out.println(Objects.equals(var1,var2));


        System.out.println(Objects.nonNull(var1));


        System.out.println(Objects.nonNull(var2));
    }
}
