package SGG.JavaBase.day_面向对象.day_14.exer;


/**
 * @Author: Leo messi
 * @Date: 2022/04/05/20:05
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("afd521",2000);
        System.out.println("acc1 = " + acc1);
        System.out.println("acc2 = " + acc2);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);
        System.out.println("acc1 = " + Account.getInterestRate());
        System.out.println("acc2 = " + Account.getMinMoney());
    }


}
