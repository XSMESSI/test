package common.file;

import java.io.File;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/7 15:13
 */
public class FileCode {
    public static void main(String[] args) {
        File file = new File("E:\\AA公司文档\\诊改文件夹\\深圳信息\\深信服务器信息.docx");
        String inPath = "E:\\AA公司文档\\诊改文件夹\\深圳信息\\深信服务器信息.docx";
        String fileEncode = EncodingDetect.getJavaEncode(inPath);
        System.out.println(fileEncode);
    }
}
