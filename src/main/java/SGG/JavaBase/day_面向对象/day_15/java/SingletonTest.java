package SGG.JavaBase.day_面向对象.day_15.java;

/**
 * @Author: Leo messi
 * @Date: 2022/04/16/13:16
 * @Description:
 */
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.instance;
        Bank bank2 = Bank.instance;
        Bank bank3 = null;

        System.out.println(bank1 == bank2);
    }

}

class Bank{
    private Bank(){

    }

    public static final Bank instance = new Bank();

}
