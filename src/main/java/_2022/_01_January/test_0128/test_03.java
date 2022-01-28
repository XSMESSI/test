package _2022._01_January.test_0128;
import common.bysmyd;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/28 11:54
 */
public class test_03 {
    public static void main(String[] args) {
        List<bysmyd> list = Arrays.asList(
                new bysmyd(2015, "C罗", "意甲", 67.3),
                new bysmyd(2017, "梅西", "法甲", 77.3),
                new bysmyd(2018, "德布劳内", "英超", 88.3),
                new bysmyd(2019, "范戴克", "英超", 77.9),
                new bysmyd(2019, "萨拉赫", "英超", 67.6),
                new bysmyd(2020, "莱万", "德甲", 77.2)
//                new bysmyd(2020, null, "德甲", 77.2),
//                new bysmyd(2025, null, "德甲", 86.2)
        );

        /**
         * 集合里面只拿取两个元素(存放在map集合中)<前面的是主键，后面的是数值>
         */
        Map<Double, String> map = list.stream().collect(Collectors.toMap(bysmyd::getRate,bysmyd::getName));
        System.out.println("map = " + map);




    }
}