package common.ExcelpoiDrop2;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Description 数据集合均用
 * @Author XuShen
 * @Date 2022/11/10 13:55
 */
public class PoiUtilsList {
    /**
     * @throws IOException
     * @Title: createExcelTemplate
     * @Description: 生成Excel导入模板
     * @param @param fileName  Excel文件名称
     * @param @param handers   Excel列标题(数组)
     * @param @param downData  下拉框数据(数组)
     * @param @param downRows  下拉列的序号(数组,序号从0开始)
     * @param areaFatherNameArr  一级数据
     * @param areaFatherNameArrs 所有有子区域的父标题
     * @param areaMap			子区域
     * @param number			联动级数
     * @return void
     * @throws
     */
    public static Integer createExcelTemplateByGanged(HttpServletResponse response, String fileName, List<String> handers,
                                                   List<List<String>> downData, List<Integer> downRows, String text, List<Integer> listred, List<String> areaFatherNameArr, List<String> areaFatherNameArrs, Map<String, List<String>> areaMap, int number){
        List<String> correctNames = new ArrayList<>();
        XSSFWorkbook wb = new XSSFWorkbook();
        try {
            XSSFSheet sheet = wb.createSheet("Sheet0");
            XSSFRow head0 = sheet.createRow(0);
            head0.setHeight((short) 1500);
            XSSFFont font = wb.createFont();
            font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            font.setBold(true);
            XSSFCellStyle style = wb.createCellStyle();
            style.setFont(font);
            style.setWrapText(true);
            for(int i = 0;i < handers.size();i++){
                XSSFCell cell = head0.createCell(i);
                if(i==0) {
                    cell.setCellStyle(style);
                    cell.setCellValue(new XSSFRichTextString(text));
                }
            }
            Integer num = handers.size() - 1;
            if(num<3) {
                num=4;
            }
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, num));
            XSSFCellStyle style2 = wb.createCellStyle();
            XSSFFont font2 = wb.createFont();
            font2.setBold(true);
            style2.setAlignment(HorizontalAlignment.CENTER);
            style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style2.setFillForegroundColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            style2.setFont(font2);
            XSSFCellStyle style3 = wb.createCellStyle();
            style3.setAlignment(HorizontalAlignment.CENTER);
            style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style3.setFillForegroundColor(HSSFColor.HSSFColorPredefined.LIGHT_GREEN.getIndex());
            // 设置头标签
            XSSFRow head = sheet.createRow(1);
            for(int i = 0;i < handers.size();i++){
                sheet.setColumnWidth(i, 5000);
                XSSFCell cell = head.createCell(i);
                cell.setCellValue(handers.get(i));
                if(listred.contains(i)) {
                    cell.setCellStyle(style2);
                }else {
                    cell.setCellStyle(style3);
                }
            }

            //创建一个专门用来存放地区信息的隐藏sheet页
            //因此也不能在现实页之前创建，否则无法隐藏。
            Sheet hideSheet = wb.createSheet("sheet1");
            //这一行作用是将此sheet隐藏，功能未完成时注释此行,可以查看隐藏sheet中信息是否正确
            wb.setSheetHidden(wb.getSheetIndex(hideSheet), true);

            int rowId = 0;
            // 设置第一行，存省的信息
            Row provinceRow = hideSheet.createRow(rowId++);
            provinceRow.createCell(0).setCellValue("schoolMap");
            for(int i = 0; i < handers.size(); i ++){
                Cell provinceCell = provinceRow.createCell(i + 1);
                provinceCell.setCellValue(handers.get(i));
            }
            // 将具体的数据写入到每一行中，行开头为父级区域，后面是子区域。
            for(int i = 0;i < areaFatherNameArrs.size();i++){
                String key = areaFatherNameArrs.get(i);
                List<String> son = areaMap.get(key);
                Row row = hideSheet.createRow(rowId++);
                row.createCell(0).setCellValue(key);
                for(int j = 0; j < son.size(); j ++){
                    Cell cell = row.createCell(j + 1);
                    cell.setCellValue(son.get(j));
                }
                // 添加名称管理器
                String range = getRange(1, rowId, son.size());
                Name name = wb.createName();
                //key不可重复
                try {
                    name.setNameName(key);
                    correctNames.add(key);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String formula = "sheet1!" + range;
//                String formula = "sheet1" + range;
                name.setRefersToFormula(formula);
            }
            XSSFDataValidationHelper dvHelpers = new XSSFDataValidationHelper((XSSFSheet)sheet);
            // 省规则
            DataValidationConstraint provConstraint = dvHelpers.createExplicitListConstraint(areaFatherNameArr.toArray(new String[0]));
            // 四个参数分别是：起始行、终止行、起始列、终止列
            CellRangeAddressList provRangeAddressList = new CellRangeAddressList(2, 20000, 0, 0);
            DataValidation provinceDataValidation = dvHelpers.createValidation(provConstraint, provRangeAddressList);
            //验证
            provinceDataValidation.createErrorBox("error", "请选择正确的数据");
            provinceDataValidation.setShowErrorBox(true);
            provinceDataValidation.setSuppressDropDownArrow(true);
            sheet.addValidationData(provinceDataValidation);
            //对前1000行设置有效性
            for(int i = 2;i < 1000;i++){
                for(int j=0;j<number;j++) {
                    setDataValidation(((char)(65+j)) ,sheet,i,2 + j);
                }
            }
            if(downRows!=null&&downRows.size()>0) {
                for(int i=0;i<downRows.size();i++) {
                    Integer firstcol=downRows.get(i);
                    List<String> textList=downData.get(i);
                    XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
                    XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint)dvHelper.createExplicitListConstraint(textList.toArray(new String[0]));
                    CellRangeAddressList addressList = null;
                    XSSFDataValidation validation = null;

                    addressList = new CellRangeAddressList(2,20000,firstcol,firstcol);
                    validation = (XSSFDataValidation)dvHelper.createValidation(dvConstraint, addressList);

                    validation.setSuppressDropDownArrow(true);
                    validation.setShowErrorBox(true);
                    sheet.addValidationData(validation);
                }
            }
        } finally {
            if (Objects.equals(areaFatherNameArrs.size(),correctNames.size())){
                File file = new File("E:\\A徐慎\\测试文件夹\\三级联动\\" + fileName + ".xlsx");
                System.out.println("file.getPath() = " + file.getPath());
                if (file.exists()){
                    file.delete();
                }
                try {
                    file.createNewFile();
                    wb.write(new FileOutputStream(file));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return 1;
            }else{
                return -1;
            }
        }
//        String fileNameURL = java.net.URLEncoder.encode(fileName+".xlsx", "UTF-8");
//        response.setContentType("application/vnd.ms-excel;charset=utf-8");
//        response.setHeader("content-disposition", "attachment;filename="+fileNameURL+";"+"filename*=utf-8''"+fileNameURL);
//        response.flushBuffer();
//        response.setCharacterEncoding("UTF-8");
//        OutputStream outputStream = response.getOutputStream();
//        wb.write(response.getOutputStream());
//        wb.close();
//        outputStream.flush();
//        outputStream.close();
    }

    /**
     * 跨行操作实现级联操作
     * @param response
     * @param fileName
     * @param handers 业务表格数据页的表头
     * @param downData
     * @param downRows
     * @param text
     * @param listred
     * @param areaFatherNameArr
     * @param areaFatherNameArrs
     * @param areaMap
     * @param number
     * @return
     */
    public static Integer createExcelTemplateByGangedKHCZ(HttpServletResponse response, String fileName, List<String> handers,
                                                      List<List<String>> downData, List<Integer> downRows, String text, List<Integer> listred, List<String> areaFatherNameArr, List<String> areaFatherNameArrs, Map<String, List<String>> areaMap, int number){
        List<String> correctNames = new ArrayList<>();
        XSSFWorkbook wb = new XSSFWorkbook();
        try {
            XSSFSheet sheet = wb.createSheet("Sheet0");
            //创建第一行 head0，写标题数据         级别	项目大类	项目类型
            XSSFRow head0 = sheet.createRow(0);
            head0.setHeight((short) 1500);
            XSSFFont font = wb.createFont();
            font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            font.setBold(true);
            XSSFCellStyle style = wb.createCellStyle();
            style.setFont(font);
            style.setWrapText(true);
            //写入业务表页面的表头数据
            for(int i = 0;i < handers.size();i++){
                XSSFCell cell = head0.createCell(i);
                if(i==0) {
                    cell.setCellStyle(style);
                    cell.setCellValue(new XSSFRichTextString(text));
                }
            }
            Integer num = handers.size() - 1;
            if(num < 3) {
                num = 4;
            }
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, num));
            XSSFCellStyle style2 = wb.createCellStyle();
            XSSFFont font2 = wb.createFont();
            font2.setBold(true);
            style2.setAlignment(HorizontalAlignment.CENTER);
            style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style2.setFillForegroundColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            style2.setFont(font2);
            XSSFCellStyle style3 = wb.createCellStyle();
            style3.setAlignment(HorizontalAlignment.CENTER);
            style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style3.setFillForegroundColor(HSSFColor.HSSFColorPredefined.LIGHT_GREEN.getIndex());
            // 写入表头数据信息
            XSSFRow head = sheet.createRow(1);
            for(int i = 0;i < handers.size();i++){
                sheet.setColumnWidth(i, 5000);
                XSSFCell cell = head.createCell(i);
                cell.setCellValue(handers.get(i));
                if(listred.contains(i)) {
                    cell.setCellStyle(style2);
                }else {
                    cell.setCellStyle(style3);
                }
            }

            //创建一个专门用来存放地区信息的隐藏sheet页
            //因此也不能在现实页之前创建，否则无法隐藏。
            Sheet hideSheet = wb.createSheet("sheet1");
            //这一行作用是将此sheet隐藏，功能未完成时注释此行,可以查看隐藏sheet中信息是否正确
            wb.setSheetHidden(wb.getSheetIndex(hideSheet), true);

            int rowId = 0;
            // 设置第一行，存省的信息
            Row provinceRow = hideSheet.createRow(rowId++);
            provinceRow.createCell(0).setCellValue("schoolMap");
            //写入隐藏的数据页的数据处理
            for(int i = 0; i < handers.size(); i ++){
                Cell provinceCell = provinceRow.createCell(i + 1);
                provinceCell.setCellValue(handers.get(i));
            }
            // 将具体的数据写入到每一行中，行开头为父级区域，后面是子区域。
            for(int i = 0;i < areaFatherNameArrs.size();i++){
                String key = areaFatherNameArrs.get(i);
                List<String> son = areaMap.get(key);
                Row row = hideSheet.createRow(rowId++);
                row.createCell(0).setCellValue(key);
                for(int j = 0; j < son.size(); j ++){
                    Cell cell = row.createCell(j + 1 );
                    cell.setCellValue(son.get(j));
                }
                // 添加名称管理器
                String range = getRange(1, rowId, son.size());
                Name name = wb.createName();
                //key不可重复
                try {
                    name.setNameName(key);
                    correctNames.add(key);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String formula = "sheet1!" + range;
//                String formula = "sheet1" + range;
                name.setRefersToFormula(formula);
            }
            XSSFDataValidationHelper dvHelpers = new XSSFDataValidationHelper((XSSFSheet)sheet);
            // 省规则
            DataValidationConstraint provConstraint = dvHelpers.createExplicitListConstraint(areaFatherNameArr.toArray(new String[0]));
            // 四个参数分别是：起始行、终止行、起始列、终止列
            CellRangeAddressList provRangeAddressList = new CellRangeAddressList(2, 20000, 0, 0);
            DataValidation provinceDataValidation = dvHelpers.createValidation(provConstraint, provRangeAddressList);
            //验证
            provinceDataValidation.createErrorBox("error", "请选择正确的数据");
            provinceDataValidation.setShowErrorBox(true);
            provinceDataValidation.setSuppressDropDownArrow(true);
            sheet.addValidationData(provinceDataValidation);
            //对前1000行设置有效性
            for(int i = 2;i < 1000;i++){
                for(int j=0;j<number;j++) {
                    setDataValidation(((char)(65+j)) ,sheet,i,2 + j);
                }
            }
            if(downRows!=null&&downRows.size()>0) {
                for(int i=0;i<downRows.size();i++) {
                    Integer firstcol=downRows.get(i);
                    List<String> textList=downData.get(i);
                    XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
                    XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint)dvHelper.createExplicitListConstraint(textList.toArray(new String[0]));
                    CellRangeAddressList addressList = null;
                    XSSFDataValidation validation = null;

                    addressList = new CellRangeAddressList(2,20000,firstcol,firstcol);
                    validation = (XSSFDataValidation)dvHelper.createValidation(dvConstraint, addressList);

                    validation.setSuppressDropDownArrow(true);
                    validation.setShowErrorBox(true);
                    sheet.addValidationData(validation);
                }
            }
        } finally {
            if (Objects.equals(areaFatherNameArrs.size(),correctNames.size())){
                File file = new File("E:\\A徐慎\\测试文件夹\\三级联动\\" + fileName + ".xlsx");
                System.out.println("file.getPath() = " + file.getPath());
                if (file.exists()){
                    file.delete();
                }
                try {
                    file.createNewFile();
                    wb.write(new FileOutputStream(file));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return 1;
            }else{
                return -1;
            }
        }
//        String fileNameURL = java.net.URLEncoder.encode(fileName+".xlsx", "UTF-8");
//        response.setContentType("application/vnd.ms-excel;charset=utf-8");
//        response.setHeader("content-disposition", "attachment;filename="+fileNameURL+";"+"filename*=utf-8''"+fileNameURL);
//        response.flushBuffer();
//        response.setCharacterEncoding("UTF-8");
//        OutputStream outputStream = response.getOutputStream();
//        wb.write(response.getOutputStream());
//        wb.close();
//        outputStream.flush();
//        outputStream.close();
    }

    /**
     * 设置有效性
     * @param offset 主影响单元格所在列，即此单元格由哪个单元格影响联动
     * @param sheet
     * @param rowNum 行数
     * @param colNum 列数
     */
    public static void setDataValidation(char offset,XSSFSheet sheet, int rowNum,int colNum) {
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        DataValidation data_validation_list;
        data_validation_list = getDataValidationByFormula(
                "INDIRECT($" + offset + (rowNum) + ")", rowNum, colNum,dvHelper);
        sheet.addValidationData(data_validation_list);
    }

    /**
     * 加载下拉列表内容
     * @param formulaString
     * @param naturalRowIndex
     * @param naturalColumnIndex
     * @param dvHelper
     * @return
     */
    private static  DataValidation getDataValidationByFormula(
            String formulaString, int naturalRowIndex, int naturalColumnIndex,XSSFDataValidationHelper dvHelper) {
        // 加载下拉列表内容
        // 举例：若formulaString = "INDIRECT($A$2)" 表示规则数据会从名称管理器中获取key与单元格 A2 值相同的数据，
        //如果A2是江苏省，那么此处就是江苏省下的市信息。
        XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper.createFormulaListConstraint(formulaString);
        // 设置数据有效性加载在哪个单元格上。
        // 四个参数分别是：起始行、终止行、起始列、终止列
        int firstRow = naturalRowIndex -1;
        int lastRow = naturalRowIndex - 1;
        int firstCol = naturalColumnIndex - 1;
        int lastCol = naturalColumnIndex - 1;
        CellRangeAddressList regions = new CellRangeAddressList(firstRow,
                lastRow, firstCol, lastCol);
        // 数据有效性对象
        // 绑定
        XSSFDataValidation data_validation_list = (XSSFDataValidation) dvHelper.createValidation(dvConstraint, regions);
        data_validation_list.setEmptyCellAllowed(false);
        if (data_validation_list instanceof XSSFDataValidation) {
            data_validation_list.setSuppressDropDownArrow(true);
            data_validation_list.setShowErrorBox(true);
        } else {
            data_validation_list.setSuppressDropDownArrow(false);
        }
        // 设置输入信息提示信息
        data_validation_list.createPromptBox("下拉选择提示", "请使用下拉方式选择合适的值！");
        // 设置输入错误提示信息
        //data_validation_list.createErrorBox("选择错误提示", "你输入的值未在备选列表中，请下拉选择合适的值！");
        return data_validation_list;
    }

    /**
     *  计算formula
     * @param offset 偏移量，如果给0，表示从A列开始，1，就是从B列
     * @param rowId 第几行
     * @param colCount 一共多少列
     * @return 如果给入参 1,1,10. 表示从B1-K1。最终返回 $B$1:$K$1
     *
     */
    public static String getRange(int offset, int rowId, int colCount) {
        char start = (char)('A' + offset);
        if (colCount <= 25) {
            char end = (char)(start + colCount - 1);
            return "$" + start + "$" + rowId + ":$" + end + "$" + rowId;
        } else {
            char endPrefix = 'A';
            char endSuffix = 'A';
            if ((colCount - 25) / 26 == 0 || colCount == 51) {// 26-51之间，包括边界（仅两次字母表计算）
                if ((colCount - 25) % 26 == 0) {// 边界值
                    endSuffix = (char)('A' + 25);
                } else {
                    endSuffix = (char)('A' + (colCount - 25) % 26 - 1);
                }
            } else {// 51以上
                if ((colCount - 25) % 26 == 0) {
                    endSuffix = (char)('A' + 25);
                    endPrefix = (char)(endPrefix + (colCount - 25) / 26 - 1);
                } else {
                    endSuffix = (char)('A' + (colCount - 25) % 26 - 1);
                    endPrefix = (char)(endPrefix + (colCount - 25) / 26);
                }
            }
            return "$" + start + "$" + rowId + ":$" + endPrefix + endSuffix + "$" + rowId;
        }
    }

}
