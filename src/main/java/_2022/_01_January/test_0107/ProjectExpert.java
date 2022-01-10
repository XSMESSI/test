package _2022._01_January.test_0107;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Description: 评审专家实体类
 * @Author: JalonY
 * @Date: 2021/12/27 15:40
 */
@Data
public class ProjectExpert {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 评审类型 0：立项 1：结项 2：期中 3：外部
     */
    private Integer reviewType;

    /**
     * 评审ID（t_ts_project_review主键）
     */
    private Long reviewId;

    /**
     * 是否组长 0：否 1：是
     */
    private Integer leaderFlag;

    /**
     * 专家ID
     */
    private Long containerId;

    /**
     * 专家姓名
     */
    private String containerName;

    /**
     * 专家邮箱
     */
    private String containerEmail;

    /**
     * 意见
     */
    private String opinion;

    /**
     * 总分
     */
    private Integer score;

    /**
     * 签字
     */
    private String signature;

    /**
     * 状态 0：已评 1：未评
     */
    private Integer status;

    /**
     * 结论 0：通过 1：暂缓通过 2：不通过
     */
    private Integer result;

    /**
     * 评审时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime reviewTime;

    /**
     * 模板选项
     */
//    private List<ItemInfo> infoList;

    /**
     * 项目名称
     */
    private String projectName;
}
