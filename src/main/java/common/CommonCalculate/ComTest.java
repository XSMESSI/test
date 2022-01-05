package common.CommonCalculate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import javax.json.stream.JsonGenerator;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 公用方法的测试案例
 * @Author XuShen
 * @Date 2022/1/4 14:19
 */
public class ComTest {

    /**
     * 集合中的对象数量
     */
    @Test
    public void countObjectTestOut(){

        System.out.println("集合中的对象数量");
        System.out.println(">>>>start>>>>>");
        System.out.println("countObject"+"\t"+countObjectTest());
        System.out.println(">>>>end>>>>>");
        System.out.println();
    }

    /**
     * map集合根据value值进行排序_降序
     */
    @Test
    public void sortMapByValueTestOut1(){

        System.out.println("map集合根据value值进行排序_降序");
        System.out.println(">>>>start>>>>>");
        System.out.println("sortMapByValue_0"+"\t"+sortMapByValueTest1(0));
        System.out.println(">>>>end>>>>>");
        System.out.println();
    }

    /**
     * map集合根据value值进行排序_升序
     */
    @Test
    public void sortMapByValueTestOut2(){
        System.out.println("map集合根据value值进行排序_升序");
        System.out.println(">>>>start>>>>>");
        System.out.println("sortMapByValue_1"+"\t"+sortMapByValueTest2(1));
        System.out.println(">>>>end>>>>>");
        System.out.println();
    }

    /**
     * 两个key值进行计算
     */
    @Test
    public void countTwoKey() throws IOException {
        List<Prize> list = Arrays.asList(
                new Prize("国家级","一等奖"),
                new Prize("国家级","三等奖"),
                new Prize("国家级","二等奖"),
                new Prize("省级","三等奖"),
                new Prize("国家级","三等奖"),
                new Prize("国家级","二等奖"),
                new Prize("国家级","三等奖"),
                new Prize("省级","二等奖"),
                new Prize("市级","三等奖"),
                new Prize("国家级","三等奖"));
//        System.out.println(list.stream().count());
        String[] typeArr = new String[]{"国家级","省级","市级"};
        String[] classArr = new String[]{"一等奖","二等奖","三等奖"};
        Map<String,Map<String,Integer>> map = ComCalculate.countTwokey(list,typeArr,classArr);
        //输出结果
        List<CommonResult> results = new ArrayList<>();
        for (String var : map.keySet()){
            Map<String,Integer> map1 = map.get(var);
            for (String var2:map1.keySet()){
                CommonResult temp = new CommonResult();
                temp.setType(var);
                temp.setClasses(var2);
                temp.setNum(map1.get(var2));
                results.add(temp);
            }
        }

        Iterator<CommonResult> it = results.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonGenerator jsonGenerator = (JsonGenerator) objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
//        objectMapper.writeValue(System.out,results);
//        jsonGenerator.


    }

    private static Map<Integer,Integer> countObjectTest() {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,2,2,2,3,3,3,3,4,2,5,5,5,3,3,3});
        Integer[] arr;
        arr = new Integer[]{1,2,5,6,7,8,9,10,3,4};
        return ComCalculate.countObject(list,arr);
    }

    private static Map<Integer,Integer> sortMapByValueTest1(Integer flag) {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,2,2,2,3,3,3,3,4,2,5,5,5,3,3,3});
        Integer[] arr;
        arr = new Integer[]{1,2,5,6,7,8,9,10,3,4};
        Map<Integer,Integer> map1 = ComCalculate.countObject(list,arr);
        return ComCalculate.sortMapByValue(map1,flag);
    }

    private static Map<String,Integer> sortMapByValueTest2(Integer flag) {
        String[] arr1 = new String[]{"A","B","学生","足球","梅西"};
        List<String> listStr = Arrays.asList(new String[]{"A","A","学生","学生","足球","学生","学生","梅西","梅西","梅西"});
        Map<String,Integer> map = ComCalculate.countObject(listStr,arr1);
        return ComCalculate.sortMapByValue(map,flag);
    }
}
