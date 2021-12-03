package _2021._09_September.test_0926;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @Description BigDecimal格式化
 * @Author XuShen
 * @Date 2021/9/27 14:01
 */
public class test_05BigDecimal04 {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();//建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();//建立百分比格式化应用
        percent.setMaximumFractionDigits(3);//百分比小数点最多3位


        BigDecimal loanAmount = new BigDecimal("15000.48");//贷款金额
        BigDecimal interestRate = new BigDecimal("0.008");//利率
        BigDecimal interest = loanAmount.multiply(interestRate);//相乘

        System.out.println("贷款金额：\t"+currency.format(loanAmount));
        System.out.println("利率：\t"+percent.format(interestRate));
        System.out.println("利息：\t"+currency.format(interest));


    }
}
