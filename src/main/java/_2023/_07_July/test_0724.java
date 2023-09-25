package _2023._07_July;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/7/24 19:17
 */
public class test_0724 {

    @Test
    public void test() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("E:\\AA公司文档\\ZZZ专业建设\\2023年\\成果资料库\\2月成果资料库_质量分析报告 .docx");
            XWPFDocument xwpfDocument = new XWPFDocument(fileInputStream);
            PdfOptions pdfOptions = PdfOptions.create();
            fileOutputStream = new FileOutputStream("E:\\AA公司文档\\ZZZ专业建设\\2023年\\成果资料库\\ceshi.pdf");
            PdfConverter.getInstance().convert(xwpfDocument,fileOutputStream,pdfOptions);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fileInputStream) {
                    fileInputStream.close();
                }
                if (null != fileOutputStream) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
