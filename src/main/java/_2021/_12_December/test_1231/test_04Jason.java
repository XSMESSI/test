package _2021._12_December.test_1231;

import _2021._11_November.test_1110.Person;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/31 17:39
 */
public class test_04Jason {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person var = new Person();
        var.setId(1);
        var.setAge(36+"");
        var.setName("C罗");
        list.add(var);
        System.out.println(list);
        List list1 = new ArrayList(16);
//        JSONObject result = org.springframework.boot.configurationprocessor.json.JSONObject
//
//        System.out.println("result = " + result);
//        JSONObject data = new JSONObject();
//        data.put("key",result);
//        System.out.println(data);
//        SOU
//        temp.
    }
}
