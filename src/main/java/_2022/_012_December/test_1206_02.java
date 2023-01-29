package _2022._012_December;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/6 18:07
 */
public class test_1206_02 {
    public static void main(String[] args) {

        String date = "1001";
        boolean value = isValidDate(date);
        System.out.println(value);

    }
    public static boolean isValidDate(String str) {
        boolean convertSuccess=true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
//        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess=false;
        }
        return convertSuccess;
    }

}


