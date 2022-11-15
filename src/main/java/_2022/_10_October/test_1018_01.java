package _2022._10_October;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/18 11:44
 */
public class test_1018_01 {
    public static void main(String[] args) {
        BigDecimal va1 = null;
        String va1Tra = nullToStr(va1);
        System.out.println("va1Tra = " + va1Tra);
    }


    public static String nullToStr(Object var) {
        return Objects.nonNull(var) ? var.toString() : "";
    }
}
