package common.CommonCalculate;

import lombok.Data;

/**
 * @Description 奖项信息
 * @Author XuShen
 * @Date 2022/1/5 14:29
 */
@Data
public  class  Prize{

    /**
     * 级别
     */
    private String type;

    /**
     * 等级
     */
    private  String classes;

    public Prize(String type, String classes) {
        this.type = type;
        this.classes = classes;
    }
}
