package _2021._2021._11_November.test_1115;

import _2021._11_November.test_1115.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 分页学习
 * @Author XuShen
 * @Date 2021/11/15 17:44
 */
public class test_02 {
    /**
     * 1.不直接在sql语句中进行限制输出，而是对集合使用截取的方法进行取值
     * @param args
     */
    public static void main(String[] args) {
        List<_2021._11_November.test_1115.Student> list = new ArrayList<>();
        list.add(new _2021._11_November.test_1115.Student(1,"A",23));
        list.add(new _2021._11_November.test_1115.Student(2,"B",25));
        list.add(new _2021._11_November.test_1115.Student(3,"A",23));
        list.add(new _2021._11_November.test_1115.Student(4,"B",25));
        list.add(new _2021._11_November.test_1115.Student(5,"A",23));
        list.add(new _2021._11_November.test_1115.Student(6,"B",25));
        list.add(new _2021._11_November.test_1115.Student(7,"A",23));
        list.add(new _2021._11_November.test_1115.Student(8,"B",25));
        list.add(new _2021._11_November.test_1115.Student(9,"A",23));
        list.add(new _2021._11_November.test_1115.Student(10,"B",25));
        list.add(new _2021._11_November.test_1115.Student(11,"A",23));
        list.add(new _2021._11_November.test_1115.Student(12,"B",25));
        list.add(new _2021._11_November.test_1115.Student(13,"A",23));
        list.add(new _2021._11_November.test_1115.Student(14,"B",25));
        list.add(new _2021._11_November.test_1115.Student(15,"A",23));
        list.add(new _2021._11_November.test_1115.Student(16,"B",25));
        list.add(new _2021._11_November.test_1115.Student(17,"A",23));
        list.add(new _2021._11_November.test_1115.Student(18,"B",25));
        list.add(new _2021._11_November.test_1115.Student(19,"A",23));
        list.add(new _2021._11_November.test_1115.Student(20,"B",25));



        Integer num = 4;
        Integer size = 6;
        List<Student> pageList;
        if (num*size >list.size()){
            pageList = list.subList((num-1)*size,list.size());
        }else{
            pageList = list.subList((num-1)*size,num*size);
        }
        Iterator iterator = pageList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
