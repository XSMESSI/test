package _2022._011_November;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/29 11:00
 */
public class test_1129_01 {
    public static void main(String[] args) {
        String urlToken = "http://172.16.40.5:30870/open_api/authentication/get_access_token";
        String key = "20221122416515949278914586951685863";
        String secret = "102791428ab7a1bb85dbaa9aa8be8bb461a89dfe";
        String getToken = postMain(urlToken,key,secret);
        System.out.println("获取token信息最终的结果数据" + getToken);
        TokenResult resData = JSON.parseObject(getToken,TokenResult.class);
        TokenResult tokenResult = JSON.parseObject(resData.getResult(),TokenResult.class);
        System.out.println("tokenResult.getAccess_token() = " + tokenResult.getAccess_token());
        StringBuilder dataUrl = new StringBuilder();
        dataUrl.append("http://172.16.40.5:30870/open_api/customization/tgxjgjzgjbxx/full?");
//        http://172.16.40.5:30870/open_api/customization/tgxjgjzgjbxx/full?access_token=c28b935c-f719-4566-a1aa-c4d50d258c54
        dataUrl.append("access_token=").append(tokenResult.getAccess_token());
        String ressult = postMain(dataUrl.toString(),key,secret);
        TokenResult data = JSON.parseObject(ressult,TokenResult.class);
        TokenResult daRe = JSON.parseObject(data.getResult(),TokenResult.class);
        List<QtcTeacher> teachers = JSONArray.parseArray(daRe.getData(),QtcTeacher.class);
        System.out.println("ressult = " + ressult);

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
            KeySecret temp = new KeySecret(key,secret);
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
                value = output;
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
