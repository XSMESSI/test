package _2022._08_August;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.sun.tools.corba.se.idl.StringGen;

import java.time.LocalDate;
import java.util.Collections;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/1 16:16
 */
public class test_0801_01 {
    public static void main(String[] args) {
        Integer nowYear = LocalDate.now().getYear();
        for (int i = nowYear - 5;i < nowYear;i++){
            System.out.println("i = " + i);

        }


        String str = null;
        String str1 = "";
//        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());
        System.out.println(str1=="");
    }
}
