package _2022._10_October;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/8 13:51
 */
public class test_1008_01 {
    public static void main(String[] args) {
        String[] cmdW = {"cmd ", "/c ", "start ", " --headless --invisible --convert-to pdf:writer_pdf_Export " + " --outdir "};
        String commond = String.join("", cmdW);
        System.out.println(commond);
    }
}
