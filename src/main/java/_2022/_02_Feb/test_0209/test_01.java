package _2022._02_Feb.test_0209;

import java.text.DecimalFormat;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/9 15:54
 */
public class test_01 {
    public static void main(String[] args) {
        System.out.println("true = " + ">>");
        Runtime run = Runtime.getRuntime();
        double total = run.totalMemory();
        double free = run.freeMemory();
        double used = (total - free)/(1024*1024);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("df.format(used) = " + df.format(used));
    }
}
