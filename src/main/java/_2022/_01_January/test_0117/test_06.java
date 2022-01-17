package _2022._01_January.test_0117;

/**
 * @Description 变量作用域学习
 * @Author XuShen
 * @Date 2022/1/17 17:43
 */
public class test_06 {
    static int x = 10;
    
    public static void main(String[] args) {
        int outer = 1;
        {//直接用{}来定义块
            //块作用域除了用for等循环或方法体的左右大括号来界定外，还可以直接用大括号{}来定义块
            int inner = 2;
            System.out.println("inner = " + inner);
            System.out.println("outer = " + outer);
        }
        int inner = 3;
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);

        System.out.println("x = " + x);
    }
}
