package common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/23 14:02
 */
@Data
public class message {

    /**
     * 年份
     */
    private Integer year;

    private BigDecimal count;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份
     */
    private String job;

}
