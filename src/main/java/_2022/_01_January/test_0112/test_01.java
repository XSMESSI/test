package _2022._01_January.test_0112;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/12 12:25
 */
public class test_01 {
    public static void main(String[] args) {
        String dirPath = System.getProperty("user.dir");
        String version = System.getProperty("java.version");
        String os = System.getProperty("os.name");
        System.out.println(dirPath);
        System.out.println("version = " + version);
        System.out.println("os = " + os);
    }
}
