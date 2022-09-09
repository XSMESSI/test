package common.file.doc;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/8 17:26
 */
public class ReadDoc {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\360MoveData\\Users\\kid\\Desktop\\测试文档.doc");
        String str = "";

        try {
            FileInputStream fis = new FileInputStream(file);
            HWPFDocument doc = new HWPFDocument(fis);
            String doc1 = doc.getDocumentText();
            System.out.println("doc1 = " + doc1);
            StringBuilder doc2 = doc.getText();
            System.out.println("doc2 = " + doc2);
            Range range = doc.getRange();
            String doc3 = range.text();
            System.out.println("doc3 = " + doc3);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
