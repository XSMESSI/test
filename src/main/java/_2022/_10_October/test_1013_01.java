package _2022._10_October;

import common.bysmyd;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/13 10:16
 */
public class test_1013_01 {
    public static void main(String[] args) {

        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(2015, "C罗", "意甲", 67.3),
                new bysmyd(2017, "梅西", "法甲", 77.3),
                new bysmyd(2018, "德布劳内", "英超", 88.3),
                new bysmyd(2019, "范戴克", "英超", 77.2),
                new bysmyd(2019, "萨拉赫", "英超", 67.3),
                new bysmyd(2020, "莱万", "德甲", 77.2),
                new bysmyd(2020, null, "德甲", 77.2),
                new bysmyd(2025, null, "德甲", 86.2)
        );

//        Map<String,List<String>> map = xsList.stream().collect(Collectors.groupingBy(Collectors.groupingBy(bysmyd::getUnion,)));
    }
}
