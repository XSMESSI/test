package common.Excel.select;


import net.sf.jsqlparser.statement.drop.Drop;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description SXSSFWorkbook
 * @Author XuShen
 * @Date 2022/8/19 15:13
 */
public class TestSelect {
    public static void main( String[] args ) throws IOException {

        SXSSFWorkbook wb = new SXSSFWorkbook();

        Sheet sheet = wb.createSheet("自定义单元格");

        Row row  = sheet.createRow(5);

        Cell cell = row.createCell(5);

        CellStyle cellStyle = wb.createCellStyle();

        Font font = wb.createFont();

        font.setColor(HSSFFont.COLOR_RED);
//        font.setColor(HSSFColor.BLACK.index);

        font.setFontName("宋体");

        font.setFontHeight((short)700);

        Font font2 = wb.createFont();

        font2.setColor(HSSFFont.COLOR_NORMAL);
//        font2.setColor(HSSFColor.RED.index);

        font2.setFontName("黑体");

        font2.setFontHeight((short)800);
//        font2.setBoldweight((short)700);

        cellStyle.setFont(font2);

        testTemplate();

//        cell.setCellStyle(cellStyle);

        String txt = "测试数据*必填*";

//        sheet.autoSizeColumn(5,true);
        String fileName = "SXSSF测试一个单元格两个颜色" + System.currentTimeMillis() + ".xlsx";

        File file = new File("E:\\AA公司文档\\测试文档\\" + fileName);
        System.out.println("导出成功");
        System.out.println(file.getPath());
        if(file.exists()){

            file.delete();

        }

        file.createNewFile();

        wb.write(new FileOutputStream( file ));

    }

    public static void testTemplate(){
        Field[] fields = DataImport.class.getDeclaredFields();
        //相应字段对应的下拉集合
        Map<Integer,String[]> map = new HashMap<>();
        Field field = null;
        for (int i = 0; i < fields.length; i++) {
            field = fields[i];
            //解析注解信息
            DropDownSetField dropDownSetField = field.getAnnotation(DropDownSetField.class);
            if (null != dropDownSetField){
                String name = dropDownSetField.name();
                if (!StringUtils.isEmpty(name)){
                    if (name.equals(DropDownNameEnum.TARGET_CATEGORY.getName())){
                        List<String> list = new ArrayList<>();
                        list.add("定性");
                        list.add("定量");
                        String[] params = list.toArray(new String[list.size()]);
                        insertMap(map,params,dropDownSetField,i);
                    }
                }else{
                    insertMap(map,null,dropDownSetField,i);
                }

            }
        }

        System.out.println(map);
    }

    //插入到map中
    private static void insertMap(Map<Integer, String[]> map, String[] params, DropDownSetField dropDownSetField, int i) {
        String[] sources = ResolveDropAnnotationUtil.resove(dropDownSetField, params);
        if (null != sources && sources.length > 0) {
            map.put(i, sources);
        }
    }
}
