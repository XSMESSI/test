package common.json_list_str;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/9 14:24
 */
public class jsonListStr {

    /**
     * json和对象互相转换
     */
    @Test
    public void jsonAndObject(){
        People people = new People();
        people.setId(1);
        people.setAge(23);
        people.setName("leo");

        String s = JSON.toJSONString(people);
        System.out.println("对象转换为json字符串 = " + s);

        People obP = JSON.parseObject(s,People.class);
        System.out.println("json字符串转换为对象 = " + obP);
        System.out.println("obP.getName() = " + obP.getName());


    }

    /**
     * json和list互相转换
     */
    @Test
    public void jsonList(){
        List<People> list = new ArrayList<>();
        People people1 = new People();
        people1.setId(1);
        people1.setAge(23);
        people1.setName("leo");

        People people2 = new People();
        people2.setId(3);
        people2.setAge(45);
        people2.setName("neymare");
        list.add(people1);
        list.add(people2);

        //list转换为json
        String value1 = JSON.toJSONString(list);
        System.out.println("list集合转化为json数据形式 value1 = " + value1);

        //json转换为list
        List<People> jsonList = JSONArray.parseArray(value1,People.class);
        System.out.println("json数据形式转换为list数据形式 jsonList = " + jsonList);
        jsonList.forEach(o-> System.out.println(o));

    }
}
