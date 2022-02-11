package _2022._02_Feb.test_0211;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/11 18:04
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

/**
 * 导出word
 * @author ygc
 */
public class test_07 {
    public static void main(String[] args) throws IOException {
        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph para;
        XWPFRun run;
        //创建表格
        XWPFTable table  = doc.createTable(8,4);
        table.setCellMargins(3, 5, 3, 5);
//        table.addNewCol();//添加新列
//        table.createRow();//添加新行
        String[] title1 = new String[]{"编号"," ","项目类型"," "};
        String[] title2 = new String[]{"调查日期"," ","建设状态"," "};
        XWPFTableRow row;
        XWPFTableCell cell;
        CTTcPr cellPr;
        for(int j=0;j<8;j++){
            row = table.getRow(j);

            row.setHeight(600);

            //第一行
            for(int i=0;i<title1.length;i++){
                //创建单元格
                cell = row.getCell(i);
                //单元格属性
                cellPr = cell.getCTTc().addNewTcPr();
                //设置宽度
                cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                //垂直居中
                cellPr.addNewVAlign().setVal(STVerticalJc.CENTER);
                //第一个段落
                para = cell.getParagraphs().get(0);
                //设置对齐方式
                para.setAlignment(ParagraphAlignment.CENTER);
                //段落的对齐方式 1左 2中 3右 4往上 左 不可写0和负数
                para.setFontAlignment(2);
                //一个XWPFRun代表具有相同属性的一个区域：一段文本
                run = para.createRun();
                //设置字体
                run.setFontFamily("仿宋");
                //设置字体大小
                run.setFontSize(11);
                if(j==0) {
                    //字体宽
//                    run.setBold(true);
                    run.setText(title1[i]);
                }
            }
            //第二行

            if(j==1){
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(0);
                        cellPr = cell.getCTTc().addNewTcPr();
                        cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                        para = cell.getParagraphs().get(0);
                        para.setAlignment(ParagraphAlignment.CENTER);
                        para.setFontAlignment(2);
                        run = para.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(13);
                        run.setText("扰动类型");
                    }
                    if(y==1) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                    }else {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }


                }

            }
            if(j==2){
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(0);
                        cellPr = cell.getCTTc().addNewTcPr();
                        cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                        para = cell.getParagraphs().get(0);
                        para.setAlignment(ParagraphAlignment.CENTER);
                        para.setFontAlignment(2);
                        run = para.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(13);
                        run.setText("项目名称");
                    }
                    if(y==1) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                    }else {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                }


            }
            for(int i=0;i<title2.length;i++){
                cell = row.getCell(i);
                cellPr = cell.getCTTc().addNewTcPr();
                cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                para = cell.getParagraphs().get(0);
                para.setAlignment(ParagraphAlignment.CENTER);
                para.setFontAlignment(2);
                run = para.createRun();
                run.setFontFamily("仿宋");
                run.setFontSize(13);
                if(j==3) {
                    run.setText(title2[i]);
                }
            }
            if(j==4){
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(0);
                        //单元格属性
                        cellPr = cell.getCTTc().addNewTcPr();
                        //设置宽度
                        cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                        //第一个段落
                        para = cell.getParagraphs().get(0);
                        //设置对齐方式
                        para.setAlignment(ParagraphAlignment.CENTER);
                        //居中
                        para.setFontAlignment(2);
                        run = para.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(13);
                        run.setText("详细地址");
                    }
                    if(y==1) {
                        cell = row.getCell(y);

                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                    }else {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                }

            }
            if(j==5){
                String imgPath="E:\\AA公司文档\\lALPD3lGuGCLG-TNBB3NB2M_1891_1053.png";
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                        List<XWPFParagraph> paragraphs = cell.getParagraphs();

                        XWPFParagraph newPara = paragraphs.get(0);
                        XWPFRun imageCellRunn = newPara.createRun();
                        File image = new File(imgPath);
                        if(!image.exists()){
                            continue;
                        }
                        try (FileInputStream is = new FileInputStream(imgPath)) {
                            imageCellRunn.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, image.getName(), Units.toEMU(180), Units.toEMU(180)); // 200x200 pixels
                        }catch (Exception e){
                            e.printStackTrace();
                        }


                    }
                    if(y==1) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);

                    }
                    if(y==2) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                        cell.setText("（1）照片拍摄位置经纬度:");
                        cellPr = cell.getCTTc().addNewTcPr();
                        //设置宽度
                        cellPr.addNewTcW().setW(BigInteger.valueOf(5000));
                        //第一个段落
                        para = cell.getParagraphs().get(0);

                        //设置对齐方式
                        para.setAlignment(ParagraphAlignment.LEFT);
                        //居左
                        para.setFontAlignment(1);

                        run = para.createRun();
                        run.addBreak();
                        run.addBreak();
                        cell.setText("    经度:");
//            	          run.addBreak();
//             	          run.addBreak();
                        run = para.createRun();
                        run.addBreak();
                        run.addBreak();
                        cell.setText("    经度:");
                        run = para.createRun();
                        run.addBreak();
                        run.addBreak();
                        cell.setText("（2）照片拍摄时间:");
//               	          run.addBreak();
//             	          run.addBreak();
//             	          cell.setText("（2）照片拍摄时间:");
//             	          run.addBreak();
//             	          cell.setText("纬度:");
//                           run.setText("（1）照片拍摄位置经纬度：    经度:");
//                           run.addCarriageReturn();
//                           run.addBreak();//换行

                    }
                    if(y==3) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);

                    }
                }

            }
            if(j==6){
                String imgPath="E:\\AA公司文档\\lALPD3lGuGCLG-TNBB3NB2M_1891_1053.png";
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                        List<XWPFParagraph> paragraphs = cell.getParagraphs();
                        XWPFParagraph newPara = paragraphs.get(0);
                        XWPFRun imageCellRunn = newPara.createRun();
                        File image = new File(imgPath);
                        if(!image.exists()){
                            continue;
                        }
                        try (FileInputStream is = new FileInputStream(imgPath)) {
                            imageCellRunn.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, image.getName(), Units.toEMU(180), Units.toEMU(180)); // 200x200 pixels
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    if(y==1) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                    if(y==2) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                    }
                    if(y==3) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                }
            }
            if(j==7){
                String imgPath="E:\\AA公司文档\\lALPD3lGuGCLG-TNBB3NB2M_1891_1053.png";
                for(int y=0;y<4;y++){
                    if(y==0) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                        List<XWPFParagraph> paragraphs = cell.getParagraphs();
                        XWPFParagraph newPara = paragraphs.get(0);
                        XWPFRun imageCellRunn = newPara.createRun();
                        File image = new File(imgPath);
                        if(!image.exists()){
                            continue;
                        }
                        try (FileInputStream is = new FileInputStream(imgPath)) {
                            imageCellRunn.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, image.getName(), Units.toEMU(180), Units.toEMU(180)); // 200x200 pixels
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    if(y==1) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                    if(y==2) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
                    }
                    if(y==3) {
                        cell = row.getCell(y);
                        cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
                    }
                }
            }
        }

        OutputStream os = new FileOutputStream("E:/A徐慎/测试文件导出/0209测试doc文档.doc");
        doc.write(os);
        if(os!=null){
            try{
                os.close();
                System.out.println("文件已输出！");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
