package common.mySelf;

/**
 * @Description 自定义异常处理
 * @Author XuShen
 * @Date 2022/2/7 16:56
 */
public class LeoException extends Exception {

    private static final long serialVersionUID = 3455708526465670030L;

    public LeoException(String errorInfo){
        super(errorInfo);
    }
}
