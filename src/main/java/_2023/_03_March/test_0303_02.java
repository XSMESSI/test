package _2023._03_March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/3 16:54
 */
public class test_0303_02 {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,2,3,4,1,2);
        List<Integer> disIds = ids.stream().distinct().collect(Collectors.toList());

        List<Integer> indexIds = new ArrayList<>();
        for (Integer disId : disIds) {
            indexIds = getElementIndexIdsOfList(ids,disId);
            System.out.println("indexIds = " + indexIds);
        }

    }

    private static List<Integer> getElementIndexIdsOfList(List<Integer> ids, Integer disId) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            if (Objects.equals(ids.get(i),disId)){
                result.add(i);
            }
        }
        return result;
    }
}
