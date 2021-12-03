package _2021._07_July.test_0721;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/21 14:56
 */
public class _0721test04RedisTemplate {
    public static void main(String[] args) {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.opsForValue().set("name","messi");
//        System.out.println(redisTemplate);
        System.out.println("redis");

    }
}
