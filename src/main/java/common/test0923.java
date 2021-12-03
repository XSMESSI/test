package common;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/23 15:08
 */
public class test0923 {
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

        List<String> nameList = new ArrayList<>();
        nameList.add("C罗");
        nameList.add("德布劳内");
        nameList.add("内马尔");

        xsList = xsList.stream().filter(o -> nameList.contains(o.getName()) && o.getName()!= null).collect(Collectors.toList());
        List<String> xsList1 = xsList.stream().map(bysmyd::getName).collect(Collectors.toList());

        System.out.println("xsList = " + xsList);
        if (Collections.disjoint(nameList,xsList)){
            System.out.println(1);
        }

        List<String> xsListCopy = new ArrayList(xsList);

    }

}