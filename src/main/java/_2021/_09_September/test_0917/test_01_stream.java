package _2021._2021._09_September.test_0917;

import _2021._09_September.test_0917.Employee;

import javax.swing.plaf.nimbus.State;
import java.rmi.MarshalledObject;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/17 10:32
 */
public class test_01_stream {
    public static void main(String[] args) {
        List<_2021._09_September.test_0917.Employee> employees = Arrays.asList(new _2021._09_September.test_0917.Employee(1,"张三",60,"Busy"),
                new _2021._09_September.test_0917.Employee(2,"李四",50,"BUSY"),
                new _2021._09_September.test_0917.Employee(3,"王五",45,"BUSY"),
                new _2021._09_September.test_0917.Employee(23,"赵六",45,"Free"),
                new _2021._09_September.test_0917.Employee(21,"田七",40,"VACATION"),
                new _2021._09_September.test_0917.Employee(24,"天启",35,"free"));

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result = integers.stream().reduce(5,(x,y) -> x+y);
        System.out.println(result);

        Optional<Integer> ageTotal = employees.stream().map(_2021._09_September.test_0917.Employee::getAge).reduce(Integer::sum);
        long empNum = employees.stream().count();
        System.out.println(ageTotal.get()/empNum);


        /**
         * 将流转换为其他形式，收集到新的集合上，包括Collectors.toList(),Colletors.toSet(),Colleetors.toCollection(集合对象)
         */
        List<String> list = employees.stream().map(_2021._09_September.test_0917.Employee::getName).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("------------");
        Set<String> set = employees.stream().map(_2021._09_September.test_0917.Employee::getName).collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("------------");
        HashSet<String> hashSet = employees.stream().map(_2021._09_September.test_0917.Employee::getName).collect(Collectors.toCollection(HashSet::new));
        hashSet.forEach(System.out::println);

        /**
         * 数组统计的相关方法，包括counting，averagingDouble，summingInt等方法
         */
        //总数
        Long sum = employees.stream().collect(Collectors.counting());;
        System.out.println(sum);
        //平均值
        Double averageAge = employees.stream().collect(Collectors.averagingDouble(_2021._09_September.test_0917.Employee::getAge));
        System.out.println(averageAge);
        //某属性的综合
        Integer ageSum = employees.stream().collect(Collectors.summingInt(_2021._09_September.test_0917.Employee::getAge));
        System.out.println(ageSum);
        //最大值
        Optional<_2021._09_September.test_0917.Employee> maxAgeEmplyee = employees.stream().collect(Collectors.maxBy((e1, e2) -> e1.getAge().compareTo(e2.getAge())));
        System.out.println(maxAgeEmplyee.get());
        //最小值
        Optional<_2021._09_September.test_0917.Employee> minAgeEmplyee = employees.stream().collect(Collectors.minBy((e1, e2) -> e1.getAge().compareTo(e2.getAge())));
        System.out.println(minAgeEmplyee.get());


        /**
         * 分组,根据状态进行分组
         */
        Map<String,List<_2021._09_September.test_0917.Employee>> stateMap = employees.stream().collect(Collectors.groupingBy(_2021._09_September.test_0917.Employee::getState));
        System.out.println(stateMap);

        /**
         * 多级分组
         */
        Map<String,Map<String,List<_2021._09_September.test_0917.Employee>>> collect = employees.stream().collect(Collectors.groupingBy(_2021._09_September.test_0917.Employee::getState,Collectors.groupingBy((e) -> {
            if (((_2021._09_September.test_0917.Employee) e).getAge()<=30){
                return "青年";
            }else if (((_2021._09_September.test_0917.Employee) e).getAge() <= 50){
                return "中年";
            }else{
                return "老年";
            }
        })));
        System.out.println(collect);

        /**
         * 分区
         */
        Map<Boolean,List<Employee>> collect1 = employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 40));
        System.out.println(collect1);

    }

}
