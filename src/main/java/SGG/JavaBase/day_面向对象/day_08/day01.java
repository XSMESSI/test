package SGG.JavaBase.day_面向对象.day_08;

/**
 * @Author: Leo messi
 * @Date: 2022/01/31/16:57
 * @Description:冒泡排序
 */
public class day01 {
    //复制数组，vs 赋值操作

    public static void main(String[] args) {
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //线性查找：
        boolean isFlag = true;
        for (int i = 0;i<arr.length;i++){
            if (22 == arr[i]){
                System.out.println(i);
                isFlag = isFlag;

                break;
            }
        }
        if (isFlag){
            System.out.println("未找到");
        }

        //数组中常见的异常
        //ArrayIndexOutOfBoundsException:数组角标越界的异常
        //合理范围：[0,arr.length-1]
        //越界：arr[-1],arr[arr.length]
        //NullPointException:空指针异常

        int[] arr1 = null;
        System.out.println(arr1[0]);
    }
}

//快排时间复杂度:O(nlogn)
//冒泡排序时间复杂度：O(n^2)
//堆排序,归并排序
