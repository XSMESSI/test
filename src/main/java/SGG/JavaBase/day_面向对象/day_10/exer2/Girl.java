package SGG.JavaBase.day_面向对象.day_10.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/19/22:05
 * @Description:
 */
public class Girl {

    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
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

    public void merry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.merry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大，：负数;当前对象小，0：相等
     */
    public int compare(Girl girl){

//		if(this.age > girl.age){
//			return 1;
//		}else if(this.age < girl.age){
//			return -1;
//		}else{
//			return 0;
//		}
        return this.age -girl.age;
    }
}
