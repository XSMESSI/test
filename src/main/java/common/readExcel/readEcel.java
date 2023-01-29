package common.readExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/7 10:14
 */
public class readEcel {

    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("le\\2022-01\\zl.xls");
        File f = new File("E:\\A徐慎\\测试文件夹\\testFormat.xls");
        Workbook wb = readExcel(new FileInputStream(f),f.getName());
        Row row = null;
        if(wb != null){
            //获取第一个sheet
            Sheet sheet = wb.getSheetAt(0);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取第一行
            row = sheet.getRow(0);
            //获取最大列数
            for (int i = 0; i<rownum; i++) {
                row = sheet.getRow(i);
                for (int j = 0; j < 5; j++) {
                    Cell cell = row.getCell(j);
                    CellType cellType = cell.getCellTypeEnum();
                    int dataFormateId =cell.getCellStyle().getDataFormat();
                    String dataFormateStr =cell.getCellStyle().getDataFormatString();
                    System.out.println("dataFormateId = " + dataFormateId);
                    System.out.println("dataFormateStr = " + dataFormateStr);
                    System.out.println(">>>>>>>>>>>>>");

                }
//                row = sheet.getRow(i);
//
//                String line1 = row.getCell(0).toString();
//                Double x = Double.valueOf(row.getCell(1).toString());
//                Double y = Double.valueOf(row.getCell(2).toString());

            }
        }


    }

    //这个下面是单独函数
    public static Workbook readExcel(InputStream is, String extString){
        Workbook wb = null;
        extString = extString.substring(extString.lastIndexOf("."));
        try {
            if(".xls".equals(extString)){
                return wb = new HSSFWorkbook(is);
            }else if(".xlsx".equals(extString)){
                return wb = new XSSFWorkbook(is);
            }else {
                return wb = null;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }


}
