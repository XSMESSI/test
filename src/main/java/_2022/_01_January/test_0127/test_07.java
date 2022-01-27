package _2022._01_January.test_0127;

import java.util.PriorityQueue;

/**
 * @Description Queue集合
 * @Author XuShen
 * @Date 2022/1/27 16:57
 */
public class test_07 {
    public static void main(String[] args) {
        /**
         * Queue用于模拟队列这种数据结构，队列通常是指"先进先出"的容器。队列的头部保存在队列中存放时间最长的元素，
         * 队列的尾部保存在队列存放时间最短的元素。新元素插入到队列的尾部，访问元素操作会返回队列头部的元素。
         * 通常，队列不允许随机访问队列中的元素
         */
        PriorityQueue pq = new PriorityQueue();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        pq.offer(100);

        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
