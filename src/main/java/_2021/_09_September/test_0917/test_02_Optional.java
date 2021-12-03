package _2021._09_September.test_0917;

import com.sun.istack.Nullable;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/17 15:17
 */
public class test_02_Optional {
    public static void main(String[] args) {

        //创建空对象
        Optional<String> optStr = Optional.empty();

        String s = "123";
        //根据一个值创建对象
        optStr = Optional.of(s);

        try {
            optStr = Optional.of(null);
        } catch (NullPointerException e) {
            System.out.println("catch NullPointerException");
        }

        //利用ofNullable方法创建允许对象是null,在获取optional里面的值时返回的是空对象
        optStr = Optional.ofNullable(null);
        //利用ofNullable方法创建允许对象是null,在获取optional里面的值时返回的是空对象
        Optional<String> optStr2 = Optional.ofNullable(null);
        try {
            optStr2.get();
        } catch (NoSuchElementException e) {
            System.out.println("catch NoSuchElementException  ");
        }

    }
}
