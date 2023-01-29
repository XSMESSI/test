package _2022._012_December;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/15 10:05
 */
public class test_1215_01 {
    public static void main(String[] args) {
        String value = "1233344888888888888";
        String aNum = "123";
        boolean result;
        try {
            Integer num = Integer.valueOf(value);
            result = true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            result = false;
        }
        System.out.println(result);
//        boolean b =  Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE ? true :false;
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        System.out.println(b);
    }
}
