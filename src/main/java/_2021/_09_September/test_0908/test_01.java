package _2021._09_September.test_0908;

import _2021._09_September.test_0908.FillFromInfo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/8 14:41
 */
public class test_01 {
    public static void main(String[] args) {
        String[] orgManage = {"组织基本信息","组织制度","工作职责","组织工作计划",
                "组织工作总结","组织工作检查","教师荣誉称号","青年教师导师"};
        String[] teachManage = {"专业建设规划文件","课程建设规划文件","教材建设规划文件","课程建设记录","教材选用评估制度",
                "教材建设记录","课程教学大纲","教案","考试安排","专业建设任务"};
        String[] teachActivity = {"教研室活动计划","教研室活动记录"};
        String[] laboratoryMange = {"实验设备管理","实验实训室工作计划","实验设备使用记录","实验实训室教学记录","实验工作日志","实验（实习、实训）指导书"};
        String[] others = {"教师培训记录","辅导员答疑记录","教师获奖记录","企业实践","学生座谈","培训基地"};


        String[] tryFillForm = {"教师培训记录","辅导员答疑记录","教研室活动记录","组织基本信息","学生座谈"};

        List<String> orgManageList = new ArrayList<>(Arrays.asList(orgManage));
        List<String> teachManageList = new ArrayList<>(Arrays.asList(teachManage));
        List<String> teachActivityList = new ArrayList<>(Arrays.asList(teachActivity));
        List<String> laboratoryMangeList = new ArrayList<>(Arrays.asList(laboratoryMange));
        List<String> othersList = new ArrayList<>(Arrays.asList(others));

        Map<String,List<String>> tempMap = new HashMap<>();
        tempMap.put("组织管理",orgManageList);
        tempMap.put("教学管理",teachManageList);
        tempMap.put("教学活动",teachActivityList);
        tempMap.put("实验（训）室管理",laboratoryMangeList);
        tempMap.put("其他",othersList);

//        System.out.println(tempMap.keySet());
        //取所有表单的合集
        Set<String> resultSet = new HashSet<>();
        resultSet.addAll(orgManageList);
        resultSet.addAll(teachManageList);
        resultSet.addAll(teachActivityList);
        resultSet.addAll(laboratoryMangeList);
        resultSet.addAll(othersList);


//        System.out.println(resultSet);

        List<FillFromInfo> fromInfoList = new ArrayList<>();

        Integer count = 0;
        for (String indictor:tempMap.keySet()){
            for (String formEachAll:tempMap.get(indictor)){
                for (String formFill:tryFillForm){
                    FillFromInfo temp = new FillFromInfo();
                    temp.setIndictorName(indictor);
                    temp.setFormName(formEachAll);
                    if (formEachAll.equals(formFill)){
                        temp.setFlag(1);
                        count++;
                    }else{
                        temp.setFlag(0);
                    }
                    fromInfoList.add(temp);
                }
            }
        }
        //总共填的个数
        System.out.println("总共填报的表单个数"+count);


        Map<String,List<FillFromInfo>> indictorMap = fromInfoList.stream().collect(Collectors.groupingBy(FillFromInfo::getIndictorName));

        for (String indictor:indictorMap.keySet()){
            System.out.println(indictorMap.get(indictor));
        }

     }
}
