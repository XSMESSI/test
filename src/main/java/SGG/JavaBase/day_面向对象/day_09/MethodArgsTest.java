package SGG.JavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/27/17:26
 * @Description:
 */

/**
 * 可变个数的形参的方法：
 *
 * 1.jdk5.0新增的内容：
 * 2.具体使用：
 *          1.可变个数形参的格式：数据类型。。.变量名
 *          2.当调用可变个数形参的方法的时候，传入的参数的个数可以时0，1，2个
 *          3.可变个数形参的方法和本类中方法名相同，形参不同的方法之间构成重载（可以共存的）
 *          4.可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，二者不能共存。
 *          5.可变个数形参在方法的形参中，必须声明在末尾
 *          6.可变个数形参在方法的形参中，最多只能声明一个可变形参
 *
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("hello","world");
        test.show();

        test.show(new String[]{"AA", "BB", "cc"});
    }


    public void show(int i){

    }

    public void show(String s){

    }

    //可变形参的实际使用
    public void show(String ... strings){
        System.out.println("show（String...strs）");
        for (int i = 0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
    }

//    public void show(String[] arr){
//
//    }
    public void show(int i,String str){

    }

}
