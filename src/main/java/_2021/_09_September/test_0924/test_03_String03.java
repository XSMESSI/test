package _2021._09_September.test_0924;

/**
 * @Description 字符串的获取相关方法
 * @Author XuShen
 * @Date 2021/9/24 11:06
 */
public class test_03_String03 {
    public static void main(String[] args) {
        /**
         * ==是进行对象的地址值比较，如果确实性需要字符号的内容比较，可以使用这个方法
         * public boolean equals(Object obj)参数可以是任何对象
         * 注意事项
         * （1）任何对象都能用Object进行比较，
         * （2）equuals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
         * （3）如果比较双方一个常量一个变量，推荐把常量字符串写在前面
         */

        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));//根据内容进行比较
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        String str4 = "hello";
        System.out.println(str1.equals(str4));
        String str5 = "abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐，当str5为null时，这样写就会出现空指针异常
        System.out.println("##################################");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
