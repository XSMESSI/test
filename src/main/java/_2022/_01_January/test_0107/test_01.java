package _2022._01_January.test_0107;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/7 9:09
 */
public class test_01 {
    public static void main(String[] args) {
        Map<String, Map<String, List<ProjectExpert>>> mapResult = new HashMap<>();
        Map<String,List<ProjectExpert>> map1111 = new HashMap<>();
        List<ProjectExpert> list1 = new ArrayList<>();
        ProjectExpert param1 = new ProjectExpert();
        param1.setContainerEmail("237777@qq.com");
        param1.setContainerName("A");

        Map<String,List<ProjectExpert>> map2222 = new HashMap<>();
        List<ProjectExpert> list2 = new ArrayList<>();
        ProjectExpert param2 = new ProjectExpert();
        param2.setContainerEmail("237777@qq.com");
        param2.setContainerName("A");
        map2222.put("2",list2);
        mapResult.put("2222",map2222);

        Map<String,List<ProjectExpert>> map3333 = new HashMap<>();
        List<ProjectExpert> list3 = new ArrayList<>();
        ProjectExpert param3 = new ProjectExpert();
        param3.setContainerEmail("237777@qq.com");
        param3.setContainerName("A");
        map3333.put("3",list3);
        mapResult.put("3333",map3333);



        map1111.put("1",list1);
        map1111.put("2",list2);
        map1111.put("3",list3);
        mapResult.put("1111",map1111);



        System.out.println("map1111 = " + map1111);
        System.out.println("map2222 = " + map2222);
        System.out.println("map3333 = " + map3333);
        System.out.println("mapResult = " + mapResult);

    }
}
