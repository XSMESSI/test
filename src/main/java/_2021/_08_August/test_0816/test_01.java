package _2021._08_August.test_0816;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description  BigDecimal练习
 * @Author XuShen
 * @Date 2021/8/16 10:46
 */
public class test_01 {
    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();

        list.add(BigDecimal.valueOf(3.2));
        list.add(BigDecimal.valueOf(6.7));
        list.add(BigDecimal.valueOf(10.7));
        list.add(BigDecimal.valueOf(8));
        list.add(BigDecimal.valueOf(20));
        list.add(BigDecimal.valueOf(2.4));
        list.add(BigDecimal.valueOf(10.0));
        list.add(BigDecimal.ONE);
        list.add(BigDecimal.valueOf(10000000));


        System.out.println(list.get(0));
        System.out.println("最后的一个数"+list.get(list.size()-1));

        BigDecimal sum1_5 = BigDecimal.ZERO;
        BigDecimal sum5_10 = BigDecimal.ZERO;
        BigDecimal sumup10 = BigDecimal.ZERO;
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal lis:list){//[1,5]
            if (lis.compareTo(BigDecimal.valueOf(1.0)) != -1 && lis.compareTo(BigDecimal.valueOf(5.0)) != 1){
                sum1_5 = sum1_5.add(BigDecimal.ONE);
            }//(5,10]
            else if (lis.compareTo(BigDecimal.valueOf(5.0)) == 1 && lis.compareTo(BigDecimal.valueOf(10.0)) != 1){
                sum5_10 = sum5_10.add(BigDecimal.ONE);
            }//(10,+无穷）
            else if (lis.compareTo(BigDecimal.valueOf(10.0)) != -1){
                sumup10 = sumup10.add(BigDecimal.ONE);
            }
            sum = sum.add(lis);
        }
        System.out.println("1-5的个数  "+'\t'+sum1_5);
        System.out.println("5-10的个数"+'\t'+sum5_10);
        System.out.println(">10的个数"+'\t'+sumup10);
        System.out.println("计算总共金额"+'\t'+sum);

    }
}
