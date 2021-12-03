package _2021._07_July.test_0721;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/21 13:42
 */
public class _0721test03JSONArray {
    public static void main(String[] args) {
        List<String> contentList = new ArrayList<>();
        contentList.add("[\"HDC-51\"]");
        contentList.add("[\"HDC-51\", \"HDC-55\"]");
        contentList.add("[\"HDC-50\", \"HDC-55\", \"HDC-55-2\"]");
        contentList.add("[\"HDC-51\", \"HDC-55\", \"HDC-55-2\",\"HDC-21N\"]");
        System.out.println(contentList);
        String macType = "HDC-50";

        for (String content:contentList){
            try {
                JSONArray contenArray = JSONArray.parseArray(content);

                if (!contenArray.contains(macType)){
                    contenArray.add(macType);
                }
                System.out.println("contenArray后："+contenArray);
                System.out.println(contenArray.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
