package _2023._02_Feb.job;

import _2023._02_Feb.test_Thread.ThreadDemo;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/27 17:48
 */
public class Job {

    @Scheduled(cron = "0/1 * * * * ?")
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        // 启动线程
        threadDemo.start();
        System.out.println(Thread.currentThread().getName()+" 运行结束");
    }

}
