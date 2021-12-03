package _2021._08_August.test_0811;

import java.math.BigDecimal;
import java.sql.ClientInfoStatus;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import _2021._08_August.test_0811.Score;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIGlobalBinding;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/11 10:15
 */
public class test_01 {
    public static void main(String[] args) {

        List<BigDecimal> list = new ArrayList<>();

        list.add(BigDecimal.valueOf(3.2));
        list.add(BigDecimal.valueOf(6.7));
        list.add(BigDecimal.valueOf(10.7));
        list.add(BigDecimal.valueOf(8.6));
        list.add(BigDecimal.valueOf(20.6));
        list.add(BigDecimal.valueOf(2.4));
        list.add(BigDecimal.valueOf(10.0));
        list.add(BigDecimal.ONE);
        list.add(BigDecimal.valueOf(10000000));


        System.out.println(list.get(0));
        System.out.println("最后的一个数"+list.get(list.size()-1));

        BigDecimal sum1_5 = new BigDecimal(0);
        BigDecimal sum5_10 = new BigDecimal(0);
        BigDecimal sumup10 = new BigDecimal(0);
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal lis:list){//[1,5]
            if (lis.compareTo(BigDecimal.valueOf(1.0)) != -1 && lis.compareTo(BigDecimal.valueOf(5.0)) != 1){
                sum1_5 = sum1_5.add(BigDecimal.valueOf(1));
            }//(5,10]
            else if (lis.compareTo(BigDecimal.valueOf(5.0)) == 1 && lis.compareTo(BigDecimal.valueOf(10.0)) != 1){
                sum5_10 = sum5_10.add(BigDecimal.valueOf(1));
            }//(10,+无穷）
            else if (lis.compareTo(BigDecimal.valueOf(10.0)) != -1){
                sumup10 = sumup10.add(BigDecimal.valueOf(1));
            }
            sum = sum.add(lis);
        }
        System.out.println("1-5的个数  "+'\t'+sum1_5);
        System.out.println("5-10的个数"+'\t'+sum5_10);
        System.out.println(">10的个数"+'\t'+sumup10);
        System.out.println("计算总共金额"+'\t'+sum);

    }
}
