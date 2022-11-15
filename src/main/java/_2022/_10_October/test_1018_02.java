package _2022._10_October;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/18 15:43
 */
public class test_1018_02 {
    public static void main(String[] args) {
        BigDecimal a = null;
        Integer faultRate = 6;
        a = BigDecimal.valueOf(faultRate.doubleValue()/3);
        BigDecimal b = a.setScale(2, RoundingMode.HALF_UP);//保留两位小数
        System.out.println("结果是 = " + b);
        //将结果转换为百分比
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(2);
        System.out.println(percent.format(b.doubleValue()));

        String num = null;
        String num1 = " ";
        boolean va = StringUtils.isBlank(num);
        boolean va1 = StringUtils.isBlank(num1);
        System.out.println(va);
        System.out.println(va1);

        boolean aNull = Objects.isNull(num);
        boolean bNull = Objects.isNull(num1);
        System.out.println(aNull);
        System.out.println(bNull);
    }
}
