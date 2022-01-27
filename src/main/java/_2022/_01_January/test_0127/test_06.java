package _2022._01_January.test_0127;
import java.util.EnumSet;
/**
 * @Description EnumSet类
 * @Author XuShen
 * @Date 2022/1/27 16:48
 */
public class test_06 {
    public static void main(String[] args) {
        /**
         * EnumSet是一个专为枚举类设计的集合类，EnumSet中的所有素数都必须是指定枚举类型的枚举值，该枚举类型
         * 在创建EnumSet时显示或隐式性的指定。EnumSet的集合元素也是有序的。EnumSet以枚举值在Enum类的定义顺序
         * 来决定集合元素的顺序
         */

        EnumSet set1 = EnumSet.allOf(Season.class);
        System.out.println("set1 = " + set1);
        EnumSet set2 = EnumSet.noneOf(Season.class);
        System.out.println("set2 = " + set2);
    }
}
enum Season{
    SPRING,SUMMER,FALL,WINTER
}