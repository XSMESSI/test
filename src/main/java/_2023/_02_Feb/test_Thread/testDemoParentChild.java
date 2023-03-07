package _2023._02_Feb.test_Thread;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/27 18:36
 */
public class testDemoParentChild {

    public static void main(String[] args) throws InterruptedException {
        Thread parentParent = new Thread(() -> {
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
            threadLocal.set(1);
            InheritableThreadLocal<Integer> inheritableThreadLocal = new InheritableThreadLocal<>();
            inheritableThreadLocal.set(2);

            new Thread(() -> {
                System.out.println("threadLocal=" + threadLocal.get());
                System.out.println("inheritableThreadLocal=" + inheritableThreadLocal.get());
            }).start();
        }, "父线程");
        parentParent.start();
    }
}
