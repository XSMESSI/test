package _2021._08_August.test_0812;

import _2021._08_August.test_0812.Fruit;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.models.auth.In;
import org.apache.poi.ss.formula.ptg.MemAreaPtg;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Description  练习分组的方法
 * @Author XuShen
 * @Date 2021/8/12 14:24
 */
public class test_01 {
    public static void main(String[] args) {
        List<_2021._08_August.test_0812.Fruit> list = Arrays.asList(
                new _2021._08_August.test_0812.Fruit("梨子", "A", 10),
                new _2021._08_August.test_0812.Fruit("哈密瓜", "D", 10),
                new _2021._08_August.test_0812.Fruit("苹果", "B", 20),
                new _2021._08_August.test_0812.Fruit("香蕉", "B", 20),
                new _2021._08_August.test_0812.Fruit("西瓜", "C", 20),
                new _2021._08_August.test_0812.Fruit("橙子", "D", 30),
                new _2021._08_August.test_0812.Fruit("火龙果", "F", 20),
                new _2021._08_August.test_0812.Fruit("梨子", "D", 30),
                new _2021._08_August.test_0812.Fruit("草莓", "A", 40),
                new _2021._08_August.test_0812.Fruit("猕猴桃", "H", 40)
        );

/**
 * 根据address进行分组
 */
//        Map<String,List<Fruit>> mapAddList = list.stream().collect(Collectors.groupingBy(Fruit::getAddres));
//
//
//
//        System.out.println("B产地的相关信息"+mapAddList.get("t"));

        /**
         * 根据price进行分组
         */
        Map<Integer, List<_2021._08_August.test_0812.Fruit>> mapPriceList = list.stream().collect(Collectors.groupingBy(_2021._08_August.test_0812.Fruit::getPrice));
        System.out.println("价钱为20的相关信息" + mapPriceList.get(20));
        String name[] = {"苹果","香蕉","AAAAAAA"};
            Map<String,List<_2021._08_August.test_0812.Fruit>> tempMap = mapPriceList.get(20).stream().collect(Collectors.groupingBy(_2021._08_August.test_0812.Fruit::getName));
        for (Integer lis : mapPriceList.keySet()) {
            List<Fruit> tempList = mapPriceList.get(lis);
            for (String nam : name){
//                System.out.println(tempList);
                System.out.println("价钱"+lis);
                System.out.println("水果名"+nam);
                System.out.println(CollectionUtils.isNotEmpty(mapPriceList.get(nam))?tempList.size():0);
            }
//            System.out.println();
        }
    }
}
