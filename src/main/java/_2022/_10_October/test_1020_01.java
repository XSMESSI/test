package _2022._10_October;

import _2021._11_November.test_1110.Person;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/20 16:20
 */
public class test_1020_01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("0","校级");
        map.put("1","市级");
        map.put("2","省级");
        map.put("3","国家级");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            if (Objects.equals(entry.getValue(),"校级")){
//                System.out.println("entry = " + entry.getKey());
            }
        }

        Person person = new Person();
        String date = "1";
        date = date.replace("/","-");
        LocalDate date1 = null;
        try {
            //String转换为LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            date1 = LocalDate.parse(date,formatter);
        } catch (Exception e) {
            e.printStackTrace();
            person.setName("数据错误了");
        }finally {
            System.out.println("date1 = " + date1);
            System.out.println("提示信息 = " + person.getName());
        }


        System.out.println("接着书写数据");

    }
}
