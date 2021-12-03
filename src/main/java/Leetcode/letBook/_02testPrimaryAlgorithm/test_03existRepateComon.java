package Leetcode.letBook._02testPrimaryAlgorithm;

import java.util.Arrays;

/**
 * @Description 存在重复元素
 * @Author XuShen
 * @Date 2021/12/2 10:21
 */
public class test_03existRepateComon {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    /**
     * 利用数组的排序功能，进行比较前后两个元素是否相等进行操作
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1;i<nums.length;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    /**
     * 超出时间限制
     * @param nums
     * @return
     */
    public static boolean containsDuplicate1(int[] nums) {
        int count = 1;
        for (int i = 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[j] == nums[i]){
                    count++;
                }
                if (count>=2){
                    return true;
                }
            }
        }
        return false;
    }
}
