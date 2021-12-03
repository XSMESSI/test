package _2021._10_October.test_1021;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/21 10:41
 */
public class test_02 {
    public static void main(String[] args) {

        //获取文件的后缀名
        String name = "球员体能训练文件.xls";
        String filename = name.substring(name.lastIndexOf(".")+1).toUpperCase();
        System.out.println(filename);

    }
}
