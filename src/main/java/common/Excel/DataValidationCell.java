package common.Excel;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/27 10:53
 */
@Data
public class DataValidationCell {
    private int startRow;
    private int endRow;
    private int startColumn;
    private int endColumn;
    private List<String> dataList;
}
