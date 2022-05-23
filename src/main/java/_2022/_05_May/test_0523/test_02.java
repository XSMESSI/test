package _2022._05_May.test_0523;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/5/23 17:56
 */
public class test_02 {


    @Test
    public void test1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前系统时间戳
        long l = 16532853715000L;
        String format = sdf.format(l);
        System.out.println("日期格式 " + format);

        Date date = new Date(l);
        System.out.println("date格式数据 = " + date);
    }
}
