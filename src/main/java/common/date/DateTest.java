package common.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description Date正确的使用方式
 * @Author XuShen
 * @Date 2023/3/13 16:43
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        String yearDate = "yyyy-MM-dd";
        String yearTime = "yyyy-MM-dd HH:mm:ss";
        String yearM = "yyyy-MM";
        String year = "yyyy";

//        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy").parseDefaulting(ChronoField.YEAR, 2020).toFormatter();
//        System.out.println(LocalDate.parse("2022", formatter));

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy");
        Year parse = Year.parse("2022", pattern);
        LocalDate date = parse.atDay(1);
        System.out.println("date = " + date);
        System.out.println(parse);


        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy-MM");
        YearMonth parse1 = YearMonth.parse("2022-12", pattern1);
        LocalDate date1 = parse1.atDay(1);
        System.out.println("获取年月date = " + date1);
        System.out.println(parse1);


//        DateTimeFormatter yearDtf = DateTimeFormatter.ofPattern("yyyy");
        SimpleDateFormat yearDtf = new SimpleDateFormat("yyyy");
        DateTimeFormatter ymDtf = DateTimeFormatter.ofPattern("yyyy-MM");
        DateTimeFormatter dateDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String sDate = "2022";
        boolean isValue1 = isDate(sDate.length(),sDate,year);
        Date localDate = yearDtf.parse(sDate);
        System.out.println(isValue1);
        System.out.println("localDate1111 = " + localDate);



//        String sDateY = "2022-12";
//        boolean isValue2 = isDate(sDateY.length(),sDateY,yearM);
//        LocalDate localDateY= LocalDate.parse(sDateY, ymDtf);
//        System.out.println("localDateYYYYYYY = " + localDateY);
//        System.out.println(isValue2);




//        String sDateYD = "2022-12-12";
//        boolean isValue3 = isDate(sDateYD.length(),sDateYD,yearDate);
//        LocalDate localDate1122 = LocalDate.parse(sDateYD, dateDtf);
//        System.out.println("localDate1122 = " + localDate1122);
//        System.out.println(isValue3);

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
