package _2022._09_Septemper;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/2 9:39
 */
public class test_0901_01 {
    public static void main(String[] args) {
        HttpServletRequest request = null;
        String path = request.getSession().getServletContext().getRealPath("/temp/");
        System.out.println("path = " + path);
    }
}
