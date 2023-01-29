package _2022._012_December;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/15 16:04
 */
public class test_1215_05 {
    public static void main(String[] args) {
        String value = "我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数据的我是中国好青年数是的";
        System.out.println("value = " + value.length());

        List<Integer> list = Arrays.asList(1,2,3);
        list = list.subList(0,1);
        System.out.println("list = " + list);


        String valueD = "刘凯刘凯(9913340162)";
        String result = valueD.substring(valueD.indexOf("(") + 1,valueD.indexOf(")"));
        System.out.println("result = " + result);
    }
}
