package SGG.JavaBase.day_面向对象.day_15.exer3;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/21:02
 * @Description:
 */

/**
 * interface CompareObject{
 * public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数，代表当
 * 前对象大；负数代表当前对象小
 * }
 */
public interface CompareObject {

    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}
