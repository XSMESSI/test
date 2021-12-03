package Leetcode._01testArrayAndString;

/**
 * @Description 两数之和
 * @Author XuShen
 * @Date 2021/11/18 11:19
 */
public class test_04addNum {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        int target = 5;

        for (int i = 0;i<twoSum(nums,target).length;i++){
            System.out.print(twoSum(nums,target)[i]+" ");
        }
    }

    //再次遍历j的时候不能从1开始遍历了
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0;i<nums.length;++i){
            for (int j = 0;j<nums.length;++j){
                if (i != j && nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            continue;
        }
        return result;
    }
}
