package _2024._01_January;

/**
 * @Author Xu Shen
 * @Date 2024/1/17 15:54
 * @Version 1.0
 * @DESC :
 */
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadAddData {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 创建一个线程池
        //开始时间
        LocalDateTime start = LocalDateTime.now();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 创建一个集合用于存储数据
        List<Integer> dataList = Collections.synchronizedList(new ArrayList<>());

        // 创建10个任务
        List<Future<Void>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Callable<Void> task = () -> {
                for (int j = 0; j < 100; j++) {
                    dataList.add(j);
                }
                return null;
            };
            futures.add(executorService.submit(task));
        }

        // 等待所有任务完成
        for (Future<Void> future : futures) {
            future.get();
        }

        // 关闭线程池
        executorService.shutdown();

        // 输出集合中的数据
        //结束时间
        LocalDateTime end = LocalDateTime.now();
        System.out.println("输出集合中的数据");
        dataList.forEach(System.out::println);
        long execute = ChronoUnit.MILLIS.between(start,end);
        //计算这两个日期之间的毫秒数差
        System.out.println("execute = " + execute);

    }
}

