package _2024._04_April;

import org.apache.commons.lang.StringUtils;

/**
 * @Author Xu Shen
 * @Date 2024/4/22 18:06
 * @Version 1.0
 * @DESC :
 */
public class test_0422 {
    public static void main(String[] args) {
        String name = "data.sql";
        String s = StringUtils.stripEnd(name, "s");
        System.out.println("s = " + s);
        System.out.println("删除字段数据 = " + StringUtils.stripEnd(name, "s"));

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    }
}
