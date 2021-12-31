package _2021._12_December.test_1231;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/31 11:13
 */
public class test_03 {

    public static void main(String[] args) {


        Map<String, String> tmap = new TreeMap<String, String>();
        tmap.put("abc", "2");
        tmap.put("ace", "3");
        tmap.put("cef", "2");
        tmap.put("Weight", "6");
        tmap.put("BLue", "6");
        tmap.put("BLUe", "6");

        //对map利用key排序
        Map<String, String> resMap = sortMapByKey(tmap);

        for (Map.Entry<String, String> entry : resMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * 让 Map按key进行排序
     */
    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());
        sortMap.putAll(map);
        return sortMap;
    }
}

//实现一个比较器类

class MapKeyComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);  //从小到大排序
    }
}
