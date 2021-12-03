package _2021._08_August.test_0820;

import io.swagger.models.auth.In;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/20 14:53
 */
@Data
public class jsmyd {

    /**
     * 年份
     */
    private Integer year;

    /**
     * 教练姓名
     */
    private String name;

    /**
     * 联盟
     */
    private String union;
    /**
     * 比率数值
     */
    private Double rate;

    public jsmyd(Integer year, String name, String union, Double rate) {
        this.year = year;
        this.name = name;
        this.union = union;
        this.rate = rate;
    }
}
