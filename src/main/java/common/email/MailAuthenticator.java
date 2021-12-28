package common.email;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/28 16:06
 */
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 发件人账号密码
 * @author zhangdi
 *
 */
public class MailAuthenticator extends   Authenticator{

    public static String USERNAME = "";
    public static String PASSWORD = "";

    public MailAuthenticator() {
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(USERNAME, PASSWORD);
    }

}