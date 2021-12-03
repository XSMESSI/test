package _2021._11_November.test_1110;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/10 10:43
 */
@Data
public class ListName {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;



    public ListName(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
