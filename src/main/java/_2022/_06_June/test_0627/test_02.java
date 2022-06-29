package _2022._06_June.test_0627;

/**
 * @Description 跳出当前的多重嵌套循环
 * @Author XuShen
 * @Date 2022/6/27 18:21
 */
public class test_02 {
    public static void main(String[] args) {

        A:for (int i = 0; i < 5; i++) {
            System.out.println("111");
            for (int j = 0; j < 5; j++) {
                System.out.println("222");
                for (int k = 0; k < 5; k++) {
                    System.out.println("333");
                    break A;
                }
            }
        }
    }
}
