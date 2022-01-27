package _2022._01_January.test_0127;
import java.util.TreeSet;
/**
 * @Description 定制排序
 * @Author XuShen
 * @Date 2022/1/27 16:34
 */
public class test_05 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1, o2) -> {
            M m1 = (M)o1;
            M m2 = (M)o2;
            return m1.age > m2.age?-1:m1.age < m2.age?1:0;
        }
        );
    }
}
class M{
    int age;
    public M(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "M [age:"+age+"]";
    }
}