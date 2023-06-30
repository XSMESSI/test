package _2023._05_May;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/5/22 16:40
 */

public class test_0522_01 {

    public static void main(String[] args) {
        String name = "徐慎（100233）";
        name = name.replace("（","(");
        name = name.replace("）",")");
        System.out.println("name = " + name);
    }

}
