package _2022._01_January.test_0128;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

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
        HSSFCell cell;

        HSSFRow[] rows = new HSSFRow[100];
        for (int i= 0;i<rows.length;i++){
            rows[i] = sheet.createRow(i);
        }
        //设置标题字体样式
        HSSFFont tileFont =wb.createFont();
        tileFont.setFontName("宋体");
        tileFont.setFontHeightInPoints((short)16);
        tileFont.setColor(HSSFFont.COLOR_NORMAL);
        tileFont.setBold(true);

        //设置标题单元格样式
        HSSFCellStyle titleStyle = wb.createCellStyle();
        titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        titleStyle.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        titleStyle.setFont(tileFont);
        titleStyle.setWrapText(true);

        //设置标题字体样式
        HSSFFont dataFont =wb.createFont();
        dataFont.setFontName("楷体");
        dataFont.setFontHeightInPoints((short)12);
        dataFont.setColor(HSSFFont.COLOR_NORMAL);

        //设置单元格样式(水平居中，垂直居中，字体样式)
        HSSFCellStyle dataStyle = wb.createCellStyle();
        dataStyle.setAlignment(HorizontalAlignment.CENTER);
        dataStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        dataStyle.setFont(dataFont);
        dataStyle.setWrapText(true);


        String[] strings = {"项目名称","项目级别","申请部门","所属专业","评审类型","评审创建时间","评审专家","评审打分","评审结果","打分时间"};
        String[] data1 = {"校级品牌专业","校级","财务金融学院","动漫制作技术","期中","2022-01-19T10:44:51","徐慎WY","0","未评审","2022-01-17T16:14:39"};
        String[] data2 = {"校级品牌专业","校级","财务金融学院","动漫制作技术","期中","2022-01-19T10:44:51","leoMessi","100","通过","2022-01-17T16:14:39"};
        String[] data3 = {"测试内存占用太高","校级","金融学院","动漫制作技术","期中","2022-01-19T10:44:51","C罗","100","通过","2022-01-17T16:14:39"};
        for (int i = 0;i<strings.length;i++){
            cell = rows[0].createCell(i);
            cell.setCellValue(strings[i]);
            cell.setCellStyle(titleStyle);
        }

//        HSSFRow row1 = sheet.createRow(1);
        for (int i = 0;i<data1.length;i++){
            cell = rows[1].createCell(i);
            cell.setCellValue(data1[i]);
            cell.setCellStyle(dataStyle);
        }

        for (int i = 0;i<data2.length;i++){
            cell = rows[2].createCell(i);
            cell.setCellValue(data2[i]);
            cell.setCellStyle(dataStyle);
        }

        //测试内存过高
        //创建行
        for (int j = 3;j<rows.length;j++){
            for (int i = 0;i<data3.length;i++){
                cell = rows[j].createCell(i);
                cell.setCellValue(data3[i]);
                cell.setCellStyle(dataStyle);
            }
        }

//        CellRangeAddress region = new CellRangeAddress(1,2,0,0);
//        CellRangeAddress region1 = new CellRangeAddress(1,2,1,1);
//        CellRangeAddress region2 = new CellRangeAddress(1,2,2,2);
//        CellRangeAddress region3 = new CellRangeAddress(1,2,3,3);
//        CellRangeAddress region4 = new CellRangeAddress(1,2,4,4);
//        CellRangeAddress region5 = new CellRangeAddress(1,2,5,5);
//        sheet.addMergedRegion(region);
//        sheet.addMergedRegion(region1);
//        sheet.addMergedRegion(region2);
//        sheet.addMergedRegion(region3);
//        sheet.addMergedRegion(region4);
//        sheet.addMergedRegion(region5);

        for (short i = 0;i<strings.length;i++){
            sheet.autoSizeColumn((short)i);
        }

        //输出Excel文件
        FileOutputStream outputStream = new FileOutputStream("E:/A徐慎/测试文件导出/0209测试导出.xlsx");
        log.info(">>>>测试文件已导出>>>>>>");
        wb.write(outputStream);
        outputStream.flush();


        Runtime run = Runtime.getRuntime();
        double total = run.totalMemory();
        double free = run.freeMemory();
        double used = (total - free)/(1024*1024);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("df.format(used) = " + df.format(used));
    }
}
