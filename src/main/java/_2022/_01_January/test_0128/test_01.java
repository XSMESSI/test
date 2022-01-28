package _2022._01_January.test_0128;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description 创建Excel表格导出
 * @Author XuShen
 * @Date 2022/1/28 10:19
 */
@Slf4j
public class test_01 {
    public static void main(String[] args) throws IOException {
        /**
         * 一层一层进行分级创建
         */
        //创建HSSFWorkbook对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //创建HSSFSheet对象
        HSSFSheet sheet = wb.createSheet("sheet0");
        //创建HSSFRow对象
        HSSFRow row = sheet.createRow(0);
        //创建HSSFCell对象
        HSSFCell cell = row.createCell(0);

        for (int i = 0;i<10;i++){
            cell = row.createCell(i);
            cell.setCellValue(i);
        }

        //输出Excel文件
        FileOutputStream outputStream = new FileOutputStream("E:/A徐慎/测试文件导出/单独测试文件创建.xlsx");
        log.info(">>>>测试文件已导出>>>>>>");
        wb.write(outputStream);
        outputStream.flush();
    }
}
