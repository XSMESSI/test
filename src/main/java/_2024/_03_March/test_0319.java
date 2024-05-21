package _2024._03_March;

/**
 * @Author Xu Shen
 * @Date 2024/3/19 19:54
 * @Version 1.0
 * @DESC :
 */
public class test_0319 {
    public static void main(String[] args) {
        String url = "http://10.100.105.207/zgxsd/bto/";
        String name = "http://10.100.105.207/zgxsd/";
        System.out.println("name.contains(url) = " + name.contains(url));
        System.out.println("url.contains(name) = " + url.contains(name));
    }
}
