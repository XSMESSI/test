//package common;
//
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClients;
//
//import java.util.Map;
//import java.util.Set;
//
///**
// * @Description
// * @Author XuShen
// * @Date 2022/11/29 13:48
// */
//public class HttpUtil {
//    /**
//     * 无参数的get请求
//     *
//     * @param uri 接口地址
//     */
//    public static String doGet(String uri) {
//        try {
////		 * 1、创建request连接.
//            HttpGet get = new HttpGet(uri);
//            // 设置请求头
//            get.setHeader(Constants.HEADER_MEDIA_TYPE_NAME, Constants.HEADER_MEDIA_TYPE_VALUE);
//            // 创建一个客户端
//            HttpClient client = HttpClients.createDefault();
//            // 发送请求,并接受响应
//            HttpResponse response = client.execute(get);
//            // 获取接口响应封装到一个方法中，方便调用,返回body
//            return getResult(response);
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * 带参数的get请求，参数为map
//     *
//     * @param uri 接口地址
//     * @param map 接口参数
//     */
//    public static String doGet(String uri, Map<String, String> mapParams) {
//        try {
//            // 在uri上拼接参数2.那么一个完整的url地址，基本格式如下：
//            // https://host:port/path?xxx=aaa&ooo=bbb
//            Set<String> keySet = mapParams.keySet();
//            int i = 0;
//            for (String key : keySet) {
//                if (i == 0) {
//                    uri = uri + "?" + key + "=" + mapParams.get(key);
//                } else {
//                    uri = uri + "&" + key + "=" + mapParams.get(key);
//                }
//                i++;
//            }
//            // 创建一个get请求
//            HttpGet get = new HttpGet(uri);
//            // 设置请求头
//            get.addHeader(Constants.HEADER_MEDIA_TYPE_NAME, Constants.HEADER_MEDIA_TYPE_VALUE);
//            get.addHeader(Constants.CONTENT_TYPE, Constants.CONTENT_TYPE_FORM);
//            // 创建一个客户端
//            HttpClient client = HttpClients.createDefault();
//            // 客户端发送请求，接受响应
//            HttpResponse response = client.execute(get);
//            return getResult(response);
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    /**
//     * 获取响应结果
//     *
//     * @param response
//     * @return
//     * @throws IOException
//     */
//    public static String getResult(HttpResponse response) throws IOException {
//        // 获取状态码
//        int code = response.getStatusLine().getStatusCode();
//        System.out.println(code);
//        // 获取body
//        HttpEntity entity = response.getEntity();
//        String body = EntityUtils.toString(entity);
//        System.out.println(body);
//        // 获取头信息
//        Header[] allHeaders = response.getAllHeaders();
//        String headers = Arrays.toString(allHeaders);
//        System.out.println(headers);
//
//        // 返回body
//        return body;
//    }
//
//}
