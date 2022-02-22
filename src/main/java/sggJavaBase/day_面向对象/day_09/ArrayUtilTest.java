package sggJavaBase.day_面向对象.day_09;


/**
 * @Author: Leo messi
 * @Date: 2022/02/22/23:03
 * @Description:
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,24,32,5,3,54,654,-98};
        int max = util.getMax(arr);
        System.out.println("max = " + max);

        util.sort(arr);
        System.out.println("arr = " + arr);

    }
}
