package SGG.JavaBase.day_面向对象.day_12.java4;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/17:47
 * @Description:
 */
public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }

}
