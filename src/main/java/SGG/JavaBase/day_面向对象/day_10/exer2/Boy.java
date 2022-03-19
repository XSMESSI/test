package SGG.JavaBase.day_面向对象.day_10.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/19/21:58
 * @Description:
 */
public class Boy {

    private String name;
    private int age;

    public Boy(){

    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void merry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if (this.age >= 22){
            System.out.println("你可以合法登记结婚了");
        }else{
            System.out.println("先谈一谈恋爱");
        }
    }
}
