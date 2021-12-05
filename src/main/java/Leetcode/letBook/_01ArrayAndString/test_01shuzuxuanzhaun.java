package Leetcode.letBook._01ArrayAndString;

/**
 * @Description 矩阵旋转
 * @Author XuShen
 * @Date 2021/11/18 14:59
 */
public class test_01shuzuxuanzhaun {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
    }

        public static void rotate(int[][] matrix) {
            int len = matrix.length;
            if(len==1) return;

            int maxIdx = len-1;
            int[][] newMatrix = new int[len][len];
            for(int y=0; y<len; y++){
                for(int x=0; x<len; x++){
                    newMatrix[y][maxIdx-x]=matrix[x][y];
                }
            }
            /* 采用逐个赋值的方法，而不是 matrix=newMatrix。
             *
             * 本题中，java的参数是一个指向源数组的指针，
             * 直接使用 matrix=newMatrix 赋值改变的是参数的指向，
             * 不是传输进去的源数组的指向。所以需要为参数逐个赋值。*/
            for(int y=0; y<len; y++){
                for(int x=0; x<len; x++){
                    matrix[x][y]=newMatrix[x][y];
                }
            }
            for (int i = 0;i<matrix.length;i++){
                for (int j =0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+"\t");
                }
                System.out.println();
            }

    }

//    public static void rotate(int[][] matrix) {
//        int a = matrix.length-1;
//        int[][] temp = new int[matrix[0].length][matrix.length];
//        for (int i = 0;i<matrix.length;i++,a--){
//            for (int j = 0;j<matrix[i].length;j++){
//                temp[j][a] = matrix[i][j];
//            }
//        }
//        for (int i = 0;i<temp.length;i++){
//            for (int j =0;j<temp[i].length;j++){
//                System.out.print(temp[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
}
