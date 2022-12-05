package common;

import _2022._011_November.KeySecret;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/29 13:51
 */
@Slf4j
public class HttpUtil1 {

    private static CloseableHttpClient httpClient;

    /**
     * 发送Get请求
     * @param url
     * @param param
     * @return
     */
    public static String doGet(String url, Map<String, String> param) {
        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            URIBuilder builder = new URIBuilder(url);
            if (param != null) {
                for (String key : param.keySet()) {
                    builder.addParameter(key, param.get(key));
                }
            }
            URI uri = builder.build();

            // 创建http
            HttpGet get = new HttpGet(uri);
            response = httpClient.execute(get);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            log.error(">>>>HttpUtil，doGet方法Exception异常",e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
//                httpClient.close();
            } catch (IOException e) {
                log.error(">>>>HttpUtil，doGet方法IOException异常",e);
            }
        }
        return resultString;
    }

    public static String postMain(String url,String key,String secret) {
        try {
            //首先需要获取token，是根据key和secret生成的,其中127.0.0.1:3033根据实际部署环境api地址IP替换
            URL targetUrl = new URL(url);
            //创建一个POST请求，调用上面的API URL信息
            HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            //构建一个json对象，key,secret的值在应用查看中获取
            KeySecret temp = new KeySecret();
            temp.setKey(key);
            temp.setSecret(secret);
            String input = JSON.toJSONString(temp);

//            String input = "{\"key\":111,\"secret\":\"222\"}";
//            System.out.println("直接定义的数据input = " + input);

            OutputStream outputStream = httpConnection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.flush();

            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " +
                        httpConnection.getResponseCode());
            }
            //读取流信息，答应出返回的结果
            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (httpConnection.getInputStream())));
            String output;
            String value = "";
            System.out.println("Output from Server:\n");
            while ((output = responseBuffer.readLine()) != null) {
                System.out.println(output);
                value = JSON.toJSONString(output);
//                System.out.println("value = " + value);
            }
            //断开HTTP连接
            httpConnection.disconnect();
            if (StringUtils.isNotBlank(value)){
                return value;
            }
            return null;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
