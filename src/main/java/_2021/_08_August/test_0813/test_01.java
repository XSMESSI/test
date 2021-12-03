package _2021._08_August.test_0813;

import _2021._08_August.test_0812.Fruit;
import io.lettuce.core.ScriptOutputType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/13 9:30
 */
public class test_01 {
    public static void main(String[] args) {
        List<Fruit> list = Arrays.asList(
                new Fruit("梨子", "A", 10),
                new Fruit("哈密瓜", "D", 10),
                new Fruit("苹果", "B", 20),
                new Fruit("香蕉", "B", 20),
                new Fruit("西瓜", "C", 20),
                new Fruit("橙子", "D", 30),
                new Fruit("火龙果", "F", 20),
                new Fruit("梨子", "D", 30),
                new Fruit("草莓", "A", 40),
                new Fruit("猕猴桃", "H", 40)
        );


        List<Fruit> tryList = new ArrayList<>();


        /**
         * 根据price进行分组
         */
        Map<Integer, List<Fruit>> pricemap = list.stream().collect(Collectors.groupingBy(Fruit::getPrice));//这还是一个map集合，key值是价格
//        System.out.println("priceMap集合"+pricemap.toString());
        List<Fruit> priceList = pricemap.get(20);//这是对应的价格为20的LiSt集合
//        System.out.println("priceList集合"+priceList);
        for (Integer pr : pricemap.keySet()) {
            Map<String, List<Fruit>> tempMap = priceList.stream().collect(Collectors.groupingBy(Fruit::getAddres));
            for (String dz : tempMap.keySet()) {
                List<Fruit> tempLIST = tempMap.get(dz);
                System.out.println(tempLIST);
                System.out.println(tempLIST.size());
                System.out.println(tempLIST.get(0).getName());
                System.out.println("---------");

            }
        }


    }
}