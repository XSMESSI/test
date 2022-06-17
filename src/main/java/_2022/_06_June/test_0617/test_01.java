package _2022._06_June.test_0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/6/17 14:47
 */
public class test_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= 100;i++){
            list.add(i);
        }
        Integer total = list.size();
        Integer num = 100 / 3;
        System.out.println("num = " + num);
//        list = list.subList(0,33);
//        System.out.println("list = " + list);
        String type = "C";
        if (type.equals("A")){
            list = list.subList(0,num);
        }else if (type.equals("B")){
            list = list.subList(num,2 * num);
        }else if (type.equals("C")){
            list = list.subList(2 * num,total);
        }

        System.out.println("list = " + list);
    }
}
