package _2022._011_November;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/15 11:34
 */

public class BtoBase {

    /**
     *
     */
    private String sj;

    /**
     * p
     */
    private String schoolName;

    /**
     * bto
     */
    private String dbName;

    /**
     * 加密信息
     */
    private String secret;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDbName() {
        return dbName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public BtoBase(){

    }

    public BtoBase(String sj, String schoolName, String dbName){
        this.sj = sj;
        this.schoolName = schoolName;
        this.dbName = dbName;
    }

    public BtoBase(String sj,  String dbName){
        this.sj = sj;
        this.dbName = dbName;
    }
}
