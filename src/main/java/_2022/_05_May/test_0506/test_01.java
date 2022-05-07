package _2022._05_May.test_0506;

import java.util.Objects;

/**
 * @Author: Leo messi
 * @Date: 2022/05/06/18:08
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        Integer id = 2;

        System.out.println(Objects.isNull(id));

        Integer id1 = null;
        System.out.println(Objects.isNull(id1));
    }
}
