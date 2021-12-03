package Leetcode.letBook._02testPrimaryAlgorithm;

import java.util.Arrays;

/**
 * @Description 旋转数组
 * @Author XuShen
 * @Date 2021/12/2 9:16
 */
public class test_02CircleArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6},2);
    }


    public static void rotate(int[] nums, int k) {
        int newNums[] = (int[]) Arrays.copyOf(nums,nums.length);
        for (int i = 0;i<nums.length;i++){
            nums[(i+k)%nums.length] = newNums[i];
        }

        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
