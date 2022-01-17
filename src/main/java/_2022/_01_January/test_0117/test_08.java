package _2022._01_January.test_0117;

/**
 * @Description 测试短路特性
 * @Author XuShen
 * @Date 2022/1/17 18:44
 */
public class test_08 {
    public static void main(String[] args) {
        int ia = 3;
        int ib = 5;
        //对于逻辑运算符来说，若第一个条件为假则整个表达式为假，此时跳过第二个表达式不执行
        boolean b4 = (++ia == 3) && (++ib == 5);
        System.out.println("b4 = " + b4);
        System.out.println("ia = " + ia);
        System.out.println("ib = " + ib);//短路特性，第二个表达式跳过没执行了

        //对于逻辑或运算符来说，若第一个条件为真则整个表达式为真，此时跳过第二个表达式不执行
        boolean b5 = (++ia == 5) || (++ib == 5);
        System.out.println("b5 = " + b5);
        System.out.println("ia = " + ia);
        System.out.println("ib = " + ib);//短路特性，第二个表达式跳过没执行了
    }
}
