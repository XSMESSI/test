package Leetcode._01testArrayAndString;

import java.util.Arrays;

/**
 * @Description 数组和字符串
 * @Author XuShen
 * @Date 2021/11/16 14:34
 */
class test_01 {
    /**
     * 寻找数组的中心索引
     * @param args
     */
    /**
     * 找到中心的位置（前面的元素之和==后面的元素之和）
     * @param args
     */



    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}


