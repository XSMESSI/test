package _2024.FaceTest;

/**
 * @Author Xu Shen
 * @Date 2024/1/10 14:20
 * @Version 1.0
 * @DESC :
 */
public class Test_01 {
    public static void main(String[] args) {
        /**
         * count++ 和 ++count的区别
         * 二者都是用于递增变量的值,但是使用方式略有不同
         */
        //count++:先使用变量count的当前值进行计算,然后将结果赋值给count,最后返回原值
        int count = 0;
        System.out.println("count++ = " + count++);
        System.out.println("count = " + count);

        //++count:先将变量count的值加1 ,然后返回新的值
        int sum = 0;
        System.out.println("++sum = " + ++sum);
        System.out.println("sum = " + sum);
    }
}
