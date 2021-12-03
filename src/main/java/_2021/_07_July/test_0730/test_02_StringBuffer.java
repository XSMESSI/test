package _2021._07_July.test_0730;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/30 11:08
 */
public class test_02_StringBuffer {
    public static void main(String[] args) {
     String str = new String("2021奥运会");


     StringBuffer stringBuffer = new StringBuffer("2021奥运会-中国队");
     stringBuffer.append("-加油");
/**
 * String类中的元素不可以改变，
 * 而StringBuffer中的元素是可以改变的
 */
        System.out.println(str);
        System.out.println(stringBuffer);


    }
}
