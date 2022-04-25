package _2022._04_April.test_0420;

/**
 * @Author: Leo messi
 * @Date: 2022/04/22/13:39
 * @Description:
 */
public class test_02 {
    public static void main(String[] args) {
        String year = "2021";
        System.out.println("学年 = " + year + "-" + (Integer.valueOf(year) + 1) + "学年");


        String schoolYear = year + "-" + year + 1 + "学年";

        String resul = year + "-" + (Integer.valueOf(year) + 1) + "学年";
        System.out.println("resul = " + resul);
    }
}
