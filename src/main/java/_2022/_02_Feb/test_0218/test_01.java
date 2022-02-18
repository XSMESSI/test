package _2022._02_Feb.test_0218;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/18 13:47
 */
public class test_01 {
    public static void main(String[] args) {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(5L);
        ids.add(6L);

        System.out.println("for>>start");
        for (int i = 0;i<ids.size();i++){
            System.out.println("ids = " + ids.get(i));
        }
        System.out.println("for>>end");


        for (Long id : ids){
            System.out.println("ids = " + id);
        }
    }
}
