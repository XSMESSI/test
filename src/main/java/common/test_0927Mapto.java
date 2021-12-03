package common;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/27 9:38
 */
public class test_0927Mapto {
    public static void main(String[] args) {
        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(2015,"C罗","意甲",67.3),
                new bysmyd(2017,"梅西","法甲",77.3),
                new bysmyd(2018,"德布劳内","英超",88.3),
                new bysmyd(2019,"范戴克","英超",77.2),
//                new bysmyd(2019,"萨拉赫","英超",67.3),
                new bysmyd(2020,"莱万","德甲",77.2)
        );

        List<jsmyd> jsList = Arrays.asList(
                new jsmyd(2016,"瓜迪奥拉","英超",99.3),
                new jsmyd(2017,"穆里尼奥","意甲",88.3),
                new jsmyd(2018,"克洛普","英超",88.3),
                new jsmyd(2019,"齐达内","西甲",77.2),
                new jsmyd(2019,"科曼","西甲",67.3),
                new jsmyd(2021,"波切蒂诺","法甲",77.2)
        );
        jsmyd como = jsList.stream().filter(m -> m.getName().contains("瓜迪奥拉")).collect(Collectors.toList()).get(0);
        System.out.println(como);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        List<String> unionCollect = jsList.stream().map(jsmyd :: getUnion).collect(Collectors.toList());
        Map<Integer,List<bysmyd>> map = xsList.stream().collect(Collectors.groupingBy(bysmyd::getYear));

        Map<Integer,bysmyd> toMap = xsList.stream().collect(Collectors.toMap(bysmyd::getYear, Function.identity()));
        Iterator<Map.Entry<Integer,bysmyd>> it = toMap.entrySet().iterator();
        System.out.println(">>>>>>>>>输出集合list转换为map>>>>>>>");
        while (it.hasNext()){
            Map.Entry<Integer,bysmyd> entity = it.next();
            System.out.println("key = " + entity.getKey()+"\t"+"value= "+entity.getValue());
        }
        System.out.println(unionCollect);

        /**
         * 对union的集合进行去重
         */
        List<String> unionCollectDistinct = unionCollect.stream().distinct().collect(Collectors.toList());
        System.out.println(unionCollectDistinct);

        //直接一步到位的集合，抽取集合中的union的数据，并且去重
        List<String> unionCollectFinish = jsList.stream().map(jsmyd::getUnion).collect(Collectors.toList()).
                stream().distinct().collect(Collectors.toList());
        System.out.println("一步到位的集合"+unionCollectFinish);




    }
}
