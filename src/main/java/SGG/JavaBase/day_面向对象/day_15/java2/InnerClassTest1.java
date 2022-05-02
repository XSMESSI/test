package SGG.JavaBase.day_面向对象.day_15.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/05/02/13:58
 * @Description:
 */
public class InnerClassTest1 {


    //开发中很少见
    public void method(){

        //局部内部类
        class AA{

        }
    }

    //返回一个实现了Compareable接口的类的对象
    public Comparable getCompareable(){

        //创建一个实现了Compareable接口的类:局部内部类
        //方式一
//        class MyCompareable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyCompareable();
        //方式二：
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
