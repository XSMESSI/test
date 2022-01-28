package common.Excel;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
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
//        wb.
        //第二步，在webbook中加入一个sheet页，对应Excel中的sheet
        HSSFSheet sheet1 = wb.createSheet("sheet1");
        //创建的是sheet1(表名)表格
        HSSFSheet sheet2 = wb.createSheet("sheet2");
        //创建sheet2表格
        sheet1.setDefaultColumnWidth(20);
        //(设置sheet页的列宽)默认列宽
        sheet2.setDefaultColumnWidth(30);
        //sheet2表格的列宽
        //第三步，在sheet表中创建第0行，
        HSSFRow row0 = sheet1.createRow((int)0);
//        //第四步，创建单元格，编辑单元格的格式(在下面进行定义了)
//        HSSFCellStyle style = wb.createCellStyle();
//        //创建一个居中格式:在CSDN上面找到的解决方案
//        style.setAlignment(HorizontalAlignment.CENTER);
        //添加Excel的（表格的格子单元）
        HSSFCell cell;
        /**
         * 设置单元格的样式
         */
        //设置字体样式
        HSSFFont tileFont =wb.createFont();
        tileFont.setFontName("宋体");
        tileFont.setFontHeightInPoints((short)22);
        tileFont.setColor(HSSFFont.COLOR_RED);


        HSSFFont ageFont = wb.createFont();
        ageFont.setColor(HSSFFont.COLOR_RED);

        HSSFCellStyle ageStyle = wb.createCellStyle();
        ageStyle.setFont(ageFont);

        //单元格样式定义
        HSSFCellStyle titleStyle = wb.createCellStyle();
        titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        titleStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        titleStyle.setFont(tileFont);

        /**
         * 定义表头并且插入数据,定义样式
         */
        for (int i = 0;i<strArray.length;i++){
            cell = row0.createCell((short) i );
            cell.setCellValue(strArray[i]);
            cell.setCellStyle(titleStyle);
        }

        int i = 0;
        for (String str:map.keySet()){
            row0 = sheet1.createRow(i+1);
            List<String> list = map.get(str);
            //第四步，创建单元格，并设置值
            for (int j = 0;j<strArray.length;j++){
                cell = row0.createCell((short) j);
                cell.setCellValue(list.get(j));
                if ("34".equals(list.get(j))){
                    cell.setCellStyle(ageStyle);
                }
            }
            //第六步，将文件存在指定位置：
            try {
                FileOutputStream fout = new FileOutputStream("E:/A徐慎/测试文件导出/球员记录表格.xlsx");
                System.out.println("已经插入一条数据到表格里面");
                wb.write(fout);
                fout.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}