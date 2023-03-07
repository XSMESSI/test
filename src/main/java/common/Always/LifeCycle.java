package common.Always;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/6 19:42
 */
public class LifeCycle {

    //静态属性
    private static String staticField = getStaticField();

    //静态方法块
    static {
        System.out.println("staticField = " + staticField);
        System.out.println("");
    }

    private static String getStaticField() {
        return "";
    }
}
