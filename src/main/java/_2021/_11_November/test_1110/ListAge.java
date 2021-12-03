package _2021._11_November.test_1110;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/10 10:43
 */
@Data
public class ListAge {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 年龄
     */
    private String age;

    /**
     * 姓名
     * @param id
     * @param age
     */
    private String name;

    public ListAge(Integer id, String age) {
        this.id = id;
        this.age = age;
    }
}
