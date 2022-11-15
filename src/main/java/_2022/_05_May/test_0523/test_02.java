package _2022._05_May.test_0523;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/5/23 17:56
 */
public class test_02 {


    @Test
    public void test1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前系统时间戳
        long l = 16532853715000L;
        String format = sdf.format(l);
        System.out.println("日期格式 " + format);

        Date date = new Date(l);
        System.out.println("date格式数据 = " + date);

        String for1 = sdf.format(new Date());
        System.out.println(for1);

        List<String> PROJECT_EXPORT_TITLE = Collections.unmodifiableList(Arrays.asList("序号","项目编号","项目名称","所属规划","所属项目通知","所属部门","所属专业群","所属专业","项目级别","项目大类","项目类型",
                "项目总预算(万元)","学校资助经费(万元)","二级院部资助(万元)","其他自筹经费(万元)","项目开始时间","项目结束时间","项目负责人","项目成员","项目计划","协助部门","审批流程","项目状态","创建人","创建时间"));
        for (String s : PROJECT_EXPORT_TITLE) {
            System.out.println(PROJECT_EXPORT_TITLE.indexOf(s) + " " + s);
        }
    }
}
