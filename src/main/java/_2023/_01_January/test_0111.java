package _2023._01_January;

import common.CommonCalculate.ComUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/1/11 17:37
 */
public class test_0111 {
    public static void main(String[] args) {
//        List<Integer> scoreList = Arrays.asList(90,80,60,40,38,33,31,21,34,10,8,6,5,0);
//        List<Integer> scoreList = Arrays.asList(90,80,60,40,38,33,31,0);
        List<Integer> scoreList = Arrays.asList(90,80,60,40,38,33,31,20,15,10,8,0);
        System.out.println("ComUtil.countSize(scoreList) = " + ComUtil.countSize(scoreList));

        List<Integer> majorScoreRank = scoreList;
        List<Integer> warnScoreRank = new ArrayList<>(4);

        Integer numIndex = scoreList.indexOf(0);
        if (numIndex > 10) {
            majorScoreRank = scoreList.subList(0, 10);
            if (numIndex > 12){
                warnScoreRank = scoreList.subList(ComUtil.countSize(scoreList) - 3, scoreList.size());
            }else{
                warnScoreRank = scoreList.subList(10, numIndex + 1);
//                warnScoreRank = scoreList.subList(10, numIndex);
            }
        }else if (numIndex >= 0 && numIndex <= 10){
            majorScoreRank = scoreList.subList(0,numIndex);
            warnScoreRank = scoreList.subList(numIndex, scoreList.size());
        }else if (Objects.equals(numIndex,-1)){
            if (ComUtil.countSize(scoreList) <= 10){
                majorScoreRank = scoreList.subList(0, ComUtil.countSize(scoreList));
            }else if (ComUtil.countSize(scoreList) > 10){
                majorScoreRank = scoreList.subList(0, 10);
                if (ComUtil.countSize(scoreList) > 12){
                    warnScoreRank = scoreList.subList(ComUtil.countSize(scoreList) - 3, ComUtil.countSize(scoreList));
                }else{
                    warnScoreRank = scoreList.subList(10, ComUtil.countSize(scoreList));
                }
            }
        }


        System.out.println("top10" + majorScoreRank);
        System.out.println("预警" + warnScoreRank);
    }
}
