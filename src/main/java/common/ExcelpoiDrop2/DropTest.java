package common.ExcelpoiDrop2;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @Description 借鉴使用这个方法做成级联下拉框的功能
 * @Author XuShen
 * @Date 2022/11/10 13:59
 */
public class DropTest {

    @Test
    public void test1() throws IOException {
        HttpServletRequest request;
        HttpServletResponse response = null;
        String fileName = "classinfo" + System.currentTimeMillis();
        String[] header = {"*学校名称","*校区名称","*年级名称","*班级名称"};
        //普通下拉框
        List<Integer> listi = new ArrayList<>();
        List<String[]> list = new ArrayList<>();

        String text = "填表说明";
        //标题加红
        List<Integer> listred = new ArrayList<>();
        listred.add(0);
        listred.add(1);
        listred.add(2);
        listred.add(3);

        //学校名称
        String[] xxmc = {"南京交院","安徽科技学院","南京航空航天大学"};
        //校区名称
        String[] xqmc1 = {"南京交院本校","南京交院义务商城校区"};
        String[] xqmc2 = {"安徽科技学院凤阳校区","安徽科技学院龙湖校区"};
        String[] xqmc3 = {"南京航空航天大学将军大道","南京航空航天大学龙眠大道"};

        //所有子区域的标题
        String[] xxmc1 = {"南京交院","安徽科技学院","南京航空航天大学","南京交院本校","安徽科技学院凤阳校区"};

        String[] ejxy = {"轨道交通","桥梁测量","模型构建"};
        String[] ejxy1 = {"农学院","汽车工程","汉字学院"};

//        String[] bjmc = {"农树培养201","农树培养202"};

        //联动下拉框数据
        Map<String,String[]> areaMap = new HashMap<String,String[]>();
        areaMap.put("南京交院",xqmc1);
        areaMap.put("安徽科技学院",xqmc2);
        areaMap.put("南京航空航天大学",xqmc3);
        areaMap.put("南京交院本校",ejxy);
        areaMap.put("安徽科技学院凤阳校区",ejxy1);
//        areaMap.put("农学院",bjmc);
        PoiUtils.createExcelTemplateByGanged(response,fileName,header,list,listi,text,listred,xxmc,xxmc1,areaMap,2);
    }

    @Test
    public void test2() throws IOException {
        HttpServletResponse response = null;
        String fileName = "测试专业+专业群" + System.currentTimeMillis();
        //文件表头
        List<String> headers = Arrays.asList("级别","项目大类","项目类型");
        //普通下拉框:单级下拉框
        List<Integer> listi = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        String text = "填报说明";
        //标题加红
        List<Integer> listRed = Arrays.asList(0,1,2);

        //首级名称
        List<String> djmc = Arrays.asList("校级","市级","省级");

        //对应的结合
        List<String> xjdl = Arrays.asList("测试不审批的大类","课程思政师范课程-校级","课程项目评审","质量工程类项目");
        List<String> sjdl = Arrays.asList("课程思政示范课程_市级");
        List<String> projdl = Arrays.asList("课程思政示范课程-省级");

        //隐藏sheet的标题
        List<String> zqubt = Arrays.asList("校级","市级","省级","课程项目评审","课程思政示范课程_市级");

        //三级数据源
        List<String> xmpsle = Arrays.asList("课程项目检测质量","课程项目检测效率");
        List<String> sfshiji = Arrays.asList("课程思政示范课程_市级","市级思政示范-良好");

        //后面会把这个做成直接数据库遍历插入数据的形式
        Map<String,List<String>> sreaMap = new HashMap<>();
        sreaMap.put("校级",xjdl);
        sreaMap.put("市级",sjdl);
        sreaMap.put("省级",projdl);
        sreaMap.put("课程项目评审",xmpsle);
        sreaMap.put("课程思政示范课程_市级",sfshiji);
        Integer flag = PoiUtilsList.createExcelTemplateByGanged(response,fileName,headers,list,listi,text,listRed,djmc,zqubt,sreaMap,2);
        if (Objects.equals(flag,-1)){
            System.out.println("数据源存在异常!!!!无法做成联动的形式文件");
        }else{
            System.out.println("文件导出成功");
        }
    }


    /**
     * 实现级联的下拉框跨列操作
     * @throws IOException
     */
    @Test
    public void test3() throws IOException {
        HttpServletResponse response = null;
        String fileName = "测试专业+专业群111" + System.currentTimeMillis();
        //文件表头
        List<String> headers = Arrays.asList("级别","项目大类","项目类型");
        //普通下拉框:单级下拉框
        List<Integer> listi = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        String text = "填报说明";
        //标题加红
        List<Integer> listRed = Arrays.asList(0,1,2);

        //首级名称
        List<String> djmc = Arrays.asList("校级","市级","省级");

        //对应的结合
        List<String> xjdl = Arrays.asList("测试不审批的大类","课程思政师范课程-校级","课程项目评审","质量工程类项目");
        List<String> sjdl = Arrays.asList("课程思政示范课程_市级");
        List<String> projdl = Arrays.asList("课程思政示范课程-省级");

        //隐藏sheet的标题
        List<String> zqubt = Arrays.asList("校级","市级","省级","课程项目评审","课程思政示范课程_市级");

        //三级数据源
        List<String> xmpsle = Arrays.asList("课程项目检测质量","课程项目检测效率");
        List<String> sfshiji = Arrays.asList("课程思政示范课程_市级","市级思政示范-良好");

        //后面会把这个做成直接数据库遍历插入数据的形式
        Map<String,List<String>> sreaMap = new HashMap<>();
        sreaMap.put("校级",xjdl);
        sreaMap.put("市级",sjdl);
        sreaMap.put("省级",projdl);
        sreaMap.put("课程项目评审",xmpsle);
        sreaMap.put("课程思政示范课程_市级",sfshiji);
        Integer flag = PoiUtilsList.createExcelTemplateByGangedKHCZ(response,fileName,headers,list,listi,text,listRed,djmc,zqubt,sreaMap,2);
        if (Objects.equals(flag,-1)){
            System.out.println("数据源存在异常!!!!无法做成联动的形式文件");
        }else{
            System.out.println("文件导出成功");
        }
    }
}
