package _2022._02_Feb.test_0211;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 测试枚举类型创建
 * @Author XuShen
 * @Date 2022/2/11 10:54
 */
public class test_01 {
    public static void main(String[] args) {
        FootballStar star = FootballStar.Messi;
        System.out.println("球员姓名:" + star.getName()+"球员编号:"+star.getNumber());

        int code = FootballStar.Messi.getNumber();
        System.out.println("获取球员编号 = " + code);


        System.out.println(">>>存储列举的全部数据");


        //创建枚举的数组
        FootballStar[] stars = new FootballStar[]{FootballStar.Messi,FootballStar.Ronaldo,
                FootballStar.Neymar,FootballStar.Mbappé};
        for (int i = 0;i<stars.length;i++){
            System.out.println("球员姓名："+stars[i].getName()+" 球衣号码"+stars[i].getNumber());
        }

        System.out.println(">>>>.集合的形式存储数据");
        //枚举的集合
        List<FootballStar> list = new ArrayList<>();
        list.add(FootballStar.Messi);
        list.add(FootballStar.Ronaldo);
        list.add(FootballStar.Neymar);
        list.add(FootballStar.Mbappé);

        Iterator it = list.iterator();
        while (it.hasNext()){
            FootballStar var = (FootballStar) it.next();
            System.out.println("球员姓名: "+var.getName()+"\t"+" 球衣号码: "+var.getNumber());
        }

        System.out.println(">>>>从数组中拿数据>>>的操作");
        List<FootballStar> list1 = new ArrayList<>();
        for (int i = 0;i<stars.length;i++){
            list1.add(i,stars[i]);
        }
        Iterator it1 = list1.iterator();
        while (it1.hasNext()){
            FootballStar var = (FootballStar) it1.next();
            System.out.println("球员姓名: "+var.getName()+"\t"+" 球衣号码: "+var.getNumber());
        }
    }
}
