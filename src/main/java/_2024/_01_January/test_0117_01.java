package _2024._01_January;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2024/1/17 15:50
 * @Version 1.0
 * @DESC :
 */
public class test_0117_01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SumData data = new SumData();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                result.add(Thread.currentThread().getName() + ">>>>" + i);
            }
        }
        result.forEach(System.out::println);
        long end = System.currentTimeMillis();
        //计算执行时间
        long execute = end - start;
        System.out.println("代码执行时间:" + execute/10 + "毫秒");
    }
}
