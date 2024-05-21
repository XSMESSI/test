package _2024._01_January;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2024/1/17 15:04
 * @Version 1.0
 * @DESC :
 */

public class test_0117 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SumData data = new SumData();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(data);
            thread.setName("自定义线程名称:" + i);
            thread.start();
        }
        List<String> result = data.getResult();
        result.forEach(System.out::println);
        long end = System.currentTimeMillis();
        //计算执行时间
        long execute = end - start;
        System.out.println("代码执行时间:" + execute/10 + "毫秒");
    }
}


class SumData implements Runnable{

    private List<String> result = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("打印信息数据处理:" + Thread.currentThread().getName() + ">>>>" + i);
            result.add(Thread.currentThread().getName() + ">>>>" + i);
        }
    }

    public List<String> getResult() {
        return result;
    }
}


