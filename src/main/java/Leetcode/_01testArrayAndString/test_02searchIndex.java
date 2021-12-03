package Leetcode._01testArrayAndString;

/**
 * @Description 搜索插入位置
 * @Author XuShen
 * @Date 2021/11/17 16:18
 */
public class test_02searchIndex {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {

        int a = nums.length;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == target){
                a = i;
                return a;
            }else if (nums[i]>target){
                a = i;
                return a;
            }
        }
        return a;
    }

}
