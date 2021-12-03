package _2021._08_August.test_0812;

import io.swagger.models.auth.In;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/12 14:25
 */
@Data
public class Fruit {
//    /**
//     * code值
//     */
//    private Integer code;

    /**
     * 名字:
     */
    private String name;

    /**
     * 产地
     */
    private String addres;

    /**
     * 价格
     */
    private Integer price;

    public Fruit(String name, String addres, Integer price) {
        super();
        this.name = name;
        this.addres = addres;
        this.price = price;
    }


}
