package _2023._02_Feb;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/9 18:08
 */
public class test_02_09 {
    public static void main(String[] args) {
        String str = "12abc34def56ghi";
        List<Integer> indes = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9'){
                indes.add(i);
            }
        }

        for (int i = 0; i < indes.size(); i++) {
//            if ()
//            String result = str.substring(indes.get(i),indes.get(i + 1));
        }
        for (Integer inde : indes) {

        }
    }
}
