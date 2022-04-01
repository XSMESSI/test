package _2022._04_April.test_0401;

/**
 * @Author: Leo messi
 * @Date: 2022/04/01/15:12
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {

        /**
         * 此时a是分配了内存空间，但值为空，是绝对的空，是一种有值（值存在为空而已）
         * 此时b是分配了内存空间，值为空字符串，是相对的空，是一种有值（值存在为空字串）
         * 此时c是未分配内存空间，无值，是一种无值(值不存在)
         */
        String a = new String();
        String b = "";
        String c = null;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("判断是否正确" + a.equals(b));
    }
}
