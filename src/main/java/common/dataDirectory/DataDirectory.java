package common.dataDirectory;

import lombok.Data;

import java.math.BigInteger;

/**
 * @Description 数据字典的返回字段
 * @Author XuShen
 * @Date 2022/8/23 11:18
 */
@Data
public class DataDirectory {

    /**
     * 数据库名
     */
    private String TABLESCHEMA;

    /**
     * 表名
     */
    private String TABLENAME;

    /**
     * 列名
     */
    private String COLUMNNAME;

    /**
     * 类型
     */
    private String COLUMNTYPE;

    /**
     * 默认值
     */
    private String COLUMNDEFAULT;

    /**
     * 允许为空
     */
    private String ISNULLABLE;

    /**
     * 数据类型
     */
    private String DATATYPE;

    /**
     * 字符最大长度
     */
    private String CHARACTERMAXIMUMLENGTH;

    /**
     * 数字精度
     */
    private String NUMERICPRECISION;

    /**
     * 小数位数
     */
    private String NUMERICSCALE;

    /**
     * 字段说明
     */
    private String COLUMNCOMMENT;

    /**
     * 表格说明
     */
    private String TABLECOMMENT;

    /**
     * 表格数据条数
     */
    private BigInteger TABLEROWS;
}
