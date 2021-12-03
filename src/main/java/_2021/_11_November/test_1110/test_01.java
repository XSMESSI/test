package _2021._11_November.test_1110;

import _2021._11_November.test_1110.ListAge;
import _2021._11_November.test_1110.ListName;
import common.bysmyd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/10 10:38
 */
public class test_01 {
    public static void main(String[] args) {
        List<ListName> nameList = Arrays.asList(
                new ListName(1,"梅西"),
                new ListName(2,"C罗"),
                new ListName(4,"内马尔")
        );

        List<_2021._11_November.test_1110.ListAge> ageList = Arrays.asList(
                new _2021._11_November.test_1110.ListAge(1,"36"),
                new _2021._11_November.test_1110.ListAge(2,"28"),
                new ListAge(3,"34")
        );

//        age.stream().sequential().collect(Collectors.toCollection(() -> name));
        //1。List集合转换成map
        Map<Integer,ListName> map = nameList.stream().collect(Collectors.toMap(ListName ::getId, Function.identity()));
        ageList.forEach( age ->{
            if (map.containsKey(age.getId())){
                ListName name1 = map.get(age.getId());
                age.setName(name1.getName());
            }
        });


        System.out.println(ageList);

    }
}
