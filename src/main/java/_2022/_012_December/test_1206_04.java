package _2022._012_December;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/6 19:39
 */
public class test_1206_04 {
    public static void main(String[] args) throws ParseException {
        String yearDate = "yyyy-MM-dd";
        String yearTime = "yyyy-MM-dd HH:mm:ss";
        String yearM = "yyyy-MM";
        String year = "yyyy";



//        DateTimeFormatter yearDtf = DateTimeFormatter.ofPattern("yyyy");
        SimpleDateFormat yearDtf = new SimpleDateFormat("yyyy");
        DateTimeFormatter ymDtf = DateTimeFormatter.ofPattern("yyyy-MM");
        DateTimeFormatter dateDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        String value = null;
//        boolean isValue1 = isDate(sDate.length(),sDate,year);
//        System.out.println(isValue1);
//        value = yearDtf.format(sDate);
//        System.out.println(value);

    }

    private static boolean isDate(int length, String sDate, String format) {
        if ((sDate == null) || (sDate.length() != length)) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(sDate);
            return sDate.equals(formatter.format(date));
        } catch (Exception e) {
            return false;
        }
    }
}
