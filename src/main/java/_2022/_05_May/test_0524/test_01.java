package _2022._05_May.test_0524;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description GET请求接口
 * @Author XuShen
 * @Date 2022/5/24 14:42
 */
@Slf4j
public class test_01 {
    public static void main(String[] args) throws IOException {
        inform();
//        HttpHead head = new HttpHead();
//        head.setHeader("authToken","154F4655A8581AA97C7B1645EBF0D58B");
        System.out.println("1 = " + 1);
    }


    /**
     * 设置请求头Header以Post方式请求接口
     *
     * @param sj 请求数据
     * @author liangjunfei
     */
    public static  void inform() throws IOException {
        JSONObject result = null;
        StringBuilder apiUrl = new StringBuilder("http://localhost:8011/Framework/DoMsgController/getTaskOfZgpt?");
        apiUrl.append("authToken=131C25D5FBF8CF0654CDA225A193315A&number=123332");
//        apiUrl.append(param.getDataResourceId()).append("/query?");
//        apiUrl.append("appid=").append(param.getAppId( ));
//        apiUrl.append("&appscret=").append(param.getAppscret());
//        if (param.getPageIndex() != null && param.getPageSize() != null){
//            apiUrl.append("&pageSize=").append(param.getPageSize());
//            apiUrl.append("&pageIndex=").append(param.getPageIndex());
//        }
        URL url = new URL(apiUrl.toString());
        log.info("调用接口：{}",apiUrl.toString());

        // 2. 得到网络访问对象java.net.HttpURLConnection
        HttpURLConnection connection = (HttpURLConnection) url
                .openConnection();
        /* 3. 设置请求参数（过期时间，输入、输出流、访问方式），以流的形式进行连接 */
        // 设置是否向HttpURLConnection输出
        connection.setDoOutput(false);
        // 设置是否从httpUrlConnection读入
        connection.setDoInput(true);
        // 设置请求方式
        connection.setRequestMethod("GET");
        connection.connect();
        // 4. 得到响应状态码的返回值 responseCode
        int code = connection.getResponseCode();
        // 5. 如果返回值正常，数据在网络中是以流的形式得到服务端返回的数据
        if (code == 200) {
            // 从流中读取响应信息
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String line = null;

            while ((line = reader.readLine()) != null) {
                JSONObject data = (JSONObject) JSONObject.parseObject(line).get("data");
                result = data;
            }
            reader.close(); // 关闭流
        }
        // 6. 断开连接，释放资源
        connection.disconnect();
        System.out.println("result = " + result);
    }
}
