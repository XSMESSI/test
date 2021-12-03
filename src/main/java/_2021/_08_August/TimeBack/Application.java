package _2021._08_August.TimeBack;

import _2021._08_August.TimeBack.NSTimer;
import _2021._08_August.TimeBack.TimeException;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/6 16:51
 */
public class Application {
    public static void main(String[] args) {
        _2021._08_August.TimeBack.NSTimer nsTimer = new NSTimer();
        try {
            nsTimer.setTime(0,1,5); 		//设置倒计时
        } catch (TimeException e) {
            e.printStackTrace();
        }
        nsTimer.time();  //开始倒计时
    }
}

