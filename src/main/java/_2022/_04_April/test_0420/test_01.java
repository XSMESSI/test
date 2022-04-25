package _2022._04_April.test_0420;

/**
 * @Author: Leo messi
 * @Date: 2022/04/20/19:20
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        Integer type = 0;
        String str = (type == 0 ? "制度文件" : (type == 1 ? "成果资料" : "标志性成果")) + "压缩文件导出.zip";
        System.out.println("str = " + str);
    }
}
