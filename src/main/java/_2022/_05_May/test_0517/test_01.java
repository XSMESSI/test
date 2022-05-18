package _2022._05_May.test_0517;

import org.apache.commons.lang.StringUtils;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/5/17 9:13
 */
public class test_01 {
    public static void main(String[] args) {
        String string = "";
        String s = null;
        if (StringUtils.isNotBlank(s)){
            System.out.println("s不是空的 " + s);
        }else{
            System.out.println("s是空的");
        }


        if (StringUtils.isNotBlank(string)){
            System.out.println("string不是空的 = " + string);
        }else{
            System.out.println("string是空的 ");
        }
    }
}
