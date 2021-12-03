package _2021._08_August.test_0803;

import javax.xml.rpc.holders.BigDecimalHolder;
import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/3 9:23
 */
public class test_01_BigDecimal {
    public static void main(String[] args) {
        BigDecimal adouble = new BigDecimal(1.22);
        BigDecimal adouble1 = BigDecimal.valueOf(1.22);

        System.out.println("construcet with double value"+adouble);
        String string = adouble.toString();
        System.out.println("adouble长度："+string.length());
        System.out.println(adouble1);

        BigDecimal intValue = new BigDecimal(3);
        BigDecimal intValue1 = BigDecimal.valueOf(3);

        System.out.println(intValue);
        System.out.println(intValue1);

    }
}
