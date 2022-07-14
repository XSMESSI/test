package _2022._07_July.test_0712;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/7/13 14:08
 */
public class test_02 {
    public static void main(String[] args) {
        String type = "flag";
        String isNull = null;
        String noNull = "new";
//        if (isNull.equals(noNull)){
////            System.out.println("null在前面");
////        }


        if ("不是空的".equals(null)){
            System.out.println("正常输出");
        }else{
            System.out.println("相等");
        }
    }
}
