package SGG.JavaBase.day_面向对象.day_16.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/21:22
 * @Description:
 */

/**
 * 如何自定义异常类？
 * 1.继承现有的异常结构：RuntimeException,Exception
 * 2.提供全局常量 ：serialVersionUID
 * 3.提供重载的构造器
 * 4.
 */
public class MyException extends RuntimeException{

    static final long serialVersionUID = -7034897190745166939L;

    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
