package _2022._01_January.test_0123;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.junit.Test;

import java.util.*;

/**
 * @Description
 * @Auther xuShen
 * @Date 2022-01-23 20:39
 */

public class test_03 {

    @Test
    public void testDataList(){

        List<ExpertContainer> list = new ArrayList<>();
        Map<String,Integer> map1 = new LinkedHashMap<>();
        map1.put("园林艺术",1);
        map1.put("医学教研室",0);
        map1.put("建筑工程",0);
        map1.put("现教中心",1);
        ExpertContainer temp1 = new ExpertContainer();
        temp1.setName("测试001");
        temp1.setIndex(1);
        temp1.setBtoAuthToken("教材建设");
        temp1.setMap(map1);
        list.add(temp1);

        Map<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("教研室001",1);
        map2.put("教研室002",0);
        map2.put("教研室004",1);
        map2.put("教研室003",0);
        ExpertContainer temp2 = new ExpertContainer();
        temp2.setName("测试002");
        temp2.setIndex(2);
        temp2.setBtoAuthToken("课程建设");
        temp2.setMap(map2);
        list.add(temp2);

        System.out.println("list = " + list);

        List<List<String>> dataList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)){
            for (int i = 0;i < list.size();i++){
                ExpertContainer info = list.get(i);
                Map<String,Integer> map = info.getMap();
                List<String> list1 = new ArrayList<>(map.keySet());
                String[] arr = new String[list1.size()+3];
                arr[0] = info.getIndex()+"";
                arr[1] = info.getName();
                arr[2] = info.getBtoAuthToken();
                for (int j = 3;j<arr.length;j++){
                    arr[j] = map.get(list1.get(j-3)) == 1 ? "是":"否";
                }
                dataList.add(Arrays.asList(arr));
            }
        }
        System.out.println("dataList = " + dataList);
    }
}
