package _2022._01_January.test_0127;


import java.util.HashSet;

/**
 * @Description Set接口学习
 * @Author XuShen
 * @Date 2022/1/27 11:17
 */
public class test_01 {
    public static void main(String[] args) {
        //HashSet集合使用
        //不能保持元素的排列顺序，顺序可以与添加顺序不同，顺序有可能发生变化，集合元素值可以是null
        HashSet<Integer> hs = new HashSet<>();
        hs.add(19);
        hs.add(5);
        hs.add(20);
        hs.add(19);
        hs.add(41);
        hs.add(0);
        hs.add(null);
        System.out.println("hash集合的大小 = "+hs.size());
        System.out.println("hs = " + hs);
    }
}
