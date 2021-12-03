package _2021._07_July.test_0729;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/29 14:55
 */
public class test_01 {
    public static void main(String[] args) throws ParseException {


//        Calendar calendar = new GregorianCalendar();
//        Calendar calendar1 = new GregorianCalendar();


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//定义日期的形式
        SimpleDateFormat formatter1 = new SimpleDateFormat("EEEE");//定义星期几的格式
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");

        String dateStr = "2020-08-02";
//        Scanner cin = new Scanner(System.in);
//        String dateStr = cin.next();
        Date date = formatter.parse(dateStr);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date);


        String current = formatter.format(calendar.getTime());//当前日期转换成字符串
        //利用下面这个报错了
//        String dateString1 = formatter1.format(calendar.DAY_OF_WEEK);//获得今天是本周的星期几：星期四转换成字符串

        int i = calendar.get(Calendar.DAY_OF_WEEK)-1;
        if(i == 0){
            System.out.println("星期几"+'\t'+ 7);
            System.out.println("获取当前的日期:" + '\t' +current);
            calendar.add(Calendar.DATE, -6);
            calendar1.add(Calendar.DATE, 0);
            String weekFirst = formatter.format(calendar.getTime());
            String weekLast = formatter.format(calendar1.getTime());
            System.out.println("获取本周周一的日期：" + '\t'+ weekFirst);//周一的日期
            System.out.println("获取本周周末的日期：" + '\t'+ weekLast);//周末的日期
            /**
             * 获得月份
             */
            calendar.get(Calendar.MONTH);
            String  calendar_month = month.format(calendar.getTime());
            System.out.println("本月是："+'\t'+calendar_month);
            /**
             * 获得年份
             */
            calendar.get(Calendar.YEAR);
            String calendar_year = year.format(calendar.getTime());
            System.out.println("今年是"+'\t'+calendar_year);
        }else{
            System.out.println("星期几"+'\t'+ i);
            System.out.println("获取当前的日期:" + '\t' +current);
            calendar.add(Calendar.DATE, -(i-1));
            calendar1.add(Calendar.DATE, 7 - i);
            String weekFirst = formatter.format(calendar.getTime());
            String weekLast = formatter.format(calendar1.getTime());
            System.out.println("获取本周周一的日期：" + '\t'+ weekFirst);//周一的日期
            System.out.println("获取本周周末的日期：" + '\t'+ weekLast);//周末的日期
            /**
             * 获得月份
             */
            calendar.get(calendar.MONTH);
            String  calendar_month = month.format(calendar.getTime());
            System.out.println("本月是："+'\t'+calendar_month);
            /**
             * 获得年份
             */
            calendar.get(calendar.YEAR);
            String calendar_year = year.format(calendar.getTime());
            System.out.println("今年是"+'\t'+calendar_year);
        }


//        System.out.println("获取该天是本周的星期几：" + '\t'+dateString1);

        /**
        * 通过今天是本周的星期几进行推算出本周的周一，周日日期。
        */
//        String weeks[] = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
//        for (int i = 0; i < 7; i++) {
//            if (weeks[i].equals(dateString1)) {
//
//                break;
//            }
//        }




    }
}

