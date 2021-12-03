package _2021._10_October.test_1011;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Description List集合中循环删除元素
 * @Author XuShen
 * @Date 2021/10/11 14:08
 */
public class test_02 {
    public static void main(String[] args) {

        /***
         * 其实，在列表内部，当你使用外部 remove 的时候，一旦 remove 一个元素后，其列表的内部结构会发生改变，
         * 一开始集合总容量是 4，remove 一个元素之后就会变为 3，然后再和 i 进行比较判断。。。。。。所以只能输出两个元素。
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0;i<list.size();i++){
            list.remove(i);
        }
        System.out.println(list);


        /**
         * 阿里开发手册中的删除操作
         */
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if (item.equals("1")){
                iterator.remove();
            }
        }
        System.out.println("list1集合删除元素的数据"+list1);

    }
}
