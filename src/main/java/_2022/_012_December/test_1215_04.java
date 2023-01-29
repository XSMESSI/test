package _2022._012_December;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/15 15:15
 */
public class test_1215_04 {
    public static void main(String[] args) {
        String value = "1009999.8900000";
        BigDecimal decimal = new BigDecimal(value);
        long intData = decimal.setScale(0,BigDecimal.ROUND_DOWN).longValue();
        String intStrign = String.valueOf(intData);
        System.out.println("intData = " + intData);
        System.out.println("intStrign.length() = " + intStrign.length());

        BigDecimal replaceZero = replaceZeroDecimal(decimal);
        if (replaceZero.toString().contains(".")){
            String decimalData = replaceZero.toString().substring(replaceZero.toString().indexOf(".") + 1);
            System.out.println("decimalData = " + decimalData);
        }


    }

    public static BigDecimal replaceZeroDecimal(BigDecimal value){
        try {
            if (Objects.isNull(value)){
                return BigDecimal.ZERO;
            }
            BigDecimal valueStr = new BigDecimal(value.toString());
            return new BigDecimal(valueStr.stripTrailingZeros().toPlainString());
        } catch (Exception e) {
            e.printStackTrace();
            return BigDecimal.ZERO;
        }
    }
}
