package common.list;

import _2022._08_August.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 集合中的相关方法使用
 * @Author XuShen
 * @Date 2022/8/17 16:13
 */
public class ObjectList {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>(Arrays.asList(new Test(1,2),new Test(2,4)));
        //集合中的符合条件字段的数据进行求和
        Integer num = list.stream().filter(o->o.getId().equals(1)).collect(Collectors.toList()).stream().mapToInt(Test::getSum).sum();
        System.out.println("num = " + num);


    }
}
