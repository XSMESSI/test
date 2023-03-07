package _2023._03_March;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/3 14:18
 */
public class test_0303 {
    public static void main(String[] args) {
        String value = "24";
        //保留两位小数
        BigDecimal decimal = new BigDecimal(value).setScale(2,BigDecimal.ROUND_HALF_UP);
        //不足两位小数补0
        DecimalFormat decimalFormat = new DecimalFormat("0.00#");
        String strval = decimalFormat.format(decimal);
        System.out.println("strval = " + strval);
    }
}
