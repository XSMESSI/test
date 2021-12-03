package _2021._10_October.test_1009;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/9 15:22
 */
public class test_02 {
    public static void main(String[] args) {
//        System.out.println(10e5);
        String[] names = {"梅西","C罗","德布劳内","莱万","内马尔","范戴克"};
//        for (int i = 0 ;i<names.length;i++){
//            System.out.println(names[i]);
//        }

//        Set<String> setName = new HashSet<>(Arrays.asList(names));
        System.out.println(Arrays.asList(names).contains("姆巴佩"));
        System.out.println(Arrays.asList(names).contains("梅西"));
    }
}
