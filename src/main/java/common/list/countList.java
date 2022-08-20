package common.list;

import _2022._08_August.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 集合的累加
 * @Author XuShen
 * @Date 2022/8/15 17:28
 */

/**
 * 参考链接：
 * https://blog.csdn.net/qq_38974638/article/details/113913754?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_utm_term~default-0-113913754-blog-105997060.pc_relevant_multi_platform_featuressortv2removedup&spm=1001.2101.3001.4242.1&utm_relevant_index=3
 */
public class countList {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,6);
        List<Test> list = new ArrayList<>(Arrays.asList(new Test(1,2),new Test(2,4)));


        /**
         * 使用下面的这几种方法可以进行对应数据的叠加，
         * 自定义类的时候可以根据stream().map(Test::getSum).方法进行提取对应字段的数据，依次进行数据的操作
         * 1.for循环使用忽略
         * 2.stream().reduce
         * 3.Collectors.summingInt实现
         * 4.
         */
        //lambda表达式实现
        Integer sum1 = intList.stream().reduce(0,(current,number) -> current + number);
        System.out.println("sum1 = " + sum1);

        //方法引用实现
        Integer sum2 = intList.stream().reduce(0,Integer::sum);
        System.out.println("sum2 = " + sum2);

        Integer sum3 = intList.stream().collect(Collectors.summingInt(o -> o));
        System.out.println("sum3 = " + sum3);

        System.out.println("************IntSummaryStatistics使用********开始*******");
        List<Integer> list4 = Arrays.asList(1,2,62);
        IntSummaryStatistics summaryStatistics = list4.stream().collect(Collectors.summarizingInt(o->o));
        long sum4 = summaryStatistics.getSum();
        long sum4COUNT = summaryStatistics.getCount();
        double sum4AVE = summaryStatistics.getAverage();
        long sum4MAX = summaryStatistics.getMax();
        long sum4Min = summaryStatistics.getMin();
        System.out.println("sum4 = " + sum4);
        System.out.println("sum4COUNT = " + sum4COUNT);
        System.out.println("sum4AVE = " + sum4AVE);
        System.out.println("sum4MAX = " + sum4MAX);
        System.out.println("sum4Min = " + sum4Min);

        System.out.println("summaryStatistics.toString() = " + summaryStatistics.toString());

        List<Test> listT4 = new ArrayList<>(Arrays.asList(new Test(1,3),new Test(2,3),new Test(4,23)));
        IntSummaryStatistics summaryListSta = listT4.stream().map(Test::getSum).collect(Collectors.summarizingInt(o->o));
        //计算列表中的sum的总和数据
        long sum4L = summaryListSta.getSum();
        System.out.println("列表中数据的总和 = " + sum4L);
        long sum4LCount = summaryListSta.getCount();
        System.out.println("列表中的数据计数 = " + sum4LCount);
        double sum4LAVE = summaryListSta.getAverage();
        System.out.println("列表中的数据的平均数 = " + sum4LAVE);
        long sum4LMAX = summaryListSta.getMax();
        System.out.println("列表中数据的最大数据 = " + sum4LMAX);

        System.out.println("************IntSummaryStatistics使用*****结束**********");

        Integer sum11 = list.stream().map(Test::getSum).reduce(0,(current,number) -> current + number);
        System.out.println("sum11 = " + sum11);
        Integer sum22 = list.stream().map(Test::getSum).reduce(0,Integer::sum);
        System.out.println("sum22 = " + sum22);
        Integer sum33 = list.stream().map(Test::getSum).collect(Collectors.summingInt(o -> o));
        System.out.println("sum33 = " + sum33);




    }
}
