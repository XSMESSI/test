package _2021._10_October.test_1011;

import java.util.*;

/**
 * @Description addAll使用方法比较
 * @Author XuShen
 * @Date 2021/10/11 15:15
 */
public class test_04Addall {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreIntegers = {6,7,8,9};
        collection.addAll(Arrays.asList(moreIntegers));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreIntegers);
        System.out.println(collection);

        List<Integer> list3 = Arrays.asList(16,17,18);
        list3.set(1,99);
        System.out.println(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(33);
        list4.set(0,99);
        System.out.println(list4);
    }
}
