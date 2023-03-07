package _2023._02_Feb.test_Thread;


/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/27 15:16
 */
// 继承Thread类，创建一个新的线程类
public class ThreadDemo extends Thread {
    // 重写了Thread类的run()方法，将需要并发执行的用户业务代码编写在继承的run()方法中
    @Override
    public void run() {
        for(int i=0;i<2;i++){
            System.out.println(getName()+" 轮次："+i);
        }
        System.out.println(getName()+" 运行结束");
    }
}


class CreateDemo {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ">>>>>>>>>>>主线程");
        }

        // 启动线程
        threadDemo.start();
        System.out.println(Thread.currentThread().getName()+" 运行结束");
    }
}


