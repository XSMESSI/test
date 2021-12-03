package Leetcode.letBook._01ArrayAndString;

/**
 * @Description 零矩阵
 * @Author XuShen
 * @Date 2021/11/18 16:46
 */
public class test_02zeroJuzhen {
    public static void main(String[] args) {

        int[][] nums = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] nums1 = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes1(nums1);


        System.out.println(">>>>>>>>");
        int[][] num11 = new int[4][4];
        boolean[][] booleans = new boolean[4][4];
        for (int i = 0;i<booleans.length;i++){
            for (int j = 0;j<booleans[i].length;j++){
                System.out.print(booleans[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * leetCode官方代码
     * @param matrix
     */
    public static void setZeroes(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }


    /**
     * 自己写的这种方法，比较麻烦，主要是因为int类型里面默认值都是0；
     * @param matrix
     */
    public static void setZeroes1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        for (int i = 0;i<row.length;i++){
            row[i] = -1;
        }
        int[] col = new int[n];
        for (int i = 0;i<col.length;i++){
            col[i] = -1;
        }
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    row[i] = i;
                    col[j] = j;
                }
            }
        }

        for (int i = 0;i<row.length;i++){
            if (row[i]!=-1){
                for (int j= 0;j<n;j++){
                    matrix[row[i]][j] = 0;
                }
            }
        }

        for (int i = 0;i<col.length;i++){
            if (col[i]!=-1){
                for (int j= 0;j<m;j++){
                    matrix[j][col[i]] = 0;
                }
            }
        }

        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
