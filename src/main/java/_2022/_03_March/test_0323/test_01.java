package _2022._03_March.test_0323;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/23 17:55
 */
public class test_01 {
    public static void main(String[] args) {
        Long num = 2L;
        Boolean result = num == 2;

        System.out.println(result.getClass());

        System.out.println(num.getClass());

        System.out.println("result = " + result);
//        System.out.println(num == 2);

        Integer num1 = 2;
        Long num2 = 2L;
//        boolean result1 = num1 == num2;
//        System.out.println(num1 == num2);
    }
}
