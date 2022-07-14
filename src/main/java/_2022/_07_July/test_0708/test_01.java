package _2022._07_July.test_0708;

/**
 * @Description 字符串截取数据
 * @Author XuShen
 * @Date 2022/7/8 15:52
 */
public class test_01 {
    public static void main(String[] args) {
        String data = "access_token=DQD-38-QsEYUY2DPnTvXP6hGGxk0EKxMDheWRIFJjlJJcyEYmysPNfXCt-c5@@hxbeat@@KU_t0su75s99q7397874t05081urqs330ru&expires=-12451";
        int start = data.lastIndexOf("access_token=");
        System.out.println("start = " + start);
        System.out.println("access_token=".length());
        int end = data.lastIndexOf("&expires=");
        String token = data.substring("access_token=".length(),data.lastIndexOf("&expires="));
        System.out.println("token = " + token);
    }
}
