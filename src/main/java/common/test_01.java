package common;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/20 14:52
 */
public class test_01 {
    public static void main(String[] args) {

        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(2015,"C罗","意甲",67.3),
                new bysmyd(2017,"梅西","法甲",77.3),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2019,"范戴克","英超",77.2),
                new bysmyd(2019,"萨拉赫","英超",67.3),
                new bysmyd(2020,"莱万","德甲",77.2)
        );

        List<jsmyd> jsList = Arrays.asList(
                new jsmyd(1,"瓜迪奥拉","英超",99.3),
                new jsmyd(2,"穆里尼奥","意甲",88.3),
                new jsmyd(3,"克洛普","英超",88.3),
                new jsmyd(4,"齐达内","西甲",77.2),
                new jsmyd(5,"科曼","西甲",67.3),
                new jsmyd(6,"波切蒂诺","法甲",77.2),
                new jsmyd(7,"瓜迪奥拉","英超",99.3),
                new jsmyd(8,"穆里尼奥","意甲",88.3),
                new jsmyd(9,"克洛普","英超",88.3),
                new jsmyd(10,"齐达内","西甲",77.2),
                new jsmyd(11,"科曼","西甲",67.3),
                new jsmyd(12,"波切蒂诺","法甲",77.2),
                new jsmyd(13,"瓜迪奥拉","英超",99.3),
                new jsmyd(14,"穆里尼奥","意甲",67.3),
                new jsmyd(15,"克洛普","英超",88.3),
                new jsmyd(16,"齐达内","西甲",88.2),
                new jsmyd(17,"科曼","西甲",67.3),
                new jsmyd(18,"波切蒂诺","法甲",77.2),
                new jsmyd(19,"齐达内","西甲",88.2),
                new jsmyd(20,"科曼","西甲",67.3),
                new jsmyd(21,"波切蒂诺","法甲",77.2)

        );


//        List<jsmyd> filterList = jsList.stream().filter(o -> o.getYear().equals(2022)).collect(Collectors.toList());
//        System.out.println(filterList.size());

        System.out.println(jsList.size());
        Integer index = jsList.indexOf("科曼");



        List<jsmyd> pageResult = jsList.subList(0+10,10+10);
        System.out.println(pageResult);







        Map<Integer,List<bysmyd>> bysyearList = xsList.stream().collect(Collectors.groupingBy(bysmyd::getYear));


        System.out.println(jsList);
        List<List<jsmyd>> stream = new ArrayList<List<jsmyd>>();
        stream.add(jsList);
        System.out.println("LIst<LIST>"+stream);

        List<bysmyd> _1998List = bysyearList.get(1998);
//        System.out.println(_1998List);

        //这个时候的_1998List集合就是一个null没有办法进行下面的操作了
//        Map<String,List<bysmyd>> nameList = _1998List.stream().collect(Collectors.groupingBy(bysmyd::getName));
//        System.out.println(nameList);

        Map<Integer,List<jsmyd>> jsyearList = jsList.stream().collect(Collectors.groupingBy(jsmyd::getYear));


        List<jsmyd> tempList = jsyearList.get(2008);
//        System.out.println(tempList);
        if (tempList != null){
            Map<String,List<jsmyd>> result = tempList.stream().collect(Collectors.groupingBy(jsmyd::getName));
//            System.out.println(1==2);
        }else{
//            System.out.println("tempList是空集合");
        }
//        Map<String,List<jsmyd>> result = tempList.stream().collect(Collectors.groupingBy(jsmyd::getName));
//        System.out.println(result);

        Set<Integer> yearxs = bysyearList.keySet();
        Set<Integer> yearjs = jsyearList.keySet();
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.addAll(yearxs);
//        System.out.println(yearxs);
//        System.out.println(treeSet);

//        System.out.println(yearjs);

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(yearxs);
        resultSet.addAll(yearjs);

        /***
         *按照大小进行排序
         */
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(yearxs);
//        System.out.println(yearxs);
//        System.out.println(treeSet);

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
                }

                if (CollectionUtils.isNotEmpty(jstempList)){
                    if ("教练".equals(leixin)){
                        for (int i = 0;i<jstempList.size();i++){
                        temp.setYear(yearVar);
                        temp.setName(jstempList.get(i).getName());
                        temp.setJob(leixin);
                        }
                    }
                }
                resList.add(temp);
            }

//            System.out.println(resList);
        }

//        System.out.println(resultSet);

        for (Integer var:resultSet){
            List<jsmyd> tempList1 = jsyearList.get(var);
            if (CollectionUtils.isNotEmpty(tempList)){
//                System.out.println(tempList);
            }else {
//                System.out.println("----"+var+"不存在该年份下面的数据");
            }
        }
//        System.out.println(jsyearList.get(1998));//这里返回的是null,不是空集合所以不存在输出对应的集合size值


    }
}
