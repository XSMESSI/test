package sggJavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/22/22:57
 * @Description:
 */
//相关方法的代码进行完善一下
/**
 * 自定义数组的工具类
 */
public class ArrayUtil {

    //求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i=0;i<arr.length;i++){
            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //求数组的最小值
    public int getMIn(int[] arr){
        int minValue = arr[0];
        for (int i=0;i<arr.length;i++){
            if (minValue > arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    //求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    //平均值
    public int getAvg(int[] arr){
        return getSum(arr)/arr.length;
    }
    //反转数组
    public void reverse(int[] arr){

    }
    //复制数据

    public int[] copy(int[] arr){
        return null;
    }


    //数组排序
    public void sort(int[] arr){

    }
    //遍历数组
    public void print(){

    }

    //查找指定元素
    public int getIndex(int[] arr,int dest){
        for (int i = 0; i < arr.length ; i++){
            if (dest == arr[i]){
                return i;
            }
        }
        return -1;//返回一个负数，表示没有找到
    }
}
