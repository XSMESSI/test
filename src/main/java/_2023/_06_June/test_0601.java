package _2023._06_June;

/**
 * @author xu Shen
 * @version 1.0
 * @description
 * @date 2023/6/3 11:40
 */
public class test_0601 {
    public static void main(String[] args) {
        String idStr = "value-1";
        int id = Integer.parseInt(idStr.substring(idStr.indexOf("-") + 1));
        System.out.println("id = " + id);
    }
}
