package common.Excel;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
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
     * 第几个sheet页 默认只读第一页
     */
    private Integer sheetSort = 0;

    /**
     * sheets页名称集合(模板中存在多个sheet页)
     */
    private List<String> sheets;

    /**
     * 多个Sheet页 + 表头 名称组合
     * sheet页名 + 表头名称集合 数据
     */
    private Map<String,List<String>> sheetHeadsMap = Collections.EMPTY_MAP;

    /**
     * 模板填充内容多个
     */
    private Map<String,List<String>> contentMap = Collections.EMPTY_MAP;

    /**
     * 多个sheet页 + 表头 字段组合
     * sheet页名 + 表头字段集合 数据
     */
    private Map<String,List<String>> sheetColumnsMap = Collections.EMPTY_MAP;

    /**
     * 数据集合
     */
    private List<Map<Integer,String>> dataMap;

    /**
     * 下拉框的数据集合
     */
    private Map<String,List<String>> selectMap = Collections.EMPTY_MAP;

    /**
     * 添加超链接的字段
     */
    private List<String> linkColumns;

    /**
     * 超链接数据集合存储
     */
    private Map<String,List<String>> linkMap;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 表头所在行数(默认第一行)
     */
    private Integer titleRowNum = 0;

    //List<String> mapOneList, Map<String, List<String>> map

    /***
     * 三级联动信息数据
     * 一级：最初的级别
     */
    private List<String> mapOneList;

    /**
     * 联动数据集合
     */
    private Map<String,List<String>> reactMap;

    /**
     * 联动字段表头集合
     * 嵌套list? 可能会存在多处级联数据
     * eg:所属部门-所属专业  等级-项目大类-项目类型
     */
    private List<List<String>> reactTitles;

    /**
     * 级联的数据集合
     */
    private Map<Integer,Map<String,List<String>>> reactDataMap;

    /**
     * 日期格式字段(年-月-日)集合:填写样式:2022-08-08
     */
    private List<String> dateColumns;


    private List<String> reactOneLevel;

    private List<List<String>> content;

    /**
     * 是否上锁
     */
    private Boolean lock = false;

    /**
     * 上锁的字段集合
     */
    private List<String> lockHeads = Collections.EMPTY_LIST;

    /**
     * 另外sheet页名称
     */
    private String sheetOther;

    /**
     * 表头集合
     */
    private List<String> otherTitles;

    /**
     * 数据集合
     */
    private List<List<String>> otherData;


}