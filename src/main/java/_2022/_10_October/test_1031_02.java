package _2022._10_October;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/31 15:32
 */
public class test_1031_02 {



    @Test
    public void test1(){
        String ca = "2.3";
        double dou = Double.valueOf(ca);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        String s = nf.format(dou);
        System.out.println("s = " + s);
        BigDecimal decimal = new BigDecimal(s);
        decimal = decimal.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("decimal = " + decimal);
    }


    //String 转换为Bigdecimal，保留两位小数
    @Test
    public void test2(){
        String str1 = "3.444332";
        BigDecimal bigDecimal = new BigDecimal(str1);
        bigDecimal = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("bigDecimal = " + bigDecimal);
    }

    @Test
    public void etst3(){
        List<String> num1 = Arrays.asList("a","b","c");
        List<Integer> integers = Arrays.asList(1,2,3);

        for (String string : num1) {
            for (Integer integer : integers) {
                if (integer == 2){
                    System.out.println(integer);
                    continue;
                }
            }
            System.out.println("string = " + string);
        }
    }

}
