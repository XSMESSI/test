package SGG.JavaBase.day_面向对象.day_10;

/**
 * @Author: Leo messi
 * @Date: 2022/02/22/22:15
 * @Description:
 */

/**
 *  * 如果变量是基本数据类型，保存数据值
 *  * 引用数据类型，保存地址值；
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        String s1 = "hello";
        ValueTransferTest test =  new ValueTransferTest();
        test.change(s1);
        System.out.println(s1);
    }

    public void change(String s){
        s = "hi~~";
    }
}
