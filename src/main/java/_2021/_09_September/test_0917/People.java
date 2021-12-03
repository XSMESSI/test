package _2021._09_September.test_0917;

import lombok.Data;

import java.util.Optional;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/17 15:11
 */
@Data
public class People {

    /**
     * 一个人肯定是有头的
     */
    private String head;

    /**
     *但是一个人不一定有帽子
     */
    private Optional<String> hat;
}
