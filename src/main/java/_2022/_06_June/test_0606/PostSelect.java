package _2022._06_June.test_0606;

import java.io.Serializable;

/**
 * @author kid
 * @date 2019/1/29
 */
public class PostSelect implements Serializable {

    private static final long serialVersionUID = -665836241775770203L;

    /**
     * 任职级别 0 学校 1学院 2专业 3班级 4课程
     */
    private Integer postRank;

    /**
     * 任职职务（任职类别）
     */
    private String postType;

    /**
     * 任职单位
     */
    private String postUnit;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 第几页，从1开始
     */
    private Integer pageNum;

    /**
     * 每页条数，默认10条
     */
    private Integer pageSize;

    private String keyWord;

    public Integer getPostRank() {
        return postRank;
    }

    public void setPostRank(Integer postRank) {
        this.postRank = postRank;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostUnit() {
        return postUnit;
    }

    public void setPostUnit(String postUnit) {
        this.postUnit = postUnit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
