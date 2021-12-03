package _2021._09_September.test_0903;

import _2021._09_September.test_0903.bysmyd;
import _2021._09_September.test_0903.jsmyd;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/20 14:52
 */
public class test_01 {
    public static void main(String[] args) {


        List<_2021._09_September.test_0903.bysmyd> xsList = Arrays.asList(
                new _2021._09_September.test_0903.bysmyd(2015,"C罗","意甲",67.3),
                new _2021._09_September.test_0903.bysmyd(2017,"梅西","法甲",77.3),
                new _2021._09_September.test_0903.bysmyd(2018,"德布劳内","英超",88.3),
                new _2021._09_September.test_0903.bysmyd(2019,"范戴克","英超",77.2),
                new _2021._09_September.test_0903.bysmyd(2019,"萨拉赫","英超",67.3),
                new _2021._09_September.test_0903.bysmyd(2020,"莱万","德甲",77.2)
        );

        List<_2021._09_September.test_0903.jsmyd> jsList = Arrays.asList(
                new _2021._09_September.test_0903.jsmyd(2016,"瓜迪奥拉","英超",99.3),
                new _2021._09_September.test_0903.jsmyd(2017,"穆里尼奥","意甲",88.3),
                new _2021._09_September.test_0903.jsmyd(2018,"克洛普","英超",88.3),
                new _2021._09_September.test_0903.jsmyd(2019,"齐达内","西甲",77.2),
                new _2021._09_September.test_0903.jsmyd(2019,"科曼","西甲",67.3),
                new jsmyd(2021,"波切蒂诺","法甲",77.2)
        );
        /***
         * 计算程序的运行时间：
         * long startTime = System.currentTimeMillis();
         *     dosomeThing();
         *  long endTime = System.currentTimeMillis();
         *
         *   System.out.println("程序运行时间"+(endTime-startTime)+"ms");
         */

        /**
         * 老式循环
         */
        List<String> namelist = new ArrayList<>();
        List<String> unionlist = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0;i<xsList.size();i++){
            namelist.add(xsList.get(i).getName());
        }
        System.out.println("球员名字的集合"+namelist);
        long endTime = System.currentTimeMillis();

        System.out.println("之前的老式for循环的时间"+(endTime-startTime)+"ms");


        /**
         * 新式循环
         */
        long startTime1 = System.currentTimeMillis();
        for (Iterator<bysmyd> iterator = xsList.iterator(); iterator.hasNext();){
            unionlist.add(iterator.next().getUnion());
        }
        System.out.println("球员所在联盟的集合"+unionlist);
        long endTime1 = System.currentTimeMillis();

        System.out.println("新式for循环的时间"+(endTime1-startTime1)+"ms");



    }
}
