package _2023._011_Nov;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import common.CommonCalculate.ComUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Author Xu Shen
 * @Date 2023/11/29 12:30
 * @Version 1.0
 * @DESC :
 */
public class test_1129 {
    public static void main(String[] args) {
        String result = trimGroupName("26.国(境外)2222(2分)",1);
        System.out.println("result = " + result);
    }

    private static String trimGroupName(String groupName,int flag) {
        if (Objects.equals(flag,0)){
            List<Integer> subIndexes = trimChineseIndex(groupName);
            if (CollectionUtils.isNotEmpty(subIndexes)){
                //获取截取字段的最后一个索引
                int subIndex = subIndexes.get(ComUtil.countSize(subIndexes) - 1);
                groupName = groupName.substring(subIndex + 1);
            }
        }
        groupName = groupName.replace("(","（");
        groupName = groupName.replace(")","）");
        if (groupName.contains("（") && groupName.contains("）")){
            groupName = groupName.substring(0,groupName.lastIndexOf("（"));
        }
        return groupName;
    }

    private static List<Integer> trimChineseIndex(String str) {
        List<Integer> result = new ArrayList<>();
        List<String> removes = Arrays.asList(" ",".","、");
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char charValue = str.charAt(i);
            if (removes.contains(String.valueOf(charValue))){
                result.add(i);
            }
            int codepoint = str.codePointAt(j);
            j += Character.charCount(codepoint);
            if (Character.UnicodeScript.of(codepoint) == Character.UnicodeScript.HAN){
                if (CollectionUtils.isNotEmpty(result)){
                    break;
                }
            }
        }
        return result;
    }
}
