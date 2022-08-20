package _2022._08_August;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @Description 字符串转换JSON，转换为对象
 * @Author XuShen
 * @Date 2022/8/16 9:24
 */
public class test_0816_01 {
    public static void main(String[] args) {
        String str = "{\"btoAuthToken\":\"006ddfe25c6f4cd19ec21ca500605628\",\"dimension\":8,\"keyword\":\"\",\"id\":22,\"flag\":0}";
        JSONObject json1 = JSONObject.parseObject(str);
        System.out.println("json1 = " + json1);

        //方法一：
        Integer id = json1.getInteger("id");
        Integer flag = json1.getInteger("flag");
        String token = json1.getString("btoAuthToken");
        Integer dimension = json1.getInteger("dimension");
        String keyword = json1.getString("keyword");
        System.out.println("id = " + id);
        System.out.println("flag = " + flag);
        System.out.println("token = " + token);
        System.out.println("dimension = " + dimension);
        System.out.println("keyword = " + keyword);

        //方法二：字符串直接转换为对象>>>更加方便使用
        TargetIndex index = JSON.parseObject(str,TargetIndex.class);
        System.out.println("index = " + index);


    }
}
