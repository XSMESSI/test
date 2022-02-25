package _2022._02_Feb.test_0225;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/25 9:40
 */
public class test_01 {
    public static void main(String[] args) {
        float a = (float) 3.4;
        System.out.println("a = " + a);
        //将双精度浮点型（double）赋值给浮点型（float）属于下转型（down-casting，也称为窄化），会造成精度损失
//        float b = 3.4;错误写法会造成精度丢失
        float b = 3.4f;
        System.out.println("b = " + b);
        double c = 3.4;
        System.out.println("c = " + c);

        short s1 = 1;
        //s1 = s1+1;//错误写法：1是int型，s1+1的运算结果也是int类型，再把int类型赋值给short类型的s1是会报错的，，需要强制转换类型才能通过编译;
        s1+=1;//相当于s1 = (short)(s1+1);表达式，其中会有隐含的强制类型转换，可以正常通过编译
        System.out.println("s1 = " + s1);

    }
}
