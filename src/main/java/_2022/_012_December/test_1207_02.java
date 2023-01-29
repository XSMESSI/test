package _2022._012_December;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/7 15:52
 */
public class test_1207_02 {
    public static void main(String[] args) {
        List<String> PROJECT_RUN_EXPORT_TITLE = Collections.unmodifiableList(Arrays.asList("序号","项目编号","项目名称","所属规划","所属项目通知","所属部门","所属专业群","所属专业","项目级别","项目大类","项目类型","项目进度","使用费用比例",
                "项目总预算(万元)","已花费(万元)","学校资助经费(万元)","二级院部资助(万元)","其他自筹经费(万元)","项目开始时间","项目结束时间","项目负责人","项目成员","项目计划","协助部门","项目汇报","变更记录","项目状态","创建人","创建时间"));
        for (int i = 0; i < PROJECT_RUN_EXPORT_TITLE.size(); i++) {
            System.out.println( i + " " + PROJECT_RUN_EXPORT_TITLE.get(i));
        }
    }
}
