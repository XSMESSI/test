package Leetcode.letBook._01ArrayAndString;

/**
 * @Description 对角线遍历
 * @Author XuShen
 * @Date 2021/11/18 17:55
 */
public class test_03LineCore {
    public static void main(String[] args) {

        int[][] mat ={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0;i<mat.length;i++){
            for (int j = 0;j<=mat[i].length;j++){
                if (j-i>=0){
                    System.out.println(mat[i][j-i]);
                }
            }
        }
    }

//    public int[] findDiagonalOrder(int[][] mat) {
//
//        int[] result = new int[mat.length*mat[0].length];
//        for ()
//        for (int i = 0;i<mat.length;i++){
//            for (int j = 0;j<=mat[i].length;j++){
//                result[]
//            }
//        }
//    }
}
