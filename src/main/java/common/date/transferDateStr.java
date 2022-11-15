package common.date;

import com.sun.tools.corba.se.idl.StringGen;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/31 10:11
 */
public class transferDateStr {


    /**
     * String 和 DATE互相转换
     */
    @Test
    public void testDateStr() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //date 转换为 string 类型
        String time = sdf.format(date);
        System.out.println("time = " + time);


        //Date类型转换为String 类型
        String string = "2022-10-21 10:12:27";
        Date d = sdf.parse(string);
        System.out.println("d = " + d);
    }


    //Date转换为LocalDateTime
    @Test
    public void testLocalDateTime(){
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime =  instant.atZone(zoneId).toLocalDateTime();
        System.out.println("date = " + date);
        System.out.println("localDateTime = " + localDateTime);
    }

    //LocalDateTime 转换为 Date
    @Test
    public void testDateLocal(){
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        Date date = Date.from(zdt.toInstant());

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("date = " + date);
    }


    //LocalDateTime 转换为 String
    @Test
    public void testLocalDateStr(){
        String DATE_PARSE_HOUR = "yyyy-MM-dd HH:mm:ss";
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_PARSE_HOUR);
        String string = dtf.format(time);
        System.out.println("string = " + string);
    }

    @Test
    public void testStrLocalDateTime(){
        String DATE_PARSE_HOUR = "yyyy-MM-dd HH:mm:ss";
        String date = "2022-10-31 10:29:26";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_PARSE_HOUR);
        LocalDateTime time = LocalDateTime.parse(date,dtf);
        System.out.println("time = " + time);
    }
}
