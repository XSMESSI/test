package common.file;

import java.io.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/7 14:54
 */
public class readFile {
    public static void main(String[] args) {
        File file = new File("E:\\AA公司文档\\诊改文件夹\\深圳信息\\深信服务器信息.docx");
        InputStreamReader read = null;

        String result ="";
        try {
            read = new InputStreamReader(new FileInputStream(file),"ISO8859_1");
            BufferedReader reader = new BufferedReader(read);
            String info = "";
            while ((info = reader.readLine()) != null){
                result += info;
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流操作
            if (read != null){
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
