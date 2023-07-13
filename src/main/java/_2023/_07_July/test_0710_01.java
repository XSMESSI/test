package _2023._07_July;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import common.CommonCalculate.ComUtil;
import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/7/7 14:13
 */
public class test_0710_01 {
    public static void main(String[] args) {
        String name = "一、产教融合（2.4分）";
        int charIndex = name.indexOf("、");
//        System.out.println("charIndex = " + charIndex);
        List<Integer> index = getChineseIndex(name);
        if (CollectionUtils.isNotEmpty(index)){
            int subIndex = index.get(ComUtil.countSize(index) - 1);
            name = name.substring(subIndex + 1);
            name = name.replace("(","（");
            name = name.replace(")","）");
        }
        if (name.contains("（") && name.contains("）")){
            name = name.substring(0,name.indexOf("（"));
        }
        System.out.println("name = " + name);
    }

    /**
     * 第一个汉字
     * @param name
     * @return
     */
    private static List<Integer> getChineseIndex(String name) {
        List<Integer> indexes = new ArrayList<>();
        List<String> removes = Arrays.asList(" ",".","、");
        int j = 0;
         for (int i = 0; i < name.length(); i++) {
             char str = name.charAt(i);
             if (removes.contains(String.valueOf(str))){
                indexes.add(i);
            }
            int codepoint = name.codePointAt(j);
            j += Character.charCount(codepoint);
            if (Character.UnicodeScript.of(codepoint) == Character.UnicodeScript.HAN){
                if (CollectionUtils.isNotEmpty(indexes)){
                    break;
                }
            }
        }
        return indexes;
    }
}
