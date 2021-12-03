package _2021._08_August.test_0820;

import _2021._08_August.test_0820.bysmyd;
import _2021._08_August.test_0820.jsmyd;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.models.auth.In;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/20 14:52
 */
public class test_01 {
    public static void main(String[] args) {


        List<_2021._08_August.test_0820.bysmyd> xsList = Arrays.asList(
                new _2021._08_August.test_0820.bysmyd(2015,"C罗","意甲",67.3),
                new _2021._08_August.test_0820.bysmyd(2017,"梅西","法甲",77.3),
                new _2021._08_August.test_0820.bysmyd(2018,"德布劳内","英超",88.3),
                new _2021._08_August.test_0820.bysmyd(2019,"范戴克","英超",77.2),
                new _2021._08_August.test_0820.bysmyd(2019,"萨拉赫","英超",67.3),
                new bysmyd(2020,"莱万","德甲",77.2)
        );

        List<_2021._08_August.test_0820.jsmyd> jsList = Arrays.asList(
                new _2021._08_August.test_0820.jsmyd(2016,"瓜迪奥拉","英超",99.3),
                new _2021._08_August.test_0820.jsmyd(2017,"穆里尼奥","意甲",88.3),
                new _2021._08_August.test_0820.jsmyd(2018,"克洛普","英超",88.3),
                new _2021._08_August.test_0820.jsmyd(2019,"齐达内","西甲",77.2),
                new _2021._08_August.test_0820.jsmyd(2019,"科曼","西甲",67.3),
                new _2021._08_August.test_0820.jsmyd(2021,"波切蒂诺","法甲",77.2)
        );



        //对应的是字符串类型的时候用equals
//        List<bysmyd> filterTry = xsList.stream().filter(m -> "范戴克".equals(m.getName())).collect(Collectors.toList());

//        System.out.println(filterTry);

        //对应的Integer数据类型的时候用==
//        List<bysmyd> filterTry1 = xsList.stream().filter(bysmyd -> 2019 == bysmyd.getYear()).collect(Collectors.toList());

//        System.out.println(filterTry1);


//        Map<Integer,List<bysmyd>> bysyearList = xsList.stream().collect(Collectors.groupingBy(bysmyd::getYear));

        Map<Integer,List<_2021._08_August.test_0820.jsmyd>> jsyearList = jsList.stream().collect(Collectors.groupingBy(_2021._08_August.test_0820.jsmyd::getYear));


        List<jsmyd> tempList = jsyearList.get(2008);
        System.out.println(tempList);
//        if (tempList != null){
//            Map<String,List<jsmyd>> result = tempList.stream().collect(Collectors.groupingBy(jsmyd::getName));
//            System.out.println(1==2);
//        }else{
//            System.out.println("tempList是空集合");
//        }
//        Map<String,List<jsmyd>> result = tempList.stream().collect(Collectors.groupingBy(jsmyd::getName));
//        System.out.println(result);
        /**
        Set<Integer> yearxs = bysyearList.keySet();
        Set<Integer> yearjs = jsyearList.keySet();


        Set<Integer> newSet = yearxs.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
        Set<Integer> newSet = yearxs.stream().collect(Collectors.toSet());
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(yearxs);
        System.out.println(yearxs);
        System.out.println(treeSet);

        System.out.println(yearjs);

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(yearxs);
        resultSet.addAll(yearjs);

        List<message> resList = new ArrayList<>();


        for (Integer yearVar:resultSet){

            List<bysmyd> bystempList = bysyearList.get(yearVar);
            List<jsmyd> jstempList = jsyearList.get(yearVar);

            String[] type = {"球员","教练"};

            message temp = new message();
            for (String leixin:type){
                if (CollectionUtils.isNotEmpty(bystempList)){
                    if ("球员".equals(leixin)){
                        for (int i = 0;i<bystempList.size();i++){
                        temp.setYear(yearVar);
                        temp.setName(bystempList.get(i).getName());
                        temp.setJob(leixin);
                        }
                    }
                }else{
//                    System.out.println(yearVar+"--------球员的集合是空的没有办法输出对应的信息");
                }

                if (CollectionUtils.isNotEmpty(jstempList)){
                    if ("教练".equals(leixin)){
                        for (int i = 0;i<jstempList.size();i++){
                        temp.setYear(yearVar);
                        temp.setName(jstempList.get(i).getName());
                        temp.setJob(leixin);
                        }
                    }
                }else{
//                    System.out.println(yearVar+"-------对应的该年下面，教练的数据是空的");
                }
                resList.add(temp);
            }

            System.out.println(resList);
        }

        System.out.println(resultSet);

        for (Integer var:resultSet){
            List<jsmyd> tempList = jsyearList.get(var);
            if (CollectionUtils.isNotEmpty(tempList)){
                System.out.println(tempList);
            }else {
                System.out.println("----"+var+"不存在该年份下面的数据");
            }
        }
        System.out.println(jsyearList.get(1998));//这里返回的是null,不是空集合所以不存在输出对应的集合size值
         */

    }
}
