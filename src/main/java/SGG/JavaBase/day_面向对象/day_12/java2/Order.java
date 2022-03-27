package SGG.JavaBase.day_面向对象.day_12.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/9:39
 * @Description:
 */

/**
 * 体会自种不同的权限修饰：
 *
 */
public class Order {

    private int orderPrivate;

    int orderDefault;

    protected int orderProtected;

    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    protected void methodProtected(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }
}
