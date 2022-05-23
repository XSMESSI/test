package _2022._05_May.test_0523;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 分页数据练习
 * @Author XuShen
 * @Date 2022/5/23 13:58
 */
public class test_01 {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= 475;i++){
            list.add(i);
        }

        int times = (list.size()/1000) + 1;
        System.out.println("times = " + times);
        List<Integer> data = new ArrayList<>();
        for (int i = 1;i <= times;i++){
            if (i * 1000 > list.size()){
                data = list.subList((i - 1) * 1000,list.size());
            }else{
                data = list.subList((i - 1) * 1000,i * 1000);
            }
            System.out.println("i = " + i);
            System.out.println("data = " + data);
        }

        LocalDateTime endTime = LocalDateTime.now();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前系统时间戳
        Duration duration = Duration.between(startTime,endTime);
        long days = duration.toDays();//相差的天数
        System.out.println("days = " + days);
        long hours = duration.toHours();//相差的小时数
        System.out.println("hours = " + hours);
        long minutes = duration.toMinutes();//相差的分钟数
        System.out.println("minutes = " + minutes);
        long mills = duration.toMillis();//相差的毫秒数
        System.out.println("mills = " + mills);
        long nanos = duration.toNanos();//相差的纳秒数
        System.out.println("nanos = " + nanos);


    }
}
