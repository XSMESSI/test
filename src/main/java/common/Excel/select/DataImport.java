package common.Excel.select;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/27 11:19
 */
@Data
public class DataImport {

    /**
     * id
     */

    private Integer id;

    /**
     * 名称
     */
    @DropDownSetField(name = "名字",source = {"类别","周期"})
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
