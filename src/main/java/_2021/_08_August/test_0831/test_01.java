package _2021._08_August.test_0831;

import common.bysmyd;
import common.jsmyd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/31 8:58
 */
public class test_01 {
    public static void main(String[] args) {
        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(2015,"C罗","意甲",67.3),
                new bysmyd(2017,"梅西","法甲",77.3),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2019,"范戴克","英超",77.2),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2019,"萨拉赫","英超",67.3),
                new bysmyd(2019,"萨拉赫","英超",67.3),
                new bysmyd(2020,"莱万","德甲",77.2)
        );

        List<jsmyd> jsList = Arrays.asList(
                new jsmyd(2016,"瓜迪奥拉","英超",99.3),
                new jsmyd(2017,"穆里尼奥","意甲",88.3),
                new jsmyd(2018,"克洛普","英超",88.3),
                new jsmyd(2019,"齐达内","西甲",77.2),
                new jsmyd(2019,"科曼","西甲",67.3),
                new jsmyd(2021,"波切蒂诺","法甲",77.2)
        );


        List<String> nameList = new ArrayList<>();
        List<String> nameList1 = new ArrayList<>();

        for (Iterator<bysmyd> it = xsList.iterator();it.hasNext();){
            nameList.add(it.next().getName());
        }

        nameList1.addAll(nameList);

        System.out.println("addAll的使用方法"+nameList1);
        System.out.println("===============");
        System.out.println("没有去重的结合"+nameList);
        System.out.println("没有去重的结合的大小"+nameList.size());


        System.out.println("去重之后的结合"+nameList.stream().distinct().collect(Collectors.toList()));
        System.out.println("去重之后的结合的大小"+nameList.stream().distinct().collect(Collectors.toList()).size());

        List<bysmyd> filteRateList = xsList.stream().filter(m -> m.getRate()>70).collect(Collectors.toList());
        System.out.println(filteRateList);
        List<Double> rateList = new ArrayList<>();
        for (Iterator<bysmyd> it = filteRateList.iterator();it.hasNext();){
            rateList.add(it.next().getRate());
        }
        System.out.println(rateList);
        System.out.println(rateList.stream().distinct().collect(Collectors.toList()));




//        Double count = 0.0;
//
//        for (Iterator<bysmyd> it = xsList.iterator();it.hasNext();){
//            count += it.next().getRate();
//            System.out.println("循环每一次的结果"+count);
//        }
//        System.out.println(count);
    }
}
