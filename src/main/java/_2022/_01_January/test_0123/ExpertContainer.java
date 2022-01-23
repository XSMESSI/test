package _2022._01_January.test_0123;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Description 专家库信息,
 * @Author XuShen
 * @Date 2021/10/12 14:20
 */
@Data
public class ExpertContainer {

    /**
     * token值
     */
    private String btoAuthToken;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 序号
     */
    private Integer index;

    /**
     * 项目ID
     */
    private Long projectId;

    /**
     * 姓名
     */
    private String name;
    
    private Map<String,Integer> map;

    /**
     * 模板对应的某一项id
     */
    private String itemId;

    /**
     * 专家组长标识
     */
    private Integer leaderFlag;
}
