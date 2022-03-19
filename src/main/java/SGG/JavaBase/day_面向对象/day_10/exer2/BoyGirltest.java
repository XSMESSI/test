package SGG.JavaBase.day_面向对象.day_10.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/19/22:55
 * @Description:
 */
public class BoyGirltest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();

        Girl girl = new Girl("朱丽叶",18);
        girl.merry(boy);

        Girl girl1 = new Girl("祝英台",19);
        int compare = girl.compare(girl1);
        if (compare >0){
            System.out.println(girl.getName()+"大");
        }else if (compare <0){
            System.out.println(girl1.getName()+"大");
        }else{
            System.out.println("一样大");
        }
    }
}
