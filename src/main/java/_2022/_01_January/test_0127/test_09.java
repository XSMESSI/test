package _2022._01_January.test_0127;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Description LinkedHashMap
 * @Author XuShen
 * @Date 2022/1/27 17:26
 */
public class test_09 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        //(1)方式一：Class.forName("驱动类的全名称")
        Class.forName("com.mysql.jdbc.Driver");
//		(2)创建驱动类的对象
//		new com.mysql.jdbc.Driver();//硬编码
        //(3)通过DriverManager注册驱动
//		DriverManager.registerDriver(new com.mysql.jdbc.Driver());//硬编码

        //2、获取连接，连接数据库
        //TCP/IP协议编程，需要服务器的IP地址和端口号
        //mysql的url格式：jdbc协议:子协议://主机名:端口号/要连接的数据库名
        String url = "jdbc:mysql://sh-cdb-jpbgzquk.sql.tencentcdb.com:59930/leo?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true";//其中test是数据库名
        String user = "root";
        String password = "CSGZG123";
        Connection conn = DriverManager.getConnection(url, user, password);

        //3、执行sql
        //添加一个部门到数据库的t_department表中
        //(1)编写sql
        String sql = "insert into leo_first(name,age,message) values('C罗',38,'现役球员')";
        /*
         * 回忆：	TCP/IP程序时
         * Socket代表连接
         * socket.getOutputStream()来发送数据，
         * socket.getInputStream()来接收数据
         *
         * 可以把Connection比喻成Socket
         *    把Statement比喻成OutputStream
         */
        //(2)获取Statement对象
        Statement st = conn.createStatement();
        //(3)执行sql
        int len = st.executeUpdate(sql);
        //(4)处理结果
        System.out.println(len>0?"成功":"失败");

        //4、关闭
        st.close();
        conn.close();

    }
}

