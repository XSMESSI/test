package _2021._09_September.test_0929;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/29 10:57
 */
public class test_02 {
    public static void main(String[] args) {
        StringBuffer deptString = new StringBuffer("");

        List<String> deptList = Arrays.asList("");

        List<String> assistDeptlist = Arrays.asList("建筑工程学院","财经学院");

        List<String> resultDept = new ArrayList<>();
        resultDept.addAll(deptList);
        resultDept.addAll(assistDeptlist);

        List<String> result = resultDept.stream().distinct().collect(Collectors.toList());

        if (CollectionUtils.isNotEmpty(result)){
            for (String var : result){
                deptString.append(var);
                int a = result.indexOf(var);
                if (result.indexOf(var)!=result.size()-1 && !var.isEmpty()){
                    deptString.append(",");
                }
            }
            System.out.println(deptString);
        }
    }
}
