package _2021._09_September.test_0924;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/24 16:54
 */
public class test_07String07 {
    public static void main(String[] args) {
        /**
         * 分割字符串的方法
         * public String[] spilt(String regex)按照单数的规则，把字符串切分成若干部分
         * 注意事项：spilt方法的参数其实是一个"正则表达式"，今天要注意的是：如果按照英文据点"进行切分，必须写“\.”(两个反斜杠)
         */
        String str1 = "aaa,bbb,cccc";
        String[] spilt = str1.split(",");
        for (int i = 0;i < spilt.length;i++){
            System.out.println(spilt[i]);
        }
        System.out.println("**************");
        String str2 = "aaa bbb ccc";
        String[] spilt1 = str2.split(" ");
        for (int i = 0;i<spilt1.length;i++){
            System.out.println(spilt1[i]);
        }
        System.out.println("***********");
        String str3 = "XXX.YYYY.ZZZZ";
        String[] spilt2 = str3.split("\\.");
        for (int i = 0;i<spilt2.length;i++){
            System.out.println(spilt2[i]);
        }

    }
}
