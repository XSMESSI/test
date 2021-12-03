package Leetcode._01testArrayAndString;

import io.swagger.models.auth.In;

import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/17 16:43
 */
public class test_03 {
    public static void main(String[] args) {
        int b = 34;
        System.out.println("b = " + b);
        int[] a = {1,4,3,2,7,45,34};
        Arrays.sort(a);
        for (int i = 0;i<a.length;i++){
            System.out.println("a[i] = " + a[i]);
        }
        Collections.reverse(Arrays.asList(a));
        System.out.println("Arrays.asList(a) = " + Arrays.asList(a));
        for (int i = 0;i<a.length;i++){
            System.out.println("a[i] = " + a[i]);
        }
        List<Integer> list = Arrays.asList(1,2,3,4);
        Collections.reverse(list);
        System.out.println(list);


//        System.out.println(a);
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        System.out.println(intervals);
        

        /**
         * 二位数组的遍历输出
         */
        for (int i=0;i<merge(intervals).length;i++){
            for (int j=0;j<merge(intervals)[i].length;j++){
                System.out.println(merge(intervals)[i][j]);
            }
        }
//        System.out.println(merge(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));//按每行的第0列升序排序
        Vector<int[]> integerVector;//由于我们事先不知道数组大小，所以用Vector类实现动态数组。
        integerVector = new Vector<>();
        int[] ints = intervals[0];//定义一个Int类型数组用于作比较，默认值为第一组二维数组的值。
        for (int i = 1; i < intervals.length; i++) {//循环这个二维数组
            if (ints[1] >= intervals[i][0]) {//如果第一个数组的右端点大于等于下一个数组的左端点，做说明两个数组有所交集。
                ints[1] = Math.max(ints[1], intervals[i][1]);//int类型数组的右端点等于两个数组中右端点大的那个值。
            } else {
                integerVector.add(ints);//把int类型一维数组ints添加到我们创建的vector类里面。
                ints = intervals[i];//给一维数组重新赋值。
            }
        }
        integerVector.add(ints);//把最后一个区间添加到Vector里面
        return integerVector.toArray(new int[integerVector.size()][2]);//把vector转换成二维数组返回。
    }

}
