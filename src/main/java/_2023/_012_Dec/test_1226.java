package _2023._012_Dec;

import java.util.Date;
import java.util.TimeZone;

/**
 * @Author Xu Shen
 * @Date 2023/12/26 10:19
 * @Version 1.0
 * @DESC :
 */
public class test_1226 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT+8");
//        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        TimeZone.setDefault(timeZone);

        // 创建一个新的Date对象
        Date currentDate = new Date();
        System.out.println("当前时间（北京时间）： " + currentDate);
    }
}
