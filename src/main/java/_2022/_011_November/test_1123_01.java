package _2022._011_November;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/23 10:23
 */
public class test_1123_01 {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("排名","项目名称","项目级别","项目大类","项目类型","申请部门","所属专业","评审类型","评审创建时间","评审平均分","评审专家"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
    }
}
