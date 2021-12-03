package _2021._10_October.test_1020;

import com.alibaba.druid.support.json.JSONUtils;
import lombok.Data;

/**
 * @Description 枚举类型文件
 * @Author XuShen
 * @Date 2021/10/20 11:53
 */

public enum Color {

    Yellow(1,"黄色"),
    Green(2,"绿色"),
    Red(3,"红色");



    /**
     * 返回值
     */
    private int code;

    /**
     * 返回说明
     */
    private String comment;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    Color(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }



}
