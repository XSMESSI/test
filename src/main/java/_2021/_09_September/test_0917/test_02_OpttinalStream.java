package _2021._09_September.test_0917;

import java.util.Optional;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/17 15:35
 */
public class test_02_OpttinalStream {
    public static void main(String[] args) {
        //filter 在使用Optional.filter的时候不会打印出+号，在filter时会自动过滤掉值为空的Optional
        Optional<String> opt = Optional.ofNullable(null);
        boolean a = opt.filter(str->{
            System.out.println("+++++++");
            return 1==str.length();
        }).isPresent();
        System.out.println("--------filter test-----"+a);

        //map方法转换里面的值
        Optional<String> opt3 = Optional.ofNullable(null);
        Optional<Integer> o = opt3.map(String::length);
    }
}
