package common;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/20 14:53
 */
@Data
public class bysmyd {

    /**
     * 年份
     */
    private Integer year;

    /**
     * 姓名
     */
    private String name;

    /**
     * 联盟
     */
    private String union;

    /**
     * 数值
     */
    private Double Rate;

    public bysmyd(Integer year, String name, String union, Double rate) {
        this.year = year;
        this.name = name;
        this.union = union;
        this.Rate = rate;
    }
}
