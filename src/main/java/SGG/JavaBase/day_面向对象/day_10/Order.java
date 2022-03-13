package SGG.JavaBase.day_面向对象.day_10;

/**
 * @Author: Leo messi
 * @Date: 2022/03/12/16:24
 * @Description:
 */
public class Order {

    private int orderPrivate;

    int orderDefault;

    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
