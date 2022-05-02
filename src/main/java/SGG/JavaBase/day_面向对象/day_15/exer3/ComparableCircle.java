package SGG.JavaBase.day_面向对象.day_15.exer3;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/21:06
 * @Description:
 */

/**
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
 * ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
 * 径大小。
 * @author Leo-MESSI
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }

        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            //错误的
//            return (int) (this.getRadius() - c.getRadius());
            //正确的方式1
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else if (this.getRadius() < c.getRadius()){
//                return -1;
//            }else{
//                return 0;
//            }
            //当属性radius声明为Double类型时，可以调用包装类的方法
            //正确的方式2：
            return this.getRadius().compareTo(c.getRadius());
        }else{
            return 0;
//            throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}
