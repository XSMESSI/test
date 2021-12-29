import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Description: 系统通知
 * @Author: JalonY
 * @Date: 2021/4/15 19:56
 */
@Data
public class SystemNotice {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 业务类型 0：表单 1：项目 2：活动 3：流程 4：评价
     */
    private Integer businessType;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户账号
     */
    private String userNumber;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否已读 0：否 1：是
     */
    private Integer readFlag;

    /**
     * 是否发送 0：否 1：是
     */
    private Integer sendFlag;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 学校编码
     */
    private String schoolNum;

    /**
     * 业务数据ID
     */
    private Long dataId;
}
