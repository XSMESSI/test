package _2021._08_August.test_0810;

import org.springframework.data.redis.connection.convert.StringToRedisClientInfoConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/10 11:56
 */
public class test_02 {
    public static void main(String[] args) {
        List<Object> str = new ArrayList<>();
        str.add("as");
        str.add("me");
        str.add("niu");
        str.add("jiushhi");
        str.add(1);

        System.out.println("计算出来的总得list集合的条数就是统计结果"+str.size());
    }
}
