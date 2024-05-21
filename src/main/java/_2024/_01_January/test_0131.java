package _2024._01_January;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2024/1/31 11:33
 * @Version 1.0
 * @DESC :
 */
public class test_0131 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("new");
        list.add("new01");
        list.add("new02");

        System.out.println("list = " + list);

        List<String> copyList = new ArrayList<>();

        copyList.addAll(list);

        System.out.println("copyList = " + copyList);

        List<String> copy2List = copyListWithNewAddresses(list);

        System.out.println("copy2List = " + copy2List);


    }

    /**
     * 复制集合并且创建新地址
     * @param originalList
     * @param <T>
     * @return
     */
    public static <T> List<T> copyListWithNewAddresses(List<T> originalList) {
        List<T> copiedList = new ArrayList<>(originalList.size());
        for (T item : originalList) {
            copiedList.add(item);
        }
        return copiedList;
    }
}
