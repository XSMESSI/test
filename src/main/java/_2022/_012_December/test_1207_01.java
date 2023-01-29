package _2022._012_December;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/7 8:57
 */
public class test_1207_01 {
    public static void main(String[] args) throws ParseException {
        String date = "2021-12";
        boolean value = isOk(date);
        System.out.println(value);
    }

    private static boolean isOk(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date value = null;
        try {
            value = format.parse(date);
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}
