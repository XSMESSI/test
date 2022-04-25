package _2022._04_April.test_0412;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Leo messi
 * @Date: 2022/04/12/13:54
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        String[] titles = {"序号","一级指标","二级指标","三级指标","指标观测点与评分说明","实际满分值","实际附分","自评得分，考核得分","问题反馈及改进建议"};
        //删除指定下标位置的元素

        int num = 2;
        for (int i = 0;i<titles.length;i++){
            if (i-1>=num){
                titles[i] = titles[i+1];
            }
        }

        System.out.println("num = " + Arrays.asList(titles));
    }
}
