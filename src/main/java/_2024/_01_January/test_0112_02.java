package _2024._01_January;

/**
 * @Author Xu Shen
 * @Date 2024/1/12 16:36
 * @Version 1.0
 * @DESC :
 */
public class test_0112_02 {
    public static void main(String[] args) {
        int num = countData(10);
        System.out.println("num = " + num);
    }

    private static int countData(int i) {
        try {
            int num = 10/0;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            System.out.println("打印数据");
            return -2;
        }
//        return -3;
    }
}
