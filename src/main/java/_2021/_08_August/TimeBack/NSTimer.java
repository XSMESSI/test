package _2021._08_August.TimeBack;

import _2021._08_August.TimeBack.TimeException;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/6 16:50
 */
public class NSTimer {

    private int hh;         //小时
    private int mm;         //分钟
    private int ss;         //秒

    //设置倒计时数
    public void setTime(int h, int m, int s) throws TimeException {
        if(m>=60||s>=60){
            throw new TimeException("!注意分钟和秒必须小于60!");	//自定义的异常
        }else{
            this.hh=h;
            this.mm=m;
            this.ss=s;
        }
    }

    //倒计时
    public void time(){
        if(hh==0&&mm==0&&ss==0) {
            return;
        }
        while(true){
            System.out.println("倒计时:"+hh+"小时"+mm+"分钟"+ss+"秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ss--;
            //以下是针对边界情况的分类处理
            if(ss==-1&&mm>0){
                mm--;
                ss=59;
            }
            if (ss==-1&&mm==0&&hh>0){
                mm=59;
                ss=59;
                hh--;
            }
            if(mm==0&&ss==-1){
                if(hh>0) {
                    hh--;
                    mm=59;
                }else {
                    mm = 59;
                }
            }
            if(hh==0&&mm==0&&ss==0){
                System.out.println("倒计时结束");
                break;
            }
        }
    }
}
