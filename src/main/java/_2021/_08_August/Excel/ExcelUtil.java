package _2021._08_August.Excel;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/4 17:36
 */
public class ExcelUtil {
    public static void createExcel(Map<String, List<String>> map,String[] strArray){

        //第一步，创建一个webbook,对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步，在webbook中加入一个sheet页，对应Excel中的sheet
        HSSFSheet sheet1 = wb.createSheet("sheet1");//创建的是sheet1表格
        HSSFSheet sheet2 = wb.createSheet("sheet2");//创建sheet2表格
        sheet1.setDefaultColumnWidth(20);//默认列宽
        sheet2.setDefaultColumnWidth(30);//sheet2表格的列宽

        //第三步，在sheet表中创建第0行，
        HSSFRow row = sheet1.createRow((int)0);
        HSSFRow row1 = sheet2.createRow((int)0);

        //第四步，创建单元格，
        HSSFCellStyle style = wb.createCellStyle();
        //创建一个居中格式:在CSDN上面找到的解决方案
        style.setAlignment(HorizontalAlignment.CENTER);

        //添加Excel的title
        HSSFCell cell = null;
        HSSFCell cell1 = null;

        /**
         * 设置单元格的样式
         */
        Workbook workbook = new XSSFWorkbook();

        Font tileFont =workbook.createFont();
        tileFont.setFontName("宋体");
        tileFont.setFontHeightInPoints((short)22);

        /**
         * 单元格定义”
         */
        CellStyle titleStyle = workbook.createCellStyle();

        titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        titleStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        titleStyle.setFont(tileFont);


        for (int i = 0;i<strArray.length;i++){
            cell = row.createCell((short) i );
            cell.setCellValue(strArray[i]);
            cell.setCellStyle(style);


//            cell1 = row1.createCell((short)i);
//            cell.setCellValue(strArray[i]);
//            cell.setCellStyle(style);
        }
        for (int i = 0;i<strArray.length;i++){
            cell = row.createCell((short) i );
            cell.setCellValue(strArray[i]);
            cell.setCellStyle(style);
//            cell1 = row1.createCell((short) i );
//            cell1.setCellValue(strArray[i]);
//            cell1.setCellStyle(style);
        }
        int i = 0;
        for (String str:map.keySet()){
            row = sheet1.createRow((int)i+1);
//            row1 = sheet2.createRow((int)i+1);
            List<String> list = map.get(str);

            //第四步，创建单元格，并设置值
            for (int j = 0;j<strArray.length;j++){
                row.createCell((short) j).setCellValue(list.get(j));
//                row1.createCell((short) j).setCellValue(list.get(j));
            }

            //第六步，将文件存在指定位置：
            try {
                FileOutputStream fout = new FileOutputStream("E:/A徐慎/球员记录表格.xlsx");
                System.out.println("已经导出一张表格里面两个sheet表");
                wb.write(fout);
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
