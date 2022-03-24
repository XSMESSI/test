package _2022._03_March.test_0321;

import common.jsmyd;
import javafx.scene.effect.SepiaTone;

import java.util.*;

/**
 * @Description 根据集合中的某一属性进行去重
 * @Author XuShen
 * @Date 2022/3/21 9:12
 */
public class test_01 {
    public static void main(String[] args) {
        List<jsmyd> list = Arrays.asList(
                new jsmyd(2016,"瓜迪奥拉","英超",99.3),
                new jsmyd(2016,"穆里尼奥","意甲",88.3),
                new jsmyd(2018,"克洛普","英超",88.3),
                new jsmyd(2019,"齐达内","西甲",77.2),
                new jsmyd(2019,"科曼","西甲",67.3),
                new jsmyd(2021,"波切蒂诺","法甲",77.2)
        );

        System.out.println("去重之前==="+list.size());
        System.out.println(list);


        //根据集合中的某一属性进行去重操作：
        Set<jsmyd> set = new TreeSet<>(Comparator.comparing(jsmyd::getYear));
        set.addAll(list);
        List<jsmyd> result = new ArrayList<>(set);
        System.out.println("去重之后==="+result.size());
        System.out.println(result);
    }
}
