package _2023._012_Dec;

import common.CommonCalculate.ComUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author Xu Shen
 * @Date 2023/12/11 10:59
 * @Version 1.0
 * @DESC :
 */
@Slf4j
public class test_1211 {
    public static void main(String[] args) {
        List<String> columns = new ArrayList<>();
        columns.add("1");
        columns.add("14");
        columns.add("15");
        columns.add("16");
        columns.add("2");
        columns.add("2");
        columns.add("2");//6
        columns.add("3");
        columns.add("3");
        columns.add("3");
        columns.add("3");
        columns.add("3");
        columns.add("3");//12
        columns.add("4");
        columns.add("4");//14
        columns.add("5");//15
        columns.add("6");
        columns.add("6");//17

        int start = 0;
        int end;
        int lastIndex = ComUtil.countSize(columns) - 1;
        for (int i = 0; i <= lastIndex; i++) {
            String thisData = columns.get(i);
            //不是最后一个
//            if (!Objects.equals(i,0) && !Objects.equals(i,lastIndex) ){
            if (!Objects.equals(i,lastIndex)){
                String nextData = columns.get(i + 1);
                if (!Objects.equals(thisData,nextData)){
                    end = i;
                    log.info(thisData + "start >>>" + start + ">>>>>end" + end);
                    start = i + 1;
                }
            }

            //最后一个元素判断
            if(Objects.equals(i,lastIndex)){
                String lastData = columns.get(i - 1);
                if (!Objects.equals(thisData,lastData)){
                    start = i;
                }
                end = i;
                log.info(thisData + "start >>>" + start + ">>>>>end" + end);
            }
        }
    }
}
