package _2021._07_July.test_0719;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _0719test3_stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
        Stream<String> stream = list.stream();
        System.out.println(stream);


    }
}
