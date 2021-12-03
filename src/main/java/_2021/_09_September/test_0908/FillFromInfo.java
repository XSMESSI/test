package _2021._09_September.test_0908;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/8 16:07
 */
@Data
public class FillFromInfo {

    /**
     * 指标名称
     */
    private String indictorName;

    /**
     * 填报的表单名称
     */
    private String formName;

    /**
     * 是否填报
     */
    private Integer flag;

}
