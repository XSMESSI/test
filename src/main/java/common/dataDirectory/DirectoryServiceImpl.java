package common.dataDirectory;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import common.Excel.ExcelModel.LoggerUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 数据字典导出的实现逻辑层
 * @Author XuShen
 * @Date 2022/8/23 11:14
 */
@Service
public class DirectoryServiceImpl implements DirectoryService {

    @Resource
    private DirectoryDao directoryDao;

    @Override
    public void exportTableDirectory(HttpServletRequest request, HttpServletResponse response, String dbName) {
        String fileName = null;
        SXSSFWorkbook wb = null;
        try {
            fileName = "数据字典文件名";
            wb = new SXSSFWorkbook();
            Sheet sheet = wb.createSheet("数据字典");
            Map<String,Object> styleMap = createStyle(wb);
            //正常表头
            XSSFCellStyle style = (XSSFCellStyle) styleMap.get("style");
            XSSFCellStyle noNameStyle = (XSSFCellStyle) styleMap.get("noNameStyle");
            XSSFCellStyle noDataStyle = (XSSFCellStyle) styleMap.get("noDataStyle");
            //数据处理
            List<DataDirectory> data = directoryDao.getAllTableInfo(dbName);
            List<DataDirectory> tbComment = directoryDao.getTableCommoent(dbName);
            if(CollectionUtils.isNotEmpty(data) &&CollectionUtils.isNotEmpty(tbComment)){
                data.forEach(o->{
                    for (DataDirectory tbC : tbComment) {
                        if (o.getTABLENAME().equals(tbC.getTABLENAME())){
                            o.setTABLECOMMENT(tbC.getTABLECOMMENT());
                            o.setTABLEROWS(tbC.getTABLEROWS());
                        }
                    }
                });
                Map<String,List<DataDirectory>> map = data.stream().collect(Collectors.groupingBy(DataDirectory::getTABLENAME));
                List<String> titles = Arrays.asList("表名","列名","类型","默认值","允许为空","数据类型","字符最大长度","数字精度","小数位数","字段说明");
                Integer count = 0;
                for (String table : map.keySet()) {
                    List<DataDirectory> list = map.get(table);
                    Row rowTC = sheet.createRow(count);
                    Cell cellTC = rowTC.createCell(0);
                    if (StringUtils.isNotEmpty(list.get(0).getTABLECOMMENT())){
                        cellTC.setCellValue(list.get(0).getTABLECOMMENT());
                    }else {
                        cellTC.setCellStyle(noNameStyle);
                        cellTC.setCellValue("*暂未设置表名*");
                    }
                    count = count + 1;
                    Row row = sheet.createRow(count);
                    for (int i = 0; i < titles.size(); i++) {
                        Cell cell = row.createCell(i);
                        cell.setCellStyle(style);
                        //判断表中是否有数据的时候进行区分
//                    if (Objects.nonNull(list.get(0).getTABLEROWS()) && !Objects.equals(list.get(0).getTABLEROWS(), BigInteger.ZERO)){
//                        cell.setCellStyle(style);
//                    }else{
//                        cell.setCellStyle(noDataStyle);
//                    }
                        cell.setCellValue(titles.get(i));
                    }
                    for (int i = 0; i < list.size(); i++) {
                        DataDirectory temp = list.get(i);
                        Row dataRow = sheet.createRow(count + i +1);
                        Cell cell0 = dataRow.createCell(0);
                        cell0.setCellValue(temp.getTABLENAME());
                        Cell cell1 = dataRow.createCell(1);
                        cell1.setCellValue(temp.getCOLUMNNAME());
                        Cell cell2 = dataRow.createCell(2);
                        cell2.setCellValue(temp.getCOLUMNTYPE());
                        Cell cell3 = dataRow.createCell(3);
                        cell3.setCellValue(temp.getCOLUMNDEFAULT());
                        Cell cell4 = dataRow.createCell(4);
                        cell4.setCellValue(temp.getISNULLABLE());
                        Cell cell5 = dataRow.createCell(5);
                        cell5.setCellValue(temp.getDATATYPE());
                        Cell cell6 = dataRow.createCell(6);
                        cell6.setCellValue(temp.getCHARACTERMAXIMUMLENGTH());
                        Cell cell7 = dataRow.createCell(7);
                        cell7.setCellValue(temp.getNUMERICPRECISION());
                        Cell cell8 = dataRow.createCell(8);
                        cell8.setCellValue(temp.getNUMERICSCALE());
                        Cell cell9 = dataRow.createCell(9);
                        cell9.setCellValue(temp.getCOLUMNCOMMENT());
                    }
                    count = count + list.size() + 2;
                }
            }
        } catch (Exception e) {
            LoggerUtil.log(DirectoryServiceImpl.class,"数据填充出现异常",e);
        }
        OutputStream fout = null;
        try {
            fout = response.getOutputStream();
            response.setContentType("application/vnd.ms-excel");
            String userAgent = request.getHeader("User-Agent");
            // 针对IE或者以IE为内核的浏览器：
            if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                response.setHeader("Content-disposition",
                        "attachment; filename=" + java.net.URLEncoder.encode(fileName, "UTF-8") + ".xlsx");
            } else {
                // 非IE浏览器的处理：
                response.setHeader("Content-disposition", "attachment; filename="
                        + new String(fileName.getBytes("utf-8"), "ISO8859-1") + ".xlsx");
            }
            wb.write(fout);
        } catch (IOException e) {
            LoggerUtil.log(DirectoryServiceImpl.class,"导出数据字典文件出现异常",e);
        } finally {
            IOUtils.closeQuietly(fout);
            IOUtils.closeQuietly(wb);
        }
    }

    /**
     * 创建文件样式
     * @param wb
     * @return
     */
    private Map<String,Object> createStyle(SXSSFWorkbook wb) {
        Map<String,Object> map = new HashMap<>();
        XSSFCellStyle style = (XSSFCellStyle) wb.createCellStyle();
        //设置字体样式
        Font titleFont = wb.createFont();
        titleFont.setBold(true);
        titleFont.setFontName("宋体");
        titleFont.setColor(HSSFFont.COLOR_NORMAL);
        titleFont.setFontHeightInPoints((short) 14);
        //边框
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        //居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //背景色
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        XSSFColor color = new XSSFColor(new java.awt.Color(0, 238, 255));
        style.setFillForegroundColor(color);
        //标题字体
        style.setFont(titleFont);

        //未设置表名的表格样式
        Font noNameFont = wb.createFont();
        noNameFont.setBold(true);
        noNameFont.setFontName("宋体");
        noNameFont.setColor(HSSFFont.COLOR_RED);
        noNameFont.setFontHeightInPoints((short)10);
        XSSFCellStyle noNameStyle = (XSSFCellStyle) wb.createCellStyle();
        noNameStyle.cloneStyleFrom(style);
        noNameStyle.setFont(noNameFont);
        noNameStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        XSSFColor noNameColor = new XSSFColor(new java.awt.Color(170, 85, 136));
        noNameStyle.setFillForegroundColor(noNameColor);

        //创建没有数据的表格表头样式
        XSSFCellStyle noDataStyle = (XSSFCellStyle) wb.createCellStyle();
        noDataStyle.cloneStyleFrom(style);
        XSSFColor noDataColor = new XSSFColor(new java.awt.Color(181, 107, 117));
        noDataStyle.setFillForegroundColor(noDataColor);


        map.put("style",style);
        map.put("noNameStyle",noNameStyle);
        map.put("noDataStyle",noDataStyle);
        return map;
    }
}
