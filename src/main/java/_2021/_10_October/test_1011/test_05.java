package _2021._10_October.test_1011;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/11 15:39
 */
public class test_05 {
    public static void main(String[] args) {

        /**
         * java.util.Collections是集合工具类，用来对集合进行操作，
         *
         * 集合Colleections当中的两个方法：
         * 1.addAll方法：因为是静态方法，所以可以，直接进行使用，
         * Colleections.addAll(list,"A","S","d");
         *
         *
         */
        ArrayList<String> list = new ArrayList<>();//创建一个集合进行存储数据
        Collections.addAll(list,"a","s","ert","rter","wr");//可以一次性的输入多个值
        System.out.println("打乱顺序之前的集合："+list);
        Collections.shuffle(list);
        //可以进行斗地主的洗牌功能
        System.out.println("打乱顺序之后的结合是："+list);

    }
}
