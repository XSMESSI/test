package _2022._02_Feb.test_0207;

import common.mySelf.LeoException;

/**
 * @Description 自定义异常使用
 * @Author XuShen
 * @Date 2022/2/7 16:59
 */
public class test_03 {
    public static void main(String[] args) throws LeoException {
        try {
            int a = 0;
            double b = 5/a;
            System.out.println("b = " + b);
        } catch (Exception e) {
            throw new LeoException("有异常错误");
        }
    }
}
