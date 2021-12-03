package Leetcode._01testArrayAndString;

/**
 * @Description 删除数组中重复元素
 * @Author XuShen
 * @Date 2021/11/18 13:38
 */
public class test_05delSame {
    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int m = 1;
        for (int i = 1;i<n;i++){
            if (nums[i] != nums[i-1]){
                nums[m] = nums[i];
                ++m;
            }
        }
        return m;
    }


    public int removeDuplicates1(int[] nums) {

        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int fast = 1,slow = 1;
        while (fast<n){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }



}
