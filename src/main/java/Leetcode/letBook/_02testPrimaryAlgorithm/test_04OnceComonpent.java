package Leetcode.letBook._02testPrimaryAlgorithm;

import java.util.Arrays;

/**
 * @Description 只出现一次的元素
 * @Author XuShen
 * @Date 2021/12/2 10:37
 */
public class test_04OnceComonpent {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,2,3,3,1}));
    }

    /**
     * 根据异或的规则进行计算
     * (题目的规则是数组中只有一个元素是单个的，其他的元素都是有两个)
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
        }
        return reduce;
    }

    /**
     * 自己写的：纯粹的是用比较方法进行返回数值
     * 出现3次的元素，可以用这种方法
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1){
            return nums[0];
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        if (nums[nums.length-1] != nums[nums.length-2]  && nums.length>2){
            return nums[nums.length-1];
        }
        for (int i = 1;i<nums.length-1;i++){
            if (nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
