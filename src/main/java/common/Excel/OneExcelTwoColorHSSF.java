package common.Excel;



import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description HSSFWorkbook
 * @Author XuShen
 * @Date 2022/8/19 15:13
 */
public class OneExcelTwoColorHSSF {
    public static void main( String[] args ) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet("自定义单元格部分内容颜色");

        HSSFRow row  = sheet.createRow(5);

        HSSFCell cell = row.createCell(5);

        CellStyle cellStyle = workbook.createCellStyle();

        HSSFFont font = workbook.createFont();

        font.setColor(HSSFFont.COLOR_RED);
//        font.setColor(HSSFColor.BLACK.index);

        font.setFontName("宋体");

        font.setFontHeight((short)700);

        HSSFFont font2 = workbook.createFont();

        font2.setColor(HSSFFont.COLOR_NORMAL);
//        font2.setColor(HSSFColor.RED.index);

        font2.setFontName("黑体");

        font2.setFontHeight((short)800);
//        font2.setBoldweight((short)700);

        cellStyle.setFont(font2);

        cell.setCellStyle(cellStyle);

        String txt = "测试数据*必填数据";

        HSSFRichTextString text = new HSSFRichTextString(txt);

        /**
         * 必填字段的文字样式要求：
         * 该单元格重点的字体中如果包含*必填*,整个单元格中的字体，只有*必填*显示红色，其余均显示黑色,
         * 如果单元格中不包含*必填*,全部显示红色
         */
        System.out.println(txt.indexOf("*必填*"));
        if (txt.contains("*必填*")){
            //黑色
            text.applyFont(0,txt.indexOf("*必填*")+1,font2);

            //红色
            text.applyFont(txt.indexOf("*必填*"),txt.length(),font);

        }

//        XSSFRichTextString text = new XSSFRichTextString(txt);

        //        if (txt.contains("*必填*")){
//            //黑色
//            text.applyFont(0,txt.indexOf("*必填*")+1,font2);
//
//            //红色
//            text.applyFont(txt.indexOf("*必填*"),txt.length(),font);
//
//        }



        cell.setCellValue(text);

        sheet.autoSizeColumn(5,true);

        File file = new File("E:\\AA公司文档\\诊改文件夹\\福建卫生\\2022-08\\0819\\测试文件夹\\我要变成红色的字体.xls");
        System.out.println("导出成功");
        if(file.exists()){

            file.delete();

        }

        file.createNewFile();

        workbook.write(new FileOutputStream( file ));

    }
}
