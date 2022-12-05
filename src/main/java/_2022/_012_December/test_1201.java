package _2022._012_December;

import org.springframework.util.DigestUtils;

/**
 * @Description 工具类
 * @Author XuShen
 * @Date 2022/12/1 18:04
 */
public class test_1201 {
    public static void main(String[] args) {
        String password = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println("password = " + password);
    }
}
