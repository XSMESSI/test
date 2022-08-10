package common.Excel.ExcelModel;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @Description 文件相关参数
 * @Author XuShen
 * @Date 2022/8/8 17:38
 */
@Data
public class FileParam {

    /**
     * 名称
     */
    private String name;

    /**
     * 文件
     */
    private MultipartFile file;

    /**
     * 表格文件表头
     */
    private List<String> heads;

    /**
     * 表头对应实体类字段名
     */
    private List<String> columns;

    /**
     * 错误主键key值
     */
    private String errorKey;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * sheet页名称
     */
    private String sheetName;

    /**
     * 数据集合
     */
    private List<Map<Integer,String>> dataMap;
}
