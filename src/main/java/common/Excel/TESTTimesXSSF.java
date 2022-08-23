package common.Excel;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/19 17:59
 */
public class TESTTimesXSSF {
    public static void main( String[] args ) throws IOException {
        LocalDateTime start = LocalDateTime.now();

        XSSFWorkbook wb = new XSSFWorkbook();

        Sheet sheet = wb.createSheet("自定义单元格部分内容颜色");



        CellStyle cellStyle = wb.createCellStyle();

        Font font = wb.createFont();

        font.setColor(HSSFFont.COLOR_RED);
//        font.setColor(HSSFColor.BLACK.index);

        font.setFontName("宋体");

        font.setFontHeight((short)700);

        Font font2 = wb.createFont();
        font2.setColor(HSSFFont.COLOR_NORMAL);
        font2.setFontName("黑体");
        font2.setFontHeight((short)800);
        cellStyle.setFont(font2);


        String txt = "测试数据*必填*";

//        HSSFRichTextString text = new HSSFRichTextString(txt);
//        /**
//         * 必填字段的文字样式要求：
//         * 该单元格重点的字体中如果包含*必填*,整个单元格中的字体，只有*必填*显示红色，其余均显示黑色,
//         * 如果单元格中不包含*必填*,全部显示红色
//         */
//        System.out.println(txt.indexOf("*必填*"));
//        if (txt.contains("*必填*")){
//            //黑色
//            text.applyFont(0,txt.indexOf("*必填*")+1,font2);
//            //红色
//            text.applyFont(txt.indexOf("*必填*"),txt.length(),font);
//        }

        XSSFRichTextString text = new XSSFRichTextString(txt);
        text.applyFont(0,2,font2);
        text.applyFont(2,5,font);
//        if (txt.contains("*必填*")){
//            //黑色
//            text.applyFont(0,txt.indexOf("*必填*")+1,font2);
//            //红色
//            text.applyFont(txt.indexOf("*必填*"),txt.length(),font);
//        }
        for (int i = 0; i < 16000; i++) {
            Row row  = sheet.createRow(i);
            for (int j = 0; j < 10000; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(txt + i + "-" + j);
            }
        }
//        sheet.autoSizeColumn(5,true);
        File file = new File("E:\\AA公司文档\\诊改文件夹\\福建卫生\\2022-08\\0819\\测试文件夹\\测试耗时\\XSSF耗时.xls");
        System.out.println("导出成功");
        LocalDateTime end = LocalDateTime.now();
        int time = end.getSecond() - start.getSecond();
        System.out.println("XSSF" + time + "秒");
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
        wb.write(new FileOutputStream( file ));

    }
}
