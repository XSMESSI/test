package _2023._03_March;

import redis.clients.jedis.Jedis;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/23 18:59
 */
public class test_0323 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("124.223.201.235",6379);
        String pong = jedis.ping();
        System.out.println("pong = " + pong);
        jedis.close();
    }
}
