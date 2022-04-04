package SGG.JavaBase.day_面向对象.day_13.java1;

import java.util.Objects;

/**
 * @Author: Leo messi
 * @Date: 2022/04/03/11:32
 * @Description:
 */
public class Customer {

    private String name;

    private Integer age;

    public Customer() {
    }

    public Customer(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    //手动实现重写
    //重写的原则：比较两个对象的实体内容（即name 和 age 是否相等）
//    @Override
//    public boolean equals(Object obj){
//        System.out.println("Customer重写的方法的执行");
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj instanceof Customer){
//            Customer customer = (Customer) obj;
////            //比较两个对象的每个属性是否都相同
////            if (this.age.equals(customer.age) && this.name.equals(customer.age)){
////                return true;
////            }else{
////                return false;
////            }
//            //或：
//            return this.age.equals(customer.age) && this.name.equals(customer.name) ;
//        }else{
//            return false;
//        }
//    }


    //自动生成equals
    @Override
    public boolean equals(Object o) {
        System.out.println("自动生成equals*****");
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
