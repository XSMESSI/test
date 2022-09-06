package common.LambdaMy;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/25 19:18
 */
public class CalculatorTest {
    public static void main(String[] args) {

        method(5,n -> n++);
        /**
         * int cal(int a)  : 抽象方法当中，小括号当中只有一个参数,这里省略5的小括号，用n指代前面的5，进行接下来的操作
         */
    }

    public static void method(int num,Calculator calculator){
        //methodf方法当中传入一个int类型数字，和一个计算器接口
        int result = calculator.cal(num);//接口类调用抽象方法
        System.out.println(result);
    }
}
