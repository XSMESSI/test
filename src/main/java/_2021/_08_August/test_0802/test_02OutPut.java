package _2021._08_August.test_0802;

import java.io.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/2 16:12
 */
public class test_02OutPut {
    private static InputStream in;
    private static OutputStream out;
    public static void main(String[] args) {

        try {
            in = new FileInputStream("E:/A徐慎/测试InputStrean.txt");

            if(in == null){
                System.out.println("原文件不存在");
            }else{
                //原文件存在，判断目标文件是不是存在
                System.out.println("没有对应的目标文件，重新在该目录下面重新建立");
                System.out.println("建立的文件中的内容正式源文件中的内容");
                File file = new File("E:/A徐慎/测试InputStreanOnceAgain.txt");
                if (!file.exists()){
                    //目标文件不存在，创建目标文件
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                out  = new FileOutputStream(file);

                int a = 0;
                while ((a = in.read()) != -1){
                    out.write(a);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
