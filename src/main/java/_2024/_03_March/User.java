package _2024._03_March;

import lombok.Data;

/**
 * @Author Xu Shen
 * @Date 2024/3/13 15:45
 * @Version 1.0
 * @DESC :
 */
@Data
public class User {

    private Integer id;

    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



}
