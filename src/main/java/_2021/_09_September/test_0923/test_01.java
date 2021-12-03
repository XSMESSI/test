package _2021._09_September.test_0923;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Description stream流的创建和使用
 * @Author XuShen
 * @Date 2021/9/22 15:37
 */
public class test_01 {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         * 1.使用Collection下的stream()和parallelStream（）方法
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();//获取一个顺序流
        Stream<String> paralleStream = list.parallelStream();//获取一个并行流

        /**
         * 2.使用Arrays中的stream()方法，将数组转换成流
         */
        Integer[] nums = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(nums);
        System.out.println(stream1);

        /**
         * 3.使用Stream中的静态方法：of(),iterate(),generate()
         */
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6);
        stream2.forEach(System.out::println);
        System.out.println("--------------");

        Stream<Integer> stream21 = Stream.iterate(0,(x) -> x+2).limit(6);
        stream21.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(4);
        stream3.forEach(System.out::println);

        /**
         * 4.使用BufferedReader.line()方法，将每行内容转成流
         */
        BufferedReader reader = new BufferedReader(new FileReader("E:\\A徐慎\\test_stream.txt"));
        Stream<String> lineStream = reader.lines();
        lineStream.forEach(System.out::println);

        /***
         * 5.使用Pattern.spiltAsStream()方法，将字符串分隔成流
         */
        Pattern pattern = Pattern.compile(",");
        Stream<String> stringStream = pattern.splitAsStream("a,b,c,d");
        stringStream.forEach(System.out::println);




    }
}
