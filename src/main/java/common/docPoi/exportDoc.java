package common.docPoi;

import com.deepoove.poi.XWPFTemplate;
import lombok.Data;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author xu Shen
 * @version 1.0
 * @description word导出的测试
 * @date 2023/7/12 15:49
 */
@Data
public class exportDoc {

    @Test
    public void test1(){
        File file = new File("D:/开发资料/Poi文件导出/template.doc");
        XWPFTemplate template = XWPFTemplate.compile(file.getPath()).render(new HashMap<String,Object>(){
            {
                put("title","测试数据");
            }
        });
        try {
            FileOutputStream outputStream = new FileOutputStream("D:/开发资料/Poi文件导出/template.doc");
            template.write(outputStream);
            outputStream.flush();
            outputStream.close();
            template.close();
            System.out.println("导出数据>>>>>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
