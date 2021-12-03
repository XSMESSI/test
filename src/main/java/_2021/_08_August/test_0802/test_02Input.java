package _2021._08_August.test_0802;

import java.io.*;

/**
 * @Description  测试文件的输入输出功能
 * @Author XuShen
 * @Date 2021/8/2 15:44
 */
public class test_02Input {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("E:/A徐慎/测试InputStrean.txt");

            if (file.exists()){
                InputStream in = new FileInputStream(file);

                int a = 0;
                while ((a = in.read()) != -1){
                    System.out.print((char) a);
                }
                in.close();
            }else
                System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
