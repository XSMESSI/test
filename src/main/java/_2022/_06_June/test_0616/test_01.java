package _2022._06_June.test_0616;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/6/16 12:27
 */
public class test_01 {
    public static void main(String[] args) {
        Integer a = 21;
        Integer b = 13;
        System.out.println("根据数学方法进行计算数据");
        Integer total =  a * 100 + b * 10;
        Integer newA = (total / 100)%10;
        System.out.println("newA = " + newA);
        if (newA.equals(b)){
            System.out.println("a数据替换为b");
        }

        Integer newB = (total / 10) % 10;
        System.out.println("newB = " + newB);

    }
}
