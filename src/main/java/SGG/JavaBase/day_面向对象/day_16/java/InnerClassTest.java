package SGG.JavaBase.day_面向对象.day_16.java;

/**
 * @Author: Leo messi
 * @Date: 2022/05/03/16:34
 * @Description:
 */
public class InnerClassTest {

    public void onCreate(){

    }

    /**
     * 在局部内部类的方法中（比如show），如果调用局部内部类所声明的方法（method）中的局部变量的话，要求
     * 此局部变量声明为final的.
     *
     * jdk7及之前的版本要求此局部变量显式的声明为final的
     * jdk 8及之后的版本，可以省略final的声明
     */
    public void method(){
        //局部变量
        int num = 10;

        class AA{
            public void show(){
                System.out.println(num);
            }
        }
    }


}
