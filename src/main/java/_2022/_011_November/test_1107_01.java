package _2022._011_November;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/7 9:40
 */
public class test_1107_01 {

    @Test
    public void test1(){
        BigDecimal val = new BigDecimal("12.6344");
        BigDecimal intValue  = val.setScale(0, RoundingMode.DOWN);
        System.out.println("intValue = " + intValue);
        System.out.println("intValue.toString().length() = " + intValue.toString().length());
    }
}
