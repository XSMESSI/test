package _2022._04_April.test_0424;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Leo messi
 * @Date: 2022/04/24/17:30
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        //list
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(6);
        System.out.println("list = " + list);
        list.remove(list.indexOf(2));
        System.out.println("list = " + list);
        list.remove(list.indexOf(6));
        System.out.println("list = " + list);
//        System.out.println("list = " + list);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Integer item = iterator.next();
//            if (item.equals(1)){
//                iterator.remove();
//            }
//        }
//        System.out.println("list = " + list);
    }
}
