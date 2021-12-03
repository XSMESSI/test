package _2021._07_July.test_0730;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/30 13:48
 */
public class test_01_setfirstDayOfWeek {

        static final String[] weeks = new String[]{"星期天","星期一","星期二","星期三","星期四","星期五","星期六",};
        /**
         * @param args
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Calendar cale = new GregorianCalendar(2009,0,31);
            System.out.println(cale.getTime().toLocaleString());
            System.out.println("FirstDayOfWeek/tMinimalDaysInFirstWeek/tweek");
            for (int i = 1; i <= 7; i++) {
                cale.setFirstDayOfWeek(i);//1为星期天,7为星期六
                for (int j = 1; j <= 7; j++) {
                    cale.setMinimalDaysInFirstWeek(j);
                    System.out.println(weeks[(i-1)]+'\t'+j+'\t'+cale.get(Calendar.WEEK_OF_MONTH));
                }

            }
        }

    }
