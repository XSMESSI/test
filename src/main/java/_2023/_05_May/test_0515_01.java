package _2023._05_May;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/5/15 14:12
 */
public class test_0515_01 {
    public static void main(String[] args) {
        Integer count = 0;

        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println("count++ = " + count++);
            System.out.println("count = " + count);
        }
    }
}
