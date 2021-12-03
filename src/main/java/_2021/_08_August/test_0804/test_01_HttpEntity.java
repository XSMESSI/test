package _2021._08_August.test_0804;

import org.apache.http.HttpHeaders;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/4 9:42
 */
public class test_01_HttpEntity {
    public static void main(String[] args) {
//        HttpHeaders head = new HttpHeaders();
        /**
         * @PostMapping(value = "/login")
         * @ResponseBody//返回的结果是响应体，返回的类型String,字符串中有中文，乱码了
         * public ResponseEntity<User> login(@RequestBody String userString, RequestEntity requestEntity) {
         *     System.out.println(requestEntity.getUrl());
         *     //通过请求实体对象获取请求头
         *     HttpHeaders requestHeaders = requestEntity.getHeaders();
         *     System.out.println(requestHeaders);
         *     System.out.println(requestHeaders.getContentLength());//内容的长度
         *     System.out.println(requestHeaders.getContentType());
         *     System.out.println(requestHeaders.getAccept());
         *     System.out.println(requestHeaders.getOrigin());
         *     System.out.println(requestHeaders.getFirst("token"));
         *
         *     //创建一个响应头
         *     HttpHeaders responseHeader = new HttpHeaders();
         *     responseHeader.set("myResponseHeader","myValue");
         *     //userString绑定的请求体
         *     //登录成功，拿到一个user对象
         *     User user = new User();
         *     user.setUsername(userString.split("&")[0].split("=")[1]);
         *     user.setPassword(userString.split("&")[1].split("=")[1]);
         *     user.setId(1000001);
         *     user.setHead_img("/images/head.jpg");
         *     user.setBalance(1000);
         *     //现在返回登录的结果，json格式的字符串
         *     //user：响应体，responseHeader：响应头，本身就有默认的响应头，在这里是添加其他的响应头的信息
         *     //HttpStatus:响应的状态码
         *     return new ResponseEntity<User>(user, responseHeader, HttpStatus.OK);
         * }
         */
    }
}
