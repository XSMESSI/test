package Leetcode.testCs;



/**
 * @Description 最后一个单词的长度
 * @Author XuShen
 * @Date 2022/2/11 14:46
 */
public class test_058lastLength {
    public static void main(String[] args) {
        String str = "luffy is still joyboy";
        String str1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));

    }

    public static int lengthOfLastWord(String s) {

        String[] words = s.split(" ");
        for (int i = words.length-1;i>=0;i--){
            if (!words[i].equals(" ")){
                String str = words[i];
                str.replace(" ","");
                return str.length();
            }
        }
        return 1;
    }

    public static int lengthOfLastWord1(String s) {
        
        int index = s.lastIndexOf(" ");
        System.out.println("index = " + index);

        if (index == s.length()-1){
            System.out.println("最后一个是空格键");
        }
        return s.length()-index-1;
    }
}
