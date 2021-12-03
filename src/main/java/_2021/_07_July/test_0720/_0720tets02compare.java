package _2021._07_July.test_0720;

/**
 * @Description ArrayList和LinkedList进行比较
 * @Author XuShen
 * @Date 2021/7/20 15:05
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList和LinkedList进行比较：
 *
 */
public class _0720tets02compare {
    //迭代次数;
    public static int INTERATOR_NUM = 100000;

    public static void main(String[] args) {

        try {
            insertPerformanceCompare();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void insertPerformanceCompare() throws InterruptedException{
        Thread.sleep(5000);

        System.out.println("LinkedList新增测试开始");
        long start = System.nanoTime();
        List<Integer> listedList = new LinkedList<Integer>();
        for (int x = 0 ;x < INTERATOR_NUM;x++){
            listedList.add(x);
        }
        long end = System.nanoTime();
        System.out.println(end-start);


        System.out.println("ArrayList新增测试开始");
        start = System.nanoTime();

        List<Integer> arrayList = new ArrayList<Integer>();
        for (int x = 0;x < INTERATOR_NUM;x++){
            arrayList.add(x);
        }
        end = System.nanoTime();
        System.out.println(end-start);


    }

}
