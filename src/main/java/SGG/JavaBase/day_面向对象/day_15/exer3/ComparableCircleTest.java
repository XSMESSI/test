package SGG.JavaBase.day_面向对象.day_15.exer3;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/21:25
 * @Description:
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int comparableValue = c1.compareTo(c2);
        if (comparableValue > 0){
            System.out.println("c1对象大");
        }else if (comparableValue < 0){
            System.out.println("c2对象大");
        }else{
            System.out.println("c1 和 c2 一样大");
        }

        int compareableValue = c1.compareTo(new String("AA"));
        System.out.println(compareableValue);
    }
}
