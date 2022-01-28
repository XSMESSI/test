package common.Excel;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/6 11:13
 */
public class Football {


    private Integer code;
    private String copname;
    private Long salary;
    private String starName;

    public Football(Integer code,String copname,Long salary,String starName){
        super();
        this.code = code;
        this.copname = copname;
        this.salary = salary;
        this.starName = starName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCopname() {
        return copname;
    }

    public void setCopname(String copname) {
        this.copname = copname;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }


}
