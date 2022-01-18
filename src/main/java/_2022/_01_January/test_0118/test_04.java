package _2022._01_January.test_0118;



import _2022._01_January.test_0105.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description 列表对象排序
 * @Author XuShen
 * @Date 2022/1/18 10:27
 */
public class test_04 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("A",20,"001"));
        list.add(new Person("B",30,"002"));
        list.add(new Person("C",40,"003"));

        /**
         * 传入一个比较规则：规定
         * 如果前者小于后者返回   -1
         * 等于返回  0
         * 大于返回 1
         *
         */
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge()<o2.getAge()){
                    return -1;
                }
                if (o1.getAge().equals(o2.getAge())){
                    return 0;
                }
                return 1;
            }
        });

        System.out.println("list = " + list);
    }
}
