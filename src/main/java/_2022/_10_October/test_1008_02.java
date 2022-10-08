package _2022._10_October;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 捕获方法中的异常并且打印出错误信息
 * @Author XuShen
 * @Date 2022/10/8 13:59
 */
@Slf4j
public class test_1008_02 {
    public static void main(String[] args) {
        try {
            Integer a = 1;
            Integer b = 2;
            Integer c = 0;

            method1(a,c);
            method2(a,c);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("分母为0异常");
        }
    }

    private static void method1(Integer a, Integer c) {
        double num = a/c;
        System.out.println("method1>>>>num = " + num);
    }

    private static void method2(Integer a, Integer c) {
        String[] arr = new String[3];
        arr[5] = "12";
    }
}
