package _2022._05_May.test_0523;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 分页数据练习
 * @Author XuShen
 * @Date 2022/5/23 13:58
 */
public class test_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= 475;i++){
            list.add(i);
        }

        int times = (list.size()/1000) + 1;
        System.out.println("times = " + times);
        List<Integer> data = new ArrayList<>();
        for (int i = 1;i <= times;i++){
            if (i * 1000 > list.size()){
                data = list.subList((i - 1) * 1000,list.size());
            }else{
                data = list.subList((i - 1) * 1000,i * 1000);
            }
            System.out.println("i = " + i);
            System.out.println("data = " + data);
        }
    }
}
