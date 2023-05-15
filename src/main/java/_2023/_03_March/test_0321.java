package _2023._03_March;

import org.junit.Test;

/**
 * @Description 只能包含数字和字母
 * @Author XuShen
 * @Date 2023/3/21 9:26
 */
public class test_0321 {


    @Test
    public void tetsOne(){

        String strOne = "8923ueein";
        String strTwo = "汉字数据9088";
        String regex = "^[a-z0-9A-Z]+$";
        boolean booOne = strOne.matches(regex);
        boolean booTwo = strTwo.matches(regex);
        System.out.println(booOne);
        System.out.println(booTwo);
    }



}
