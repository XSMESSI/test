package _2022._02_Feb.test_0211;

import java.text.DecimalFormat;
import java.util.EnumSet;

/**
 * @Description 测试枚举类型数据的存储
 * @Date 2022/2/11 13:31
 */
public class test_02 {
    public static void main(String[] args) {


        //创建一个EnumSet集合，集合元素就是FootballStar枚举类的全部枚举值
        EnumSet es1 = EnumSet.allOf(FootballStar.class);
        System.out.println("es1 = " + es1);//输出[Messi, Ronaldo, Neymar, Mbappé]
        //创建一个EnumSet空集合，指定其集合元素是FootballStar类的枚举值
        EnumSet es2 = EnumSet.noneOf(FootballStar.class);
        System.out.println("es2 = " + es2);//输出[]
        //手动添加两个元素
        es2.add(FootballStar.Messi);
        es2.add(FootballStar.Mbappé);
        System.out.println("es2 = " + es2);//输出[Messi, Mbappé]

        //以指定枚举值创建EnumSet集合
        EnumSet es3 = EnumSet.of(FootballStar.Neymar,FootballStar.Ronaldo);
        System.out.println("es3 = " + es3);//输出
        EnumSet es4 = EnumSet.range(FootballStar.Messi,FootballStar.Neymar);
        System.out.println("es4 = " + es4);//输出
        //新创建的EnumSet集合的元素和es4集合的元素有相同类型
        //es5的集合元素 + es4的集合元素 = FootballStar枚举类的全部枚举值
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println("es5 = " + es5);

    }
}
