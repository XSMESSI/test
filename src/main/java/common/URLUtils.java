package common;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 获取链接的host
 */
public class URLUtils {

    public static String getHost(String link) {
        URL url;
        String host = "";
        try {
            url = new URL(link);
            host = url.getHost();
        } catch (MalformedURLException e) {
        }
        return host;
    }
    public static void main(String[] args){
        System.out.println(getHost("https://baijiahao.baidu.com/s?id=1685490895134593473&wfr=spider&for=pc"));
    }
}