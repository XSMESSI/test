package _2021._07_July.test_0726;

import io.swagger.models.auth.In;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/26 16:40
 */
public class _0726test02IntegerCache {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        if (i1.equals(i2)){
            System.out.println("i1 == i2");
        }else {
            System.out.println("i1 != i2");
        }


/*
a==b:仅仅适用于-128-(+127)之间的数据
如果超出这个范围就要使用a.equals(b)来对表达式进行书写
 */
        Integer a = 126;
        Integer b = 126;
        if (a.equals(b)){
            System.out.println("a == b");
        }else {
            System.out.println("a != b");
        }

    }
}
