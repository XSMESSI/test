package _2023._012_Dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2023/12/8 17:17
 * @Version 1.0
 * @DESC :
 */
public class test_1208 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> result = findAdjacentDuplicates(list);
        System.out.println(result); // 输出： [2, 4, 4]
        findAdjacentDuplicatesnew(list);
    }

    public static List<Integer> findAdjacentDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void findAdjacentDuplicatesnew(List<Integer> list) {
        Integer start = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            Integer thisRaw = list.get(i);
            Integer nextRaw = list.get(i + 1);
            if (thisRaw.equals(nextRaw)) {
                System.out.println("找到相邻的相同元素： " + list.get(i) + ", 位置： " + i + " 和 " + (i + 1));
            }
        }
    }
}
