package _2021._09_September.test_0924;

/**
 * @Description 字符串截取方法
 * @Author XuShen
 * @Date 2021/9/24 15:44
 */
public class test_05String05 {
    public static void main(String[] args) {
        /**
         * public String subString(int index)截取从参数位置一直到字符串末尾，返回新字符串，
         * public String subString(int begin,int end)截取从begin开始，一直到end结束，中间的字符串
         * 备注：【begin end)左闭右开
         */
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("#############");
        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("************");
        //下面这种方法，字符串的内容依然没有改变的
        //下面有两个字符串，“Hello”,"Java"
        //StrA当中保存的是地址值
        //本来地址值Hello的0x666
        //后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
