package _2021._11_November.test111001;

/**
 * @author mazhen
 * @className Class
 * @Description 班级类
 * @date 2020/11/9 15:24
 */
public class Class {
    private Long id;
    private String name;
    private String master;

    public Class(Long id, String name,String master) {
        this.id = id;
        this.name = name;
        this.master = master;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}

