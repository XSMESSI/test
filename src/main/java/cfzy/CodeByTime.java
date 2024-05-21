package cfzy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author Xu Shen
 * @Date 2024/4/15 16:28
 * @Version 1.0
 * @DESC : 根据时间生成编码
 */
public class CodeByTime {
    public static void main(String[] args) {
        //设置日期格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("dtf = " + now.format(dtf));
        String code = generateCode("Form-",now.format(dtf));
        System.out.println("code = " + code);

    }

    /**
     * 查看编码生成结果
     * @param s
     * @param format
     * @return
     */
    private static String generateCode(String s, String format) {
        return s + format;
    }
}
