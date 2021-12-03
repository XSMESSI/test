package _2021._11_November.test_1117;

import org.apache.http.entity.ContentType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/26 11:46
 */
public class test_02 {
//    @RequestMapping(value = "up")
    public static void main(String[] args) {
        System.out.println(upFile());
    }
    public static String upFile() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
            String filepath = "E:\\A徐慎";//D盘下的file文件夹的目录
        File file = new File(filepath);//File类型可以是文件也可以是文件夹
        File[] fileList = file.listFiles();//将该目录下的所有文件放置在一个File类型的数组中
        for (int j = 0; j < fileList.length; j++) {


            final int i = j;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        File pdf = fileList[i];

                        FileInputStream fileInputStream = null;
                        fileInputStream = new FileInputStream(pdf);

                        MultipartFile multipartFile = new MockMultipartFile(pdf.getName(), pdf.getName(),
                                ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
//                        String url = ossFileUtils.upload(multipartFile.getOriginalFilename(), multipartFile);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    }
                }
            });


        }

        return "成功";
    }
}
