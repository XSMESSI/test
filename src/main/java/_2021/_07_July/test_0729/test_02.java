package _2021._07_July.test_0729;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/29 15:28
 */
public class test_02 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();

        c.add(Calendar.DATE, - 4);
        Date time = c.getTime();
        String preDay = sdf.format(time);
        System.out.println(preDay);


    }
}
