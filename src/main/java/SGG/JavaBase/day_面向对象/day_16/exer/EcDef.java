package SGG.JavaBase.day_面向对象.day_16.exer;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/21:35
 * @Description:
 */
//自定义异常类
public class EcDef extends Exception{
    static final long serialVersionUID = -7034897110745166939L;


    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
