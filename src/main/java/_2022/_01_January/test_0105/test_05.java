package _2022._01_January.test_0105;

import common.bysmyd;

import java.util.*;

/**
 * @Description 遍历collection
 * @Author XuShen
 * @Date 2022/1/5 14:08
 */
public class test_05 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i<10;i++){
            collection.add(random.nextInt(100));
        }
        System.out.println(collection);

        Iterator it = collection.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(1, "C罗", "意甲", 67.3),
                new bysmyd(0, "梅西", "法甲", 77.3),
                new bysmyd(0, "德布劳内", "英超", 88.3),
                new bysmyd(0, "范戴克", "英超", 77.2),
                new bysmyd(0, "萨拉赫", "英超", 67.3),
                new bysmyd(0, "莱万", "德甲", 77.2),
                new bysmyd(0, null, "德甲", 77.2),
                new bysmyd(0, null, "德甲", 86.2)
        );

        //加上对象的类型
        Iterator<bysmyd> it1 = xsList.iterator();
        while (it1.hasNext()){
            bysmyd var = it1.next();
            System.out.println(var);
        }

        //不加对象的类型
        Iterator it2 = xsList.iterator();
        while (it2.hasNext()){
            Object var = it2.next();
            System.out.println(var);
        }
    }
}
