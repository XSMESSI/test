package _2023._04_Aprial;

import common.json_list_str.People;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/4/20 11:34
 */
public class test_0420_01 {


    @Test
    public void testOne(){
        List<People> list = new ArrayList<>();
        list.add(new People(1,"A",20));
        list.add(new People(2,"B",null));
        list.add(new People(4,"C",10));

        //降序: nullsFirst() 会将null放在后面
        //升序: nullsFirst() 会将null放在前面

        //null 放在前面，根据age升序排序
        List<People> asc = list.stream().sorted(Comparator.comparing(People::getAge,Comparator.nullsFirst(Integer :: compareTo))).collect(Collectors.toList());
        asc.forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>");
        //根据age降序排序
        List<People> desc = list.stream().sorted(Comparator.comparing(People::getAge,Comparator.nullsFirst(Integer :: compareTo).reversed())).collect(Collectors.toList());
        desc.forEach(System.out::println);




    }
}
