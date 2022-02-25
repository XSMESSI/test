package _2022._02_Feb.test_0225;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/25 13:46
 */
public class test_02 {
    public static void main(String[] args) {
        //数组没有length()方法？String 有没有length()方法？
        //数组没有length（）方法，但是有length的属性
        String[] strings = {"1","2","3"};
        System.out.println(strings.length);
        //String有length()方法，没有length属性
        String string = "123456";
        System.out.println("string.length() = " + string.length());

    }
}
