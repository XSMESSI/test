package _2022._03_March.test_0314.JsonObject;


import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

/**
 * @Description Json转换为字符串
 * @Author XuShen
 * @Date 2022/3/14 19:39
 */
public class JsonToString {
    public static void main(String[] args) throws JSONException {
        //创建JSONObject对象
        JSONObject json = new JSONObject();
        //向JSON中添加数据
        json.put("username","leo");
        json.put("height",12.5);
        json.put("age",24);

        //创建JSONArray数组，并将json添加到数组
        JSONArray array = new JSONArray();
        array.put(json);
        String jsonStr = array.toString();
        System.out.println(jsonStr);
    }
}
