package _2024._06_April;

import common.json_list_str.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName test_0617_01
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/6/17 18:36
 * @Version: 1.0
 */
public class test_0617_01 {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People(1, "Tom", 20));
        list.add(new People(1, "Tom", null));
        list.forEach(System.out::println);
        System.out.println("去重数据》》》》》》");
        List<People> distinctList = new ArrayList<>(list.stream().collect(Collectors.toMap(People::getId, Function.identity(), (a, b) -> {
            if (!Objects.equals(a.getId(), b.getId())) {
                return a;
            } else {
                // 这里可以自定义策略，比如选择较新的那个
                if (Objects.nonNull(a.getAge())){
                    return a;
                }
                if (Objects.nonNull(b.getAge())){
                    return b;
                }
            }
            return a;
        })).values());



        distinctList.forEach(System.out::println);



    }
}
