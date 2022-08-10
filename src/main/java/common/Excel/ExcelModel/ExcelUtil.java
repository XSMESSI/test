package common.Excel.ExcelModel;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * @Description EXCEL工具类
 * @Author XuShen
 * @Date 2022/8/8 14:49
 */
public class ExcelUtil {

    /**
     * 判断excel版本
     * @param fileName
     * @return
     */
    public static boolean judgeExcelEdition(String fileName){
        if (fileName.matches("^.+\\.(?i)(xls)$")){
            return false;
        }else{
            return true;
        }
    }

    /**
     * 导出相关文件模板 仅限于一个sheet页
     * @param request
     * @param response
     * @param param
     * @return
     */
    public static Integer exportTemplate(HttpServletRequest request, HttpServletResponse response,FileParam param){
        SXSSFWorkbook wb;
        try {
            //创建一个workbook,对应一个Excel文件
            wb = new SXSSFWorkbook();
            //设置样式
            CellStyle style = wb.createCellStyle();
            //设置字体样式
            Font titleFont = wb.createFont();
            titleFont.setBold(true);
            titleFont.setFontName("宋体");
            titleFont.setColor(HSSFFont.COLOR_NORMAL);
            titleFont.setFontHeightInPoints((short) 12);
            //边框
            style.setBorderTop(BorderStyle.THIN);
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderBottom(BorderStyle.THIN);
            //居中
            style.setAlignment(HorizontalAlignment.CENTER);
            //背景色
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//            style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
            //标题字体
            style.setFont(titleFont);
            //创建sheet页
            SXSSFSheet sheet = wb.createSheet(param.getSheetName());
            Row row = sheet.createRow(0);
            List<String> heads = param.getHeads();
            if (CollectionUtils.isNotEmpty(heads)){
                for (int i = 0; i < heads.size(); i++) {
                    Cell cell = row.createCell(i);
                    cell.setCellStyle(style);
                    cell.setCellValue(heads.get(i));
                    sheet.trackAllColumnsForAutoSizing();
                    sheet.autoSizeColumn(i);
                }
            }
        } catch (Exception e) {
            LoggerUtil.log(ExcelUtil.class,"导出" + param.getFileName() + "模板写入标题出现异常",e);
            return -1;
        }
        OutputStream fout = null;
        try {
            fout = response.getOutputStream();
            response.setContentType("application/vnd.ms-excel");
            String userAgent = request.getHeader("User-Agent");
            // 针对IE或者以IE为内核的浏览器：
            if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                response.setHeader("Content-disposition",
                        "attachment; filename=" + java.net.URLEncoder.encode(param.getFileName(), "UTF-8") + ".xlsx");
            } else {
                // 非IE浏览器的处理：
                response.setHeader("Content-disposition", "attachment; filename="
                        + new String(param.getFileName().getBytes("utf-8"), "ISO8859-1") + ".xlsx");
            }
            wb.write(fout);
        } catch (IOException e) {
            LoggerUtil.log(ExcelUtil.class,"导出模板下载文件出现异常",e);
            return -1;
        } finally {
            if (fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    LoggerUtil.log(ExcelUtil.class,"导出模板关闭数据流出现异常",e);
                }
            }
        }
        return 1;
    }




    /**
     * 读取excel文件数据
     * @param file 文件
     * @param heads excel文件标题
     * @param columns 文件标题对应字段
     * @return
     * @throws Exception
     */
    public static List<Map<String,String>> readData(MultipartFile file, List<String> heads, List<String> columns){
        List<Map<String,String>> rows = null;
        Workbook workbook = null;
        try {
            rows = new ArrayList<>();
            //获取文件名称
            String fileName = file.getOriginalFilename();
            //获取输入流
            InputStream in = file.getInputStream();
            //判断excel版本
            workbook = null;
            if (judgeExcelEdition(fileName)){
                workbook = new XSSFWorkbook(in);
            }else{
                workbook = new HSSFWorkbook(in);
            }
            //获取第一张工作表
            Sheet sheet = workbook.getSheetAt(0);
            //获取表头（第一行）
            Row row0 = sheet.getRow(0);
            if (heads.size() != row0.getPhysicalNumberOfCells()){
                throw new Exception("模板错误!!");
            }

            for (int i = 0; i < heads.size(); i++) {
                if (!heads.get(i).equals(String.valueOf(row0.getCell(i)))){
                    throw new Exception("模板错误!!");
                }
            }

            //从第二行开始获取
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                //获取每一行
                Row sheetRow= sheet.getRow(i);
                Map<String,String> m = new HashMap<>();
                for (int j = 0; j < columns.size(); j++) {
                    if (sheetRow.getCell(j) != null){
                        sheetRow.getCell(j).setCellType(CellType.STRING);
                        m.put(columns.get(j),String.valueOf(sheetRow.getCell(j)));
                    }
                }
                rows.add(m);
            }
        } catch (Exception e) {
            LoggerUtil.log(ExcelUtil.class,"读取文件数据出现异常",e);
        } finally {
            if (workbook != null){
                try {
                    workbook.close();
                } catch (IOException e) {
                    LoggerUtil.log(ExcelUtil.class,"读取表格数据关闭数据流出现异常",e);
                }
            }
        }
        return rows;
    }

    /**
     * 导出数据
     * @param request
     * @param response
     * @param param
     * 提供数据：
     * String fileName (文件名称)
     * String sheetName (sheet页名称)
     * String[] heads (文件表头)
     * List<Map<Integer,String>> dataMap (数据集合)
     * @return
     */
    public static Integer exportData(HttpServletRequest request, HttpServletResponse response, FileParam param){
        SXSSFWorkbook wb;
        try {
            //创建一个workbook,对应一个Excel文件
            wb = new SXSSFWorkbook();
            //设置样式
            CellStyle titlestyle = wb.createCellStyle();
            //设置字体样式
            Font titleFont = wb.createFont();
            titleFont.setBold(true);
            titleFont.setFontName("宋体");
            titleFont.setColor(HSSFFont.COLOR_NORMAL);
            titleFont.setFontHeightInPoints((short) 12);

            //设置错误字体样式
            Font errorFont = wb.createFont();
            errorFont.setBold(true);
            errorFont.setFontName("宋体");
            errorFont.setColor(HSSFFont.COLOR_RED);
            errorFont.setFontHeightInPoints((short) 12);
            //边框
            titlestyle.setBorderTop(BorderStyle.THIN);
            titlestyle.setBorderLeft(BorderStyle.THIN);
            titlestyle.setBorderRight(BorderStyle.THIN);
            titlestyle.setBorderBottom(BorderStyle.THIN);
            //居中
            titlestyle.setAlignment(HorizontalAlignment.CENTER);
            //背景色
            titlestyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//            titlestyle.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
            //标题字体
            titlestyle.setFont(titleFont);

            //错误单元格样式
            CellStyle errorStyle = wb.createCellStyle();
            errorStyle.cloneStyleFrom(titlestyle);
            errorStyle.setFont(errorFont);

            //创建sheet页
            SXSSFSheet sheet = wb.createSheet(param.getSheetName());
            List<String> heads = param.getHeads();
            Row titleRow = sheet.createRow(0);
            for (int i = 0; i < heads.size(); i++) {
                Cell titleCell = titleRow.createCell(i);
                if (Objects.nonNull(heads.get(i)) && heads.get(i).contains("错误信息!!!")){
                    titleCell.setCellStyle(errorStyle);
                }else{
                    titleCell.setCellStyle(titlestyle);
                }
                titleCell.setCellValue(heads.get(i));
                sheet.trackAllColumnsForAutoSizing();
                sheet.autoSizeColumn(i);
            }

            int headLength = heads.size();
            List<Map<Integer,String>> maps = param.getDataMap();
            for (int i = 0; i < maps.size(); i++) {
                Row dataRow = sheet.createRow(i + 1);
                Map<Integer,String> map = maps.get(i);
                for (int j = 0; j < headLength; j++) {
                    Cell dataCell = dataRow.createCell(j);
                    dataCell.setCellValue(map.get(j));
                    sheet.trackAllColumnsForAutoSizing();
                    sheet.autoSizeColumn(j);
                }
            }
        } catch (Exception e) {
            LoggerUtil.log(ExcelUtil.class,"写入数据出现异常",e);
            return -2;
        }
        OutputStream fout = null;
        try {
            fout = response.getOutputStream();
            response.setContentType("application/vnd.ms-excel");
            String userAgent = request.getHeader("User-Agent");
            // 针对IE或者以IE为内核的浏览器：
            if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                response.setHeader("Content-disposition",
                        "attachment; filename=" + java.net.URLEncoder.encode(param.getFileName(), "UTF-8") + ".xlsx");
            } else {
                // 非IE浏览器的处理：
                response.setHeader("Content-disposition", "attachment; filename="
                        + new String(param.getFileName().getBytes("utf-8"), "ISO8859-1") + ".xlsx");
            }
            wb.write(fout);
        } catch (IOException e) {
            LoggerUtil.log(ExcelUtil.class,"下载文件出现异常",e);
            return -1;
        } finally {
            if (fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    LoggerUtil.log(ExcelUtil.class,"导出文件关闭数据流出现异常",e);
                }
            }
        }
        return 1;
    }
}
