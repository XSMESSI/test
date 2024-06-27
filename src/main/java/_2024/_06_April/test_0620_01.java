package _2024._06_April;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName test_0620_01
 * @Description:
 * @Author: xushen
 * @CreateDate: 2024/6/20 15:29
 * @Version: 1.0
 */
public class test_0620_01 {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("序号","项目编号","项目名称","项目链接","所属部门","所属专业群","所属专业","项目级别","项目大类","项目类型",
                "项目总预算(万元)","项目开始时间","项目结束时间","项目负责人","项目成员","项目计划","协助部门","审批流程","项目状态","创建人","创建时间"));
        list.forEach(System.out::println);

    }
}
