package SGG.JavaBase.day_面向对象.day_12.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/17:20
 * @Description:
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    //取钱
    public void withdraw (double amount){
        if (balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }


    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
