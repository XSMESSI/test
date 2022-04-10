package SGG.JavaBase.day_面向对象.day_14.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/04/10/7:52
 * @Description:
 */

/**
 * main()方法的使用説明：
 * 1。main()方法作为程序的入口；
 * 2.main()方法也是一个普通的静态方法
 * 3.main()也可以作为与控制台交互的方式，（之前，使用Scanner）
 *
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
        MainTest mainTest = new MainTest();
        mainTest.show();
    }

    public void show(){

    }
}


class Main{
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0;i < args.length ; i++){
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }

    }
}
