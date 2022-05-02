package SGG.JavaBase.day_面向对象.day_15.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/20:55
 * @Description:
 */
public class C extends B implements A{
    public void pX(){
        System.out.println(super.x);
        System.out.println(A.x);
    }
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A{
    int x = 0;
}

class B {
    int x = 1;
}


