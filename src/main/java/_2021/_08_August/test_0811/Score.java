package _2021._08_August.test_0811;

import io.swagger.models.auth.In;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/11 10:32
 */
@Data
public class Score {
    /**
     * 学生编号
     */
    private String studentId;
    /***
     *年份
     */
    private String scoreyear;
    /**
     * 分数
     */
    private BigDecimal score;

}
