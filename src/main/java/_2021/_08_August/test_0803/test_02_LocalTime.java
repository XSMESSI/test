package _2021._08_August.test_0803;

import javax.ejb.Local;
import java.time.LocalTime;

/**
 * @Description  用来处理时间类
 * @Author XuShen
 * @Date 2021/8/3 14:28
 */
public class test_02_LocalTime {
    public static void main(String[] args) {

        //取得是当前的时间
        LocalTime time1 = LocalTime.now();
        System.out.println("输出的是当前的时间:"+'\t'+time1);

        //自定义时间：
        LocalTime time2 = LocalTime.of(10,20,58);
        System.out.println("自定义的时间："+'\t'+time2);

        //获取当前的小时数，分数，秒数
        System.out.println("获取的是当前时间的小时，分，秒");
        LocalTime time3 = LocalTime.of(8,30,28);
        System.out.println(time3.getHour());
        System.out.println(time3.getMinute());
        System.out.println(time3.getSecond());


        //替换当前时间的小时，分数，秒数
        System.out.println("替换掉当前的小时，分数，秒数");
        LocalTime time4 = LocalTime.of(14,20,38);
        System.out.println(time4.withHour(12));
        System.out.println(time4.withMinute(30));
        System.out.println(time4.withSecond(28));


        LocalTime time5 = LocalTime.of(6,52,17);
        System.out.println("对当前的时间进行增加，减少");
        System.out.println(time5.minusHours(1));
        System.out.println(time5.minusMinutes(20));
        System.out.println(time5.minusSeconds(14));
        System.out.println(time5.plusHours(1));
        System.out.println(time5.plusMinutes(2));
        System.out.println(time5.plusSeconds(23));



    }
}
