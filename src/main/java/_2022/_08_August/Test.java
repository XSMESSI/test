package _2022._08_August;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/15 17:20
 */
@Data
public class Test {

    private Integer id;

    private Integer sum;

    public Test(Integer id, Integer sum) {
        this.id = id;
        this.sum = sum;
    }
}
