package _2021._07_July.test_0722;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.apache.catalina.LifecycleState;
import org.apache.commons.codec.StringEncoderComparator;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/22 14:28
 */
public class _0722test01Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abdf");
        list.add("messi");
        list.add("leo");
        list.add("main");
        System.out.println("首次的list集合：" + list);
        /**
         * 排序:Collections.sort
         */
        Collections.sort(list);
        System.out.println("排序之后list:" + list);

//        Collections.sort(list,new StrLengthCompareator());
//        System.out.println("加上一个比较器之后的排序"+list);

        /**
         * 交换：Collections.swap
         */
        Collections.swap(list, 3, 4);
        System.out.println("交换之后的list" + list);

        /**
         * 取最大值：Collections.max
         */
        System.out.println("取得list中的最大值" + Collections.max(list));

        /**
         * 二分查找：Collections.binarySearch
         * 查找之前必须进行排序
         */
        List<String> list1 = new ArrayList<>();
        list1.add("ang");
        list1.add("messi");
        list1.add("leo");
        list1.add("void");
        list1.add("Barclona");
        System.out.println("没有排序的list1"+list1);
        Collections.sort(list1);
        System.out.println("排序之后的list1"+list1);

        System.out.println("二分查找leo的位置为："+Collections.binarySearch(list1,"leo"));
        System.out.println("二分查找不存在的字符："+Collections.binarySearch(list1,"xushen"));

        /**
         *填充元素：Collections.fill
         */
        System.out.println(list1);
        Collections.fill(list1,"xushen");
        System.out.println("填充过元素的list1"+list1);
        System.out.println();

        /**
         * 反转：
         */

        /**
         * 数组变集合：将Arrays.asList对数组转换的值赋给新建的集合
         *
         */
        String arr[] = new String[]{"asd","dfg","jhg","kiuu","loi"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println("输出的是数组元素");

        /**
         * 下面这种是集合的遍历方式，很常用
         */
        for (String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("**************");
        System.out.println("输出的是数组转换成集合："+list2);


        /**
         * 集合变数组：
         */
        List<String> list3 = new ArrayList<>();
        list3.add("aaaaa");
        list3.add("bbbbb");
        list3.add("ccccc");
        list3.add("dddddd");
        list3.add("rrrrrr");

//        String str1[] = new String[]{};
        System.out.println(list3);
        list3.toArray();
        System.out.println(list3);



    }

}

