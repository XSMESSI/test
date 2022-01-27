package _2022._01_January.test_0127;
import java.util.TreeSet;
/**
 * @Description 自然排序：
 * @Author XuShen
 * @Date 2022/1/27 16:20
 */
public class test_04 {
    public static void main(String[] args) {
        /**
         * TreeSet会调用集合元素的compareTo(Object obj)方法来比较元素之间的大小关系，
         * 然后将集合元素按照升序排列，这种方式就是自然排序
         */
        TreeSet ts = new TreeSet();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        System.out.println("ts = " + ts);
        R first = (R) ts.first();
        first.count = 20;
        System.out.println("ts = " + ts);
        R last = (R)ts.last();
        last.count = -2;
        System.out.println("ts = " + ts);
    }
}
class R implements Comparable{
    int count;
    public R(int count){
        this.count = count;
    }
    @Override
    public String toString(){
        return "R[count: "+count+"]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R.class == obj.getClass()) {
            R r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }
    @Override
    public int compareTo(Object obj) {
        R r = (R)obj;
        return count >r.count?1:count<r.count?-1:0;
    }
}