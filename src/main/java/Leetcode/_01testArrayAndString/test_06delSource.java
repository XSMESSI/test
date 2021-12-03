package Leetcode._01testArrayAndString;

/**
 * @Description 移除元素
 * @Author XuShen
 * @Date 2021/11/18 14:36
 */
public class test_06delSource {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int val = 1;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {

        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int m = 0;
        for (int i = 0;i<n;i++){
            if (nums[i] != val){
                nums[m] = nums[i];
                ++m;
            }
        }
        return m;
    }

}
