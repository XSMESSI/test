package _2024.FaceTest;

/**
 * @Author Xu Shen
 * @Date 2024/1/31 14:51
 * @Version 1.0
 * @DESC :匿名内部类:要(且仅能)继承一个父类或者一个接口、直接使用new来生成一个对象的引用
 */
public abstract class Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}
