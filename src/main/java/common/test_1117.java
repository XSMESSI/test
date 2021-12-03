package common;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/17 9:54
 */
public class test_1117 {
    public static void main(String[] args) {
        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(1, "C罗", "意甲", 67.3),
                new bysmyd(0, "梅西", "法甲", 77.3),
                new bysmyd(0, "德布劳内", "英超", 88.3),
                new bysmyd(0, "范戴克", "英超", 77.2),
                new bysmyd(0, "萨拉赫", "英超", 67.3),
                new bysmyd(0, "莱万", "德甲", 77.2),
                new bysmyd(0, null, "德甲", 77.2),
                new bysmyd(0, null, "德甲", 86.2)
        );

        xsList = xsList.stream().sorted(Comparator.comparing(bysmyd::getYear).thenComparing(bysmyd::getRate).reversed()).collect(Collectors.toList());
        System.out.println(xsList);


    }
}
