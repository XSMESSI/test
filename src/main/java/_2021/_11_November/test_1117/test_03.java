package _2021._11_November.test_1117;

import org.apache.http.entity.ContentType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/26 13:38
 */
public class test_03 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\A徐慎\\pointTemplate.xls");
        FileInputStream fileInputStream = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile(file.getName(),file.getName(),
                ContentType.APPLICATION_OCTET_STREAM.toString(),fileInputStream);
        System.out.println(1);
    }
}
