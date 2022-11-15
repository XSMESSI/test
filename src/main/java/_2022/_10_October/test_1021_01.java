package _2022._10_October;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/21 15:15
 */
public class test_1021_01 {
    public static void main(String[] args) {
        List<String> PROJECT_TEMPLATE_SHEET_BASE_HEAD = Collections.unmodifiableList(Arrays.asList("项目名称*必填*","所属部门","所属专业群","所属专业","项目级别*必填*",
                "项目大类*必填*", "项目类型*必填*","项目总预算(万元)*必填*","学校资助经费(万元)","二级院部资助(万元)","其他自筹经费(万元)","项目开始时间","项目结束时间"));
        List<String> PROJECT_TEMPLATE_SHEET_BASE_COLUMN = Collections.unmodifiableList(Arrays.asList("name","dept","mGroup","major","level","bClassify","category","budget","sMoney","dMoney","oMoney","start","end"));
        Integer siz1 = PROJECT_TEMPLATE_SHEET_BASE_HEAD.size();
        Integer siz2 = PROJECT_TEMPLATE_SHEET_BASE_COLUMN.size();
        System.out.println("siz1 = " + siz1);
        System.out.println("siz2 = " + siz2);

    }
}
