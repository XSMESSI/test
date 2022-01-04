package common;

import io.swagger.models.auth.In;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Description 公用方法的测试案例
 * @Author XuShen
 * @Date 2022/1/4 14:19
 */
public class ComTest {
    public static void main(String[] args) {

        /**
         * 集合中的对象数量
         */
        System.out.println("集合中的对象数量");
        System.out.println(">>>>start>>>>>");
        System.out.println("countObject"+countObjectTest());
        System.out.println(">>>>end>>>>>");
        System.out.println();



        /**
         * map集合根据value值进行排序_降序
         */
        System.out.println("map集合根据value值进行排序_降序");
        System.out.println(">>>>start>>>>>");
        System.out.println("sortMapByValue_0"+sortMapByValueTest1(0));
        System.out.println(">>>>end>>>>>");
        System.out.println();

        /**
         * map集合根据value值进行排序_升序
         */
        System.out.println("map集合根据value值进行排序_升序");
        System.out.println(">>>>start>>>>>");
        System.out.println("sortMapByValue_1"+sortMapByValueTest2(1));
        System.out.println(">>>>end>>>>>");
        System.out.println();

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
