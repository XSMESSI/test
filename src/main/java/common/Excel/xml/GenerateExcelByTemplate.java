package common.Excel.xml;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/2 9:56
 */

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * 根据xml配置(格式，样式，标题等)
 * 使用jdom读取xml并生成Excle
 * @author Administrator
 *
 */
public class GenerateExcelByTemplate {
    public static void main(String[] args){
        /****读取classpath下的文件*****/
        //根据本类对象获取类加载器
        ClassLoader classLoader = new GenerateExcelByTemplate().getClass().getClassLoader();
        //根据文件名从classpath下获取文件路径 放在class文件夹
        URL pathUrl = classLoader.getResource("excelModel.xml");
        //根据URL路径获取文件对象
        File xmlFile = new File(pathUrl.getFile());
        try {
            //创建Excel
            HSSFWorkbook workbook = new HSSFWorkbook();
            //创建一个sheet页
            HSSFSheet sheet1 = workbook.createSheet("sheet第一页");
            /*****通过jdom解析xml文件,并更具读取配置生成Excle***/
            //获取解析器
            SAXBuilder build = new SAXBuilder();
            //将文件内容读进解析器,生成document对象
            Document document = build.build(xmlFile);
            //获取xml跟节点
            Element root = document.getRootElement();
            //获取excel名称(跟节点的excelName属性)
            String excelName = root.getAttribute("excelName").getValue();
            //设置列的属性和宽度
            Element cloumns = root.getChild("columns");
            //获取子元素
            List<Element> childCloumns = cloumns.getChildren("cloumn");
            //循环设置每个列
            for(int i=0;i<childCloumns.size();i++){
                Element cloumn = childCloumns.get(i);
                //获取每个列的宽度属性(width)
                String width = cloumn.getAttribute("width").getValue();
                //截取，得到单位
                String unit = width.substring(width.length()-2, width.length());
                //将单位清空,得到值
                String num = width.replace(unit, "");
                //根据不同的单位转换成Excel的宽度
                int excelWitdh = 0;
                switch(unit){
                    case "px":
                        excelWitdh = Math.round(Float.parseFloat(num)*37F);
                        break;
                    case "em":
                        excelWitdh = Math.round(Float.parseFloat(num)*267.5F);
                        break;
                }
                //设置列宽
                sheet1.setColumnWidth(i, excelWitdh);
            }

            //设置第一行的标题
            Element title = root.getChild("title");
            //标题内容
            String titleStr = title.getText();
            //合并的行数
            int rowspan = title.getAttribute("rowspan").getIntValue()-1;
            //合并的列数
            int colspan = title.getAttribute("colspan").getIntValue()-1;
            //创建0行
            HSSFRow row0 = sheet1.createRow(0);
            //创建一个cell(单元格)
            HSSFCell titleCell = row0.createCell(0);
            //设置内容
            titleCell.setCellValue(titleStr);
            //设置格式
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            //文字居中
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            //设置字体
            HSSFFont cellFont = workbook.createFont();
            //文字颜色
            cellFont.setColor((short) 20);
            //字体加入到样式中
            cellStyle.setFont(cellFont);
            titleCell.setCellStyle(cellStyle);
            //合并单元格(startY,endY,startX,endX)
            sheet1.addMergedRegion(new CellRangeAddress(0, rowspan, 0, colspan));

            //设置第二行的数据标题
            Element tr = root.getChild("table").getChild("tr");
            List<Element> tds = tr.getChildren("td");
            //创建1行
            HSSFRow row1 = sheet1.createRow(1);
            //设置高度(截取单位并且转换长度)
//          row1.setHeight((short) tr.getAttribute("height").getIntValue());
            for(int i=0;i<tds.size();i++){
                Element td = tds.get(i);
                //创建列
                HSSFCell cell1 = row1.createCell(i);
                //设置内容
                cell1.setCellValue(td.getText());
            }
            //设置样式:循环读取xml配置，就不写了 TODO

            //生成Excel文件
            File excelFile = new File("E:/A徐慎/测试文件夹/file/"+excelName+".xls");
            //创建
            excelFile.createNewFile();
            //将Excel内容写入文件
            FileOutputStream fos = new FileOutputStream(excelFile);
            //开始写
            workbook.write(fos);
            //关闭流
            fos.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

