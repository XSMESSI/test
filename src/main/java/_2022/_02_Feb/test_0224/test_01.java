package _2022._02_Feb.test_0224;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/24 14:11
 */
public class test_01 {
    public static void main(String[] args) {
        //null与空字符串不能进行比较
        //抛出异常信息
        String str ="测试项目计划插入数据到任务管理的表格项目开题";
        String str1 ="测试项目开题";
        System.out.println("str = " + str.substring(0,str.length()-4));
        System.out.println("str1 = " + str1.substring(0,str1.length()-4));
    }
}
