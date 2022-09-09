package common.file;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/8 17:08
 */
public class readFile3 {
    public static void main(String[] args) throws IOException {

//        String inPath = "E:\\360MoveData\\Users\\kid\\Desktop\\核心\\公用接口文档.txt";
        String inPath = "E:\\360MoveData\\Users\\kid\\Desktop\\测试文档.doc";
        String content = readToString(inPath);
        System.out.println(content);


        //创建文件的输入流
        File file = new File("E:\\AA公司文档\\诊改文件夹\\深圳信息\\深信服务器信息.docx");
        FileInputStream fileInputStream = new FileInputStream(file);
        //通过fileInPutStream获取对应的Channel
        FileChannel channel = fileInputStream.getChannel();
        //创建缓冲区
        ByteBuffer byteBuffer =ByteBuffer.allocate((int)file.length());
        //将通道的数据读入到buffer
        channel.read(byteBuffer);
        //将byteBuffer的字节数据转成String
//        System.out.println(new String(byteBuffer.array()));
        fileInputStream.close();
    }

    /**
     * 读取本地文件
     * <p><b>创建人：</b><br>&nbsp;&nbsp; 白 2019/7/30 12:42<br>
     * <p><b>修改人：</b><br>&nbsp;&nbsp; 2019/7/30 12:42<br>
     * <p><b>修改说明：</b><br>&nbsp;&nbsp;<br>
     * @return
     */
    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
}
