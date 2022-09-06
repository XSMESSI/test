package _2022._08_August;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/31 10:31
 */
public class test_0831_01 {
    public static void main(String[] args) {

        String str = "#N/A";
        boolean isHz = pdHz(str);
        if (isHz){
            System.out.println("不全是汉字");
        }else{
            System.out.println("全是汉字");
        }

    }

    /**
     * 判断是不是全部是汉字
     * @param str
     * @return
     */
    private static boolean pdHz(String str) {
        Pattern pattern = Pattern.compile("[\u4e00-\u9fa5]");
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++){
            Matcher matcher = pattern.matcher(String.valueOf(c[i]));
            if(!matcher.matches()){
                return true;
            }
        }
        return false;
    }
}
