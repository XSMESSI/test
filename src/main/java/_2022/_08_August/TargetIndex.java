package _2022._08_August;

import lombok.Data;

import java.util.List;

/**
 * @Description 指标实体类
 * @Author XuShen
 * @Date 2022/7/27 13:39
 */
@Data
public class TargetIndex{

    /**
     * token值
     */
    private String btoAuthToken;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 维度 5:学生 6:教师 8:课程 9:专业
     */
    private Integer dimension;

    /**
     * 维度指标名称：
     */
    private String dimStr;

    /**
     * 指标名称
     */
    private String name;

    /**
     * 指标等级 0:一级，1:二级 2:三级
     */
    private Integer level;

    /**
     * 父级id
     */
    private Integer pId;

    /**
     * 父级指标名称
     */
    private String pName;

    /**
     * 指标类型
     */
    private Integer typeId;

    /**
     * 描述
     */
    private String desc;

    /**
     * 是否标志性成果(待定：是否使用)
     */
    private Integer isMark;

    /**
     * 指标值单位：门、个、and so on
     */
    private String unit;

    /**
     * 指标性质 1、数值 2、区间 3、文本
     */
    private Integer nature;

    /**
     * 排序序号
     */
    private Integer sortNo;

    /**
     * 是否使用 0:不使用 1:使用
     */
    private Integer isUse;

    /**
     * 指标集合
     */
    private List<TargetIndex> child;
}
