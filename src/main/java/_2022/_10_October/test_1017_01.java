package _2022._10_October;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/17 16:51
 */
public class test_1017_01 {
    public static void main(String[] args) {
        String str = "于进亮,李萍";
        String res = str.replace(",","\n");
//        System.out.println(res);

        String value = "于进亮\n\r李萍\r";
//        System.out.println(value);

        String value1 = "于进亮\r李萍";
        System.out.println(value1);
    }
}
