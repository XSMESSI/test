package _2022._01_January.test_0105;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/5 10:36
 */
public class test_04CollectionStream {

    @Test
    public void testStream(){
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i<10;i++){
            collection.add(random.nextInt(100));
        }
        System.out.println(collection);

        //collection存储的数值是包装类型，可以将其转换为IntSteam
        IntStream intStream = collection.stream().mapToInt(m->m);
//        System.out.println("intStream = " + intStream);
        //求出所有总和
        System.out.println(collection.stream().mapToInt(m->m).sum());
        //输出最大值
        collection.stream().mapToInt(m->m).max().ifPresent(System.out::println);
        //输出最小值
        collection.stream().mapToInt(m->m).min().ifPresent(System.out::println);
        //统计大于50的数（数量）
        System.out.println("大于50的数"+collection.stream().filter(m->m > 50).count());

        //原数值每个元素值加1
        System.out.println(">>数值加1>>start");
        collection.stream().mapToInt(m->m+1).forEach(System.out::println);
        System.out.println(">>数值加1>>end");
        //排序
        System.out.println("排序");
        collection.stream().mapToInt(m->m).sorted().forEach(System.out::println);
        //原数值每个元素扩大2倍
        int[] ints = collection.stream().mapToInt(m->m << 1).toArray();
        //输出原数组
        System.out.println(Arrays.toString(ints));
        //数组转为流
        IntStream stream = Arrays.stream(ints);
        //输出流平均数
        System.out.println(stream.average().getAsDouble());


    }


}
