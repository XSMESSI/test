package common.Always;

import common.json_list_str.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description 空指针和空集合的区别
 * @Author XuShen
 * @Date 2023/3/20 10:04
 */
public class NullAndEmpty {
    public static void main(String[] args) {
        List<People> empty = new ArrayList<>();
//        empty.add(new People(1,"A",20));
        Map<Integer,List<People>> map = empty.stream().collect(Collectors.groupingBy(People::getId));
        System.out.println("map = " + map);
        List<People> nullList = null;
        Map<Integer,List<People>> mapT = nullList.stream().collect(Collectors.groupingBy(People::getId));
        System.out.println("mapT = " + mapT);

    }
}
