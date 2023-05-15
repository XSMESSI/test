package _2023._03_March;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/24 11:39
 */
public class test_0324 {


    @Test
    public void testDecimal(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dataValueStr = "2023-03-24 17:00:45";
        Date date = null;
        try {
            date = format.parse(dataValueStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date = " + date);


        String value = format.format(date);
        System.out.println("value = " + value);


    }
}
