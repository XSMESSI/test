package _2022._01_January.test_0117;

/**
 * @Description 变量覆盖
 * @Author XuShen
 * @Date 2022/1/17 17:47
 */
public class test_07 {
    static int x = 20;
    public static void main(String[] args) {
        System.out.println("静态变量x = " + x);
        //局部变量（覆盖静态变量）
        int x = 100;
        System.out.println("局部变量x = " + x);
    }
}
