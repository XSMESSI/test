package _2022._03_March.test_0317;

import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/17 19:49
 */
public class test_02 {
    public static void main(String[] args) {

        //去除特殊符号
        String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
        Pattern p = Pattern.compile(regEx);

        String str = "[张弋（20000701）, 张静（19960901）]";
        str = str.replaceAll("\\[","");
        str = str.replaceAll("\\]","");
        System.out.println("result = " + str);

    }
}
