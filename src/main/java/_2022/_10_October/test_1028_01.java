package _2022._10_October;

import java.util.Arrays;
import java.util.List;

/**
 * @Description 字符串转换为list
 * @Author XuShen
 * @Date 2022/10/28 9:41
 */
public class test_1028_01 {
    public static void main(String[] args) {
        String names = "李振伟;徐慎；周国庆;徐磊";
        names = names.replace("；",";");
        List<String> name = Arrays.asList(names.split(";"));
        System.out.println("name = " + name);
        for (String s : name) {
            System.out.println("s = " + s);
        }
    }
}
