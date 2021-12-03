package _2021._07_July.test_0721;


/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/21 9:53
 */
public class _0721test02 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("messi");//追加字符串
        System.out.println("apend方法：："+builder);



        builder.insert(1,"LEO");
        System.out.println("insert方法：："+builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append("0123456789");
        System.out.println(builder1);

//        builder1.deleteCharAt(3);
//        System.out.println("deleteCharAt方法"+builder1);
        builder1.delete(2,5);//delete方法左闭右开
        System.out.println("delete方法"+builder1);
        System.out.println(builder1.toString());//字符串的转换成字符输出
        System.out.println(builder1.reverse());//字符串的反转


    }
}
