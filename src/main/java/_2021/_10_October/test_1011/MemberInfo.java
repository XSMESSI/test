package _2021._10_October.test_1011;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/11 10:49
 */
@Data
public class MemberInfo {

    /**
     * 序号
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 国家队
     */
    private String country;

    /**
     * 俱乐部
     */
    private String club;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 金球获奖个数
     */
    private Integer awardNum;
}
