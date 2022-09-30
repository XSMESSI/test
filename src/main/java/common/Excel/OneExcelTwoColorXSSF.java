package common.Excel;


import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Description XSSFWorkbook
 * @Author XuShen
 * @Date 2022/8/19 15:13
 */
public class OneExcelTwoColorXSSF {
    public static void main( String[] args ) throws IOException {

        XSSFWorkbook wb = new XSSFWorkbook();

        Sheet sheet = wb.createSheet("自定义单元格部分内容颜色");

        Row row  = sheet.createRow(5);

        Cell cell = row.createCell(5);

        CellStyle cellStyle = wb.createCellStyle();

        Font font = wb.createFont();
        font.setBold(true);
        font.setColor(HSSFFont.COLOR_RED);
//        font.setColor(HSSFColor.BLACK.index);

        font.setFontName("宋体");

        font.setFontHeight((short)700);

        Font font2 = wb.createFont();
        font2.setBold(true);

        font2.setColor(HSSFFont.COLOR_NORMAL);
//        font2.setColor(HSSFColor.RED.index);

        font2.setFontName("黑体");

        font2.setFontHeight((short)800);
//        font2.setBoldweight((short)700);

        //设置字体样式
        XSSFFont titleFont = wb.createFont();
        titleFont.setBold(true);
        titleFont.setFontName("宋体");
        titleFont.setColor(HSSFFont.COLOR_NORMAL);
        titleFont.setFontHeightInPoints((short) 14);

        //*必填* 字体样式
        XSSFFont mustFont = wb.createFont();
        mustFont.setBold(true);
        mustFont.setFontName("宋体");
        mustFont.setColor(HSSFFont.COLOR_RED);
        mustFont.setFontHeightInPoints((short)12);
        cellStyle.setFont(font2);

//        cell.setCellStyle(cellStyle);

        String txt = "测试数据*必填*";
        String string = "不使用拼接实现代码";
        CellStyle mustCellStyle = wb.createCellStyle();
        mustCellStyle.setFont(mustFont);


        Row row1 = sheet.createRow(1);
        Cell cell1 = row1.createCell(1);
        cell1.setCellValue(string);
        cell1.setCellStyle(mustCellStyle);

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

//        XSSFRichTextString text = new XSSFRichTextString(txt);
//        if (txt.contains("*必填*")){
//            //黑色
//            text.applyFont(0,txt.indexOf("*必填*")+1,titleFont);
//            //红色
//            text.applyFont(txt.indexOf("*必填*"),txt.length(),mustFont);
//        }

        CreationHelper creationHelper = wb.getCreationHelper();
        XSSFRichTextString descEntry = (XSSFRichTextString) creationHelper.createRichTextString(string);
        descEntry.applyFont(0,2,mustFont);
        cell.setCellValue(descEntry);

//        sheet.autoSizeColumn(5,true);

        File file = new File("E:\\AA公司文档\\测试文档\\XSSF我要变成红色的字体.xls");
        System.out.println("导出成功");
        if(file.exists()){
            file.delete();
        }

        file.createNewFile();

        wb.write(new FileOutputStream( file ));

    }


//    private static void setValidationDate(Workbook wb, Sheet sheet, List<DataValidationCell> dataValidationCellList) {
//        if (dataValidationCellList.isEmpty()) {
//            return;
//        }
//        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
//        int index = 0;
//        Row row;
//        Sheet sheetHidden = wb.createSheet("Sheet2");
//        wb.setSheetHidden(1, true);
//        for (DataValidationCell dataValidationCell : dataValidationCellList) {
//            List<String> dataList = dataValidationCell.getDataList();
//            if (CollectionUtils.isEmpty(dataList)) {
//                continue;
//            }
//            if (dataList.size() <= 5) {
//                sheet.addValidationData(setFewDataValidation(sheet, dataList.toArray(new String[0]),
//                        dataValidationCell.getStartRow(), dataValidationCell.getEndRow(),
//                        dataValidationCell.getStartColumn(), dataValidationCell.getEndColumn())); //超过255个报错
//            } else {
//                //String strFormula = "Sheet2!$A$1:$A$5000" ; //Sheet2第A1到A5000作为下拉列表来源数据
//                String strFormula = "Sheet2!$" + arr[index] + "$1:$" + arr[index] + "$" + dataList.size(); //Sheet2第A1到A5000作为下拉列表来源数据
//                sheet.addValidationData(setMoreDataValidation(wb, sheet, strFormula,
//                        dataValidationCell.getStartRow(), dataValidationCell.getEndRow(),
//                        dataValidationCell.getStartColumn(), dataValidationCell.getEndColumn())); //下拉列表元素很多的情况
//                //2、生成sheet2内容
//                for (int j = 0; j < dataList.size(); j++) {
//                    if (index == 0) { //第1个下拉选项，直接创建行、列
//                        row = sheetHidden.createRow(j); //创建数据行
//                        //      sheetHidden.setColumnWidth(j, 4000); //设置每列的列宽
//                        row.createCell(0).setCellValue(dataList.get(j)); //设置对应单元格的值
//                    } else { //非第1个下拉选项
//                        int rowCount = sheetHidden.getLastRowNum();
//                        if (j <= rowCount) { //前面创建过的行，直接获取行，创建列
//                            //获取行，创建列
//                            sheetHidden.getRow(j).createCell(index).setCellValue(dataList.get(j)); //设置对应单元格的值
//                        } else { //未创建过的行，直接创建行、创建列
//                            //  sheetHidden.setColumnWidth(j, 4000); //设置每列的列宽
//                            //创建行、创建列
//                            sheetHidden.createRow(j).createCell(index).setCellValue(dataList.get(j)); //设置对应单元格的值
//                        }
//                    }
//                }
//                index++;
//            }
//        }
//    }
//
//    private static DataValidation setMoreDataValidation(Workbook wb, Sheet sheet, String strFormula, int startRow, int endRow, int startColumn, int endColumn) {
//    }
//
//    private static DataValidation setFewDataValidation(Sheet sheet, String[] toArray, int startRow, int endRow, int startColumn, int endColumn) {
//    }
}
