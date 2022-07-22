package _2022._07_July.test_0722;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/7/22 14:35
 */
public class test_02 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = new Date();
        for (int i = 0; i < 123022; i++) {
            System.out.println("第" + i + "个目标");
            for (int i1 = 0; i1 < 27; i1++) {
                System.out.println(">>>>>>>>>>第 " + i1 + "个指标>>>>>>>>>");
            }
        }

        Date end = new Date();

        System.out.println("开始时间 =" + format.format(start));
        System.out.println("结束时间 =" + format.format(end));
    }
}
