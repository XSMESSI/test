package _2021._08_August.test_0803;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/3 11:20
 */
public class test_02_LocalDate {
    public static void main(String[] args) {

        //输出当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期为："+'\t'+localDate);

        LocalDate localDateof = LocalDate.of(2021,8,3);
        System.out.println("localDateof表示的日期："+'\t'+localDateof);

        /**
         * 获取当前日期是本月第几天
         * 获取当前日期是星期几
         * 获取当前日期是本年第几天
         *
         */
        //几个get用法：
        LocalDate localDateofmwy = LocalDate.of(2021,8,3);
        System.out.println("本月第几天"+'\t'+localDateofmwy.getDayOfMonth());
        System.out.println("当前日期是星期几"+'\t'+localDateofmwy.getDayOfWeek());//英文表示
        System.out.println("当前起是今年的第几天"+'\t'+localDateofmwy.getDayOfYear());

        /**
         * 判断当前年有多少天
         * 判断今年是不是闰年
         */



        System.out.println("判断当前年有多少天："+'\t'+localDateofmwy.lengthOfYear());
        boolean leap = localDateofmwy.isLeapYear();
        if (leap){
            System.out.println("当前年是闰年");
        }else{
            System.out.println("当前年不是闰年");
        }

//        System.out.println("判断今年是不是闰年"+'\t'+localDateofmwy.isLeapYear());

        /**
         * 将参数中的"日"替换localDate中的"日"
         *
         * 将参数中的天数替换localDate中的天数
         *
         * 将参数中的"月"替换localDate中的"月"
         *
         * 将参数中的"年"替换localDate中的"年"
         */
        System.out.println("with的相关用法>>>>>");
        System.out.println(localDateof.withDayOfMonth(2));

        System.out.println(localDateof.withDayOfYear(2));

        System.out.println(localDateof.withMonth(3));

        System.out.println(localDateof.withYear(2008));

        System.out.println("下面计算的是减掉1天，1月，1周，1年之后的结果");
        System.out.println("----start");
        LocalDate date1 = LocalDate.of(2021,4,21);
        System.out.println(date1.minusDays(1));
        System.out.println(date1.minusMonths(1));
        System.out.println(date1.minusWeeks(1));
        System.out.println(date1.minusYears(1));
        System.out.println("----end");

        System.out.println("下面计算的是增加1天，1月，1周，1年之后的结果");
        System.out.println("---start");
        LocalDate date2 = LocalDate.of(2021,5,20);
        System.out.println(date2.plusDays(1));
        System.out.println(date2.plusMonths(1));
        System.out.println(date2.plusWeeks(1));
        System.out.println(date2.plusYears(1));
        System.out.println("---end");





    }
}
