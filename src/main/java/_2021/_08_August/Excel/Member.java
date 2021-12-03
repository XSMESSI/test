package _2021._08_August.Excel;

import java.util.Date;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/5 10:04
 */

//创建一个实体对象,用来存储到excel表中
public class Member {
    private Integer code;
    private String name;
    private Integer age;
    private Date birth;
    private String club;

    public Member(Integer code, String name, Integer age, Date birth,String club) {
        super();
        this.code = code;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.club = club;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }


}