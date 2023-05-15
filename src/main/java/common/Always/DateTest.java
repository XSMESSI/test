package common.Always;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/4/12 15:37
 */
public class DateTest {

    @Test
    public void testThree() throws ParseException {
        Date enddate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String date = formatter.format(enddate);
        System.out.println("date = " + date);
        SimpleDateFormat forMatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date value = forMatter.parse(date + " 23:59:59");
        System.out.println("value = " + value);
        System.out.println("forMatter.format(value) = " + forMatter.format(value));
//        SimpleDateFormat forMatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date value = forMatter.parse(calu);
//        System.out.println("value = " + value);
    }

    /**
     * 日期转为LocalDateTime
     *
     * @param date 日期
     * @return LocalDateTime
     */
    public static LocalDateTime dateToLocalDateTime(final Date date) {
        if (null == date) {
            return null;
        }
        final Instant instant = date.toInstant();
        final ZoneId zoneId = ZoneId.systemDefault();
        final LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime;
    }
    /**
     * 日期转为LocalDate
     *
     * @param date 日期
     * @return LocalDateTime
     */
    public static LocalDate dateToLocalDate(final Date date) {
        if (null == date) {
            return null;
        }
        final Instant instant = date.toInstant();
        final ZoneId zoneId = ZoneId.systemDefault();
        final LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        return localDate;
    }

    /**
     * LocalDateTime转为日期
     *
     * @param localDateTime LocalDateTime
     * @return 日期
     */
    public static Date localDateTimeToDate(final LocalDateTime localDateTime) {
        if (null == localDateTime) {
            return null;
        }
        final ZoneId zoneId = ZoneId.systemDefault();
        final ZonedDateTime zdt = localDateTime.atZone(zoneId);
        final Date date = Date.from(zdt.toInstant());
        return date;
    }

    /**
     * LocalDate转为日期
     *
     * @param localDate
     * @return
     */
    public static Date localDateToDate(final LocalDate localDate) {
        if (null == localDate) {
            return null;
        }
        final ZoneId zoneId = ZoneId.systemDefault();
        final ZonedDateTime zdt = localDate.atStartOfDay().atZone(zoneId);
        final Date date = Date.from(zdt.toInstant());
        return date;
    }

}
