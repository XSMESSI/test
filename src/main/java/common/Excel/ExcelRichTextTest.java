package common.Excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 */
public class ExcelRichTextTest {
    public static void main(String[] args) {
        String filePath =
                "E:\\AA公司文档\\诊改文件夹\\福建卫生\\2022-08\\0819\\测试文件夹\\richText_" + System.currentTimeMillis() + ".xlsx";
        File folder = new File(filePath.substring(0, filePath.lastIndexOf(File.separator)));
        if (!folder.exists()) {
            folder.mkdirs();
        }
        Workbook wb = null;
        FileOutputStream out = null;
        try {
            wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet();
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);

            XSSFRichTextString value = new XSSFRichTextString("红色黑色");

            Font redFont = wb.createFont();
            redFont.setColor(Font.COLOR_RED);
            redFont.setBold(true);
            redFont.setFontName("宋体");
            // 给[0, 2)位置设置以上格式
            value.applyFont(0, 2, redFont);

            Font blackFont = wb.createFont();
            blackFont.setColor(Font.COLOR_NORMAL);
            blackFont.setBold(true);
            blackFont.setFontName("宋体");
            value.applyFont(2, value.length(), blackFont);

            cell.setCellValue(value);

            out = new FileOutputStream(filePath);
            wb.write(out);
            System.out.println("导出成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (wb != null) {
                    wb.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}