package _2022._012_December;

/**
 * @Description StringBuilder的定义使用
 * @Author XuShen
 * @Date 2022/12/2 17:33
 */
public class test_1202_01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("111");
        System.out.println("builder = " + builder);


        for (int i = 0; i < 10; i++) {
            StringBuilder newStringBuilder = builder;
            String temp = i + "" + i + "" + i;
            newStringBuilder.append(temp);
            System.out.println("newStringBuilder = " + newStringBuilder);
        }


        System.out.println("builder = " + builder);

        StringBuilder builder1 = new StringBuilder("Aaa");
        for (int i = 0; i < 10; i++) {
            StringBuilder me2Builder = new StringBuilder(builder1);
            String temp = i + "" + i + "" + i;
            me2Builder.append(temp);
            System.out.println("me2Builder = " + me2Builder);
        }

    }
}
