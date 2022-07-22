package _2022._07_July.test_0722;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/7/22 9:33
 */
public interface TestInterface {

    //继承类不需要去具体实现
    default void method(){
        System.out.println("默认的方法输出");
    }

}
