package _2022._01_January.test_0118;

import common.bysmyd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 测试过滤数据的前后关系
 * @Author XuShen
 * @Date 2022/1/18 13:32
 */
public class test_05 {
    public static void main(String[] args) {
        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(2015, "C罗", "意甲", 77.3),
                new bysmyd(2017, "梅西", "法甲", 77.3),
                new bysmyd(2018, "德布劳内", "英超", 88.3),
                new bysmyd(2019, "范戴克", "英超", 77.2),
                new bysmyd(2019, "萨拉赫", "英超", 67.3),
                new bysmyd(2020, "萨拉赫", "德甲", null),
                new bysmyd(2020, null, "德甲", null),
                new bysmyd(2025, null, "德甲", 86.2)
        );
        //为了防止null进行比较的时候报错，固定值写在前面，第二个是报错的
//        xsList = xsList.stream().filter(o->("萨拉赫").equals(o.getName())).collect(Collectors.toList());
        xsList = xsList.stream().filter(o->o.getName().equals("萨拉赫")).collect(Collectors.toList());
        System.out.println("xsList = " + xsList);

    }
}
