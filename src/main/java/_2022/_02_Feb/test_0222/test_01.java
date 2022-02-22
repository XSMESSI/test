package _2022._02_Feb.test_0222;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/22 15:13
 */
public class test_01 {
    public static void main(String[] args) {
        String maxId = "0111";
        String abc = maxId.substring(0,maxId.lastIndexOf("0")+1);
        System.out.println("abc = " + abc);
        String num = maxId.replaceAll(abc,"");
        System.out.println("num = " + num);
        Integer numR = Integer.valueOf(num)+1;
        System.out.println("abc+numR.toString() = " + abc+numR.toString());
    }
}
