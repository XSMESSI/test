package common;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @Description 测试发送消息到邮箱
 * @Author XuShen
 * @Date 2021/12/28 15:36
 */
public class sendMessage {
    public static void main(String[] args) {
        // 收件人电子邮箱
        String to = "2532413887@qq.com";

        // 发件人电子邮箱
        String from = "2532413887@qq.com";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.qq.com";  //QQ 邮件服务器

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);//服务器地址
        properties.put("mail.smtp.port", "465"); // 服务器端口

        properties.put("mail.smtp.auth", "true");//是否要身份验证
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        properties.put("mail.smtp.ssl.trust", "smtp.qq.com");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("2532413887@qq.com", "xsfodjjvarvidigh"); //发件人邮件用户名、密码（是从QQ邮箱获取到的授权码）
            }
        });

        session.setDebug(true);

        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("开发邮箱发送信息!");

            // 设置消息体
            message.setText("开发邮箱发送信息，可忽略。--徐慎");

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}