package common.Excel.select;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/27 11:41
 */

public enum DropDownNameEnum {

    TARGET_CATEGORY("Drop001","类别"),
    PERIOD_SET("Drop002", "周期");
    /**
     * 指标类型id
     */
    private String code;
    /**
     * 指标类型名称
     */
    private String name;

    private DropDownNameEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
