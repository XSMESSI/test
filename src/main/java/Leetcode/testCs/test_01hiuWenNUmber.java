package Leetcode.testCs;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/2 16:16
 */
public class test_01hiuWenNUmber {
    public static void main(String[] args) {
        int num = 123;
        byte[] arr = new byte[4];
        System.out.println("(byte) = " + (byte)(num & 0xff));
        System.out.println("(byte)((num >> 8) & 0xff) = " + (byte)((num >> 8) & 0xff));
        arr[0] = (byte)(num & 0xff);
        arr[1] = (byte)((num >> 8) & 0xff);
        arr[2] = (byte)((num >> 16) & 0xff);
        arr[3] = (byte)((num >>> 24));

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }

    }
}
