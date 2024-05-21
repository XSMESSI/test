package _2023._012_Dec;

/**
 * @Author Xu Shen
 * @Date 2023/12/29 14:09
 * @Version 1.0
 * @DESC :
 */
public class tets_1229_01 {
    public static void main(String[] args) {
        String fileName = "成果文件.xlsx";
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("fileType = " + fileType);
    }
}
