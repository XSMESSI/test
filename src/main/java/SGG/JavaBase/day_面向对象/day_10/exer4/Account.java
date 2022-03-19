package SGG.JavaBase.day_面向对象.day_10.exer4;

/**
 * @Author: Leo messi
 * @Date: 2022/03/19/23:20
 * @Description:
 */
public class Account {

    private double balance;

    public Account(double init_balence){
        this.balance = init_balence;
    }

    public double getBalance(){
        return balance;
    }

    //存钱操作
    public void despoist(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    //取钱操作
    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不足");
        }
    }
}
