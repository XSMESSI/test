package common.Excel.DateExam;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.util.CellRangeAddressList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 导出的文件设置日期格式
 * @Author XuShen
 * @Date 2022/11/14 11:54
 */
public class testExamDate {

    /**
     * 校验单元格的日期格式的几种方式
     * 1.创建style
     * 2.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("测试文件");
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setDataFormat(wb.createDataFormat().getFormat("yyyy-mm-dd"));
        List<String> str = Arrays.asList("年月日","年月","年月日-时分秒");
        for (int i = 0; i < str.size(); i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(str.get(i));

        }

        for (int i = 1; i < 10; i++) {
            HSSFRow row1 = sheet.createRow(i);
            for (int j = 0; j < 3; j++) {
                HSSFCell cell = row1.createCell(j);
                cell.setCellStyle(style);
            }
        }
//        sheet.addValidationData(getDataValidationByDateYearMonthDay(2,1));
//        sheet.addValidationData(getDataValidationByDateYearMonth(2,2));
//        sheet.addValidationData(getDataValidationByDateYearMonthDayTime(2,3));

        String fileName = "日期格式校验" + System.currentTimeMillis() + ".xlsx";
        File file = new File("E:\\AA公司文档\\测试文档\\日期格式校验\\" + fileName);
        if (file.exists()){
            file.delete();
        }
        file.createNewFile();
        System.out.println("导出文件成功file.getPath() = " + file.getPath());
        wb.write(new FileOutputStream(file));

    }

    /**
     * 配置单元格的日期样式数据
     * @param naturalRowIndex
     * @param naturalColumnIndex
     * @return
     */
    private static DataValidation getDataValidationByDateYearMonthDay(int naturalRowIndex, int naturalColumnIndex) {
        //加载下拉列表内容
        DVConstraint constraint = DVConstraint.createDateConstraint(DVConstraint.OperatorType.BETWEEN, "1900-01-01",
                "5000-01-01", "yyyy-mm-dd");
        //设置数据有效性加载在哪个单元格上。
        //四个参数分别是：起始行、终止行、起始列、终止列
        int firstRow = naturalRowIndex - 1;
        int lastRow = 10000;
        int firstCol = naturalColumnIndex - 1;
        int lastCol = naturalColumnIndex - 1;
        CellRangeAddressList regions = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
        //数据有效性对象
        DataValidation data_validation_list = new HSSFDataValidation(regions, constraint);
        //设置输入信息提示信息
        data_validation_list.createPromptBox("日期格式提示", "请按照'yyyy-mm-dd'格式输入日期值！");
        //设置输入错误提示信息
        data_validation_list.createErrorBox("日期格式错误提示", "你输入的日期格式不符合'yyyy-mm-dd'格式规范，请重新输入！");
        return data_validation_list;
    }

    /**
     * 配置单元格的日期样式数据
     * @param naturalRowIndex
     * @param naturalColumnIndex
     * @return
     */
    private static DataValidation getDataValidationByDateYearMonth(int naturalRowIndex, int naturalColumnIndex) {
        //加载下拉列表内容
        DVConstraint constraint = DVConstraint.createDateConstraint(DVConstraint.OperatorType.BETWEEN, "1900-01",
                "5000-01", "yyyy-mm");
        //设置数据有效性加载在哪个单元格上。
        //四个参数分别是：起始行、终止行、起始列、终止列
        int firstRow = naturalRowIndex - 1;
        int lastRow = 10000;
        int firstCol = naturalColumnIndex - 1;
        int lastCol = naturalColumnIndex - 1;
        CellRangeAddressList regions = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
        //数据有效性对象
        DataValidation data_validation_list = new HSSFDataValidation(regions, constraint);
        //设置输入信息提示信息
        data_validation_list.createPromptBox("日期格式提示", "请按照'yyyy-mm'格式输入日期值！");
        //设置输入错误提示信息
        data_validation_list.createErrorBox("日期格式错误提示", "你输入的日期格式不符合'yyyy-mm'格式规范，请重新输入！");
        return data_validation_list;
    }

    /**
     * 配置单元格的日期样式数据
     * @param naturalRowIndex
     * @param naturalColumnIndex
     * @return
     */
    private static DataValidation getDataValidationByDateYearMonthDayTime(int naturalRowIndex, int naturalColumnIndex) {
        //加载下拉列表内容
        DVConstraint constraint = DVConstraint.createDateConstraint(DVConstraint.OperatorType.BETWEEN, "1900-01-01 00:00:00",
                "5000-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        //设置数据有效性加载在哪个单元格上。
        //四个参数分别是：起始行、终止行、起始列、终止列
        int firstRow = naturalRowIndex - 1;
        int lastRow = 10000;
        int firstCol = naturalColumnIndex - 1;
        int lastCol = naturalColumnIndex - 1;
        CellRangeAddressList regions = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
        //数据有效性对象
        DataValidation data_validation_list = new HSSFDataValidation(regions, constraint);
        //设置输入信息提示信息
        data_validation_list.createPromptBox("日期格式提示", "请按照'yyyy-MM-dd HH:mm:ss'格式输入日期值！");
        //设置输入错误提示信息
        data_validation_list.createErrorBox("日期格式错误提示", "你输入的日期格式不符合'yyyy-MM-dd HH:mm:ss'格式规范，请重新输入！");
        return data_validation_list;
    }
}
