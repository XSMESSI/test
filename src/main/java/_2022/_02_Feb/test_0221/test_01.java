package _2022._02_Feb.test_0221;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/21 17:41
 */
public class test_01 {
    public static void main(String[] args) {
        String str = "RC2001";
        String abc = str.replaceAll("[^(a-zA-Z)]","");//去除字母
        String num = str.replaceAll("[^(0-9)]","");//去除数字
        System.out.println("num = " + num);
        System.out.println("abc = " + abc);

        for (int i = 0;i<100;i++){
            Integer value = Integer.valueOf(num)+i;
            System.out.println("value = " + value);
        }

        for (int i = 0;i<100;i++){
            StringBuilder result = new StringBuilder(abc);
            Integer integer = Integer.valueOf(num)+i;
            result.append(integer.toString());
            System.out.println(result);
        }

        Integer num1 = Integer.valueOf(num)+5;
        String result = abc+num1;
        System.out.println("result = " + result);
    }
}
