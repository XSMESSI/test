package _2021._07_July.test_0722;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/22 17:33
 */
public class _0722test02MemberVar {

    private String name;     //定义一个String类型的成员变量

    public String getName() {//定义一个getName（）的方法
        int id = 001;        //局部变量
        setName("messi");    //调用类中的其他方法
        return id + this.name;  //设置方法返回值
    }

    public void setName(String name) {
        this.name = name;
    }

    public _0722test02MemberVar get_07_0722test02MemberVar(){
        return this;
    }
}
