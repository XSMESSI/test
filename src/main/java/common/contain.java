package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/24 18:49
 */
public class contain {
    public static void main(String[] args) {
        List<String> name1 = Arrays.asList("A","B","C");
        /**
         * 集合的复制
         */
        //1-复制（1）
        List<String> nameCopy1 = new ArrayList(name1);
        System.out.println(name1);
        System.out.println("nameCopy1 = " + nameCopy1);
        //2-复制
        List<String> nameCopy2 = new ArrayList();
        nameCopy2.addAll(name1);
        System.out.println("nameCopy2 = " + nameCopy2);
        //3-复制
        List<String> nameCopy3 = new ArrayList(Arrays.asList(new Object[name1.size()]));
        Collections.copy(nameCopy3,name1);
        System.out.println("nameCopy3 = " + nameCopy3);
//        List<String> name2 = Arrays.asList("D");
//        System.out.println(!name1.contains(name2.get(0)));
    }
}
