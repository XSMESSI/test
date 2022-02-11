package _2022._02_Feb.test_0211;

import java.text.DecimalFormat;

/**
 * @Description 查看占用多少内存
 * @Author XuShen
 * @Date 2022/2/11 13:59
 */
public class test_03 {
    public static void main(String[] args) {
        /**
         * 查看占用多少内存
         */
        Runtime run = Runtime.getRuntime();
        double total = run.totalMemory();
        double free = run.freeMemory();
        double used = (total - free)/(1024*1024);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("df.format(used) = " + df.format(used));
    }
}
