package _2021._07_July.test_0730;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.checkerframework.checker.units.qual.C;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/30 8:49
 */
public class test_01_calender {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//定义日期的形式：2020-10-10
        SimpleDateFormat weekFormat = new SimpleDateFormat("EEEE");//定义星期几的格式
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        Scanner cin = new Scanner(System.in);

        String datestr = "2021-07-26";
        Date date = dateFormat.parse(datestr);
        //是一个abstract修饰的类，不能通过new的方式来获取实例，可以通过
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //返回的是今天是哪一天，按照自己上面定义的时间格式进行选择，
        System.out.println(String.format("%s",dateFormat.format(calendar.getTime())));

        //返回的是星期几：
        String day_week = weekFormat.format(calendar.getTime());
        System.out.println("返回的今天是本周"+'\t'+day_week);

        //按照中国的方法，设置周一是一周里面的第一天

        calendar.setFirstDayOfWeek(Calendar.MONDAY);

        //i值返回的是星期几。但是这是国外的习惯，在我们中国一般周一是第1天，周末是第7天，
        int week_num = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("返回的是今天是本周的第几天"+'\t'+week_num);


        //返回的是几月
        String month = monthFormat.format(calendar.getTime());
        System.out.println(month);

        //返回的是这个月是今年的第一个月
        int month_num = calendar.get(Calendar.MONTH);
        System.out.println(month_num);

        //返回的是这一天是本月的第几天
        int day_month = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day_month);


        //返回的是那一年
        String year = yearFormat.format(calendar.getTime());
        System.out.println(year);

        int year_num = calendar.get(Calendar.YEAR);
        System.out.println("返回的第几年"+year_num);


/**
 * Calendar.YEAR ：年份
 * Calendar.MONTH ：月份
 * Calendar.DATE ：日期
 * Calendar.DAY_OF_MONTH ：日期 作用和上面一样
 * Calendar.HOUR ：12小时制的小时数
 * Calendar.HOUR_OF_DAY ：24小时制的小时数
 * Calendar.MINUTE ：分钟
 * Calendar.SECOND ：秒
 * Calendar.DAY_OF_WEEK ：星期几
 */














    }
}
