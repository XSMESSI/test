package _2022._02_Feb.test_0207;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/7 11:34
 */
public class test_01 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("123456");
        name = name.replace(name.length()-3,name.length(),"》");
        System.out.println(name);
    }
}
