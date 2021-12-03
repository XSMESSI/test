package _2021._08_August.Excel;


import _2021._08_August.Excel.ExcelUtil;
import _2021._08_August.Excel.Member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/5 10:07
 */
public class DownLoadExcel {
    public static void main(String[] args) {
        Map<String, List<String>> memberMap = getMember();
//        Map<String, List<String>> footMap = getFoot();
        String[] strArray = excelTitle();
        ExcelUtil.createExcel(memberMap, strArray);
//        ExcelUtil.createExcel(footMap, strArray);
    }

    /**
     * 初始化数据，将会被存储到excel表格中
     *
     * @return
     * @throws Exception
     */
    private static Map<String, List<String>> getMember() {
        List<_2021._08_August.Excel.Member> list = new ArrayList<_2021._08_August.Excel.Member>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        try {
            _2021._08_August.Excel.Member user1 = new _2021._08_August.Excel.Member(1, "梅西", 34, df.parse("1993-08-28"), "巴塞罗那");
            _2021._08_August.Excel.Member user2 = new _2021._08_August.Excel.Member(2, "C罗", 33, df.parse("1994-08-19"), "尤文图斯");
            _2021._08_August.Excel.Member user3 = new Member(3, "德布劳内", 30, df.parse("1983-11-22"), "曼城");
//                Member user4 = new Member(4,"苏亚雷斯",32,df.parse("1995-9-19"));

            list.add(user1);
            list.add(user2);
            list.add(user3);
//                list.add(user4);

            for (int i = 0; i < list.size(); i++) {
                ArrayList<String> members = new ArrayList<String>();
                members.add(list.get(i).getCode() + "");
                members.add(list.get(i).getName());
                members.add(list.get(i).getAge() + "");
                members.add(df.format(list.get(i).getBirth()));
                members.add(list.get(i).getClub() + "");
                map.put(list.get(i).getCode() + "", members);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    /*public static Map<String, List<String>> getFoot() {
        List<Football> list = new ArrayList<Football>();
        Map<String, List<String>> map = new HashMap<>();

        try {
            Football fo1 = new Football(1, "西甲", 19000L, "梅西");
            Football fo2 = new Football(2, "意甲", 2999L, "c罗");
            Football fo3 = new Football(3, "英超", 8888L, "范戴克");
//            Football fo4 = new Football(4, "德甲", 6666L, "莱万托夫斯基");
//            Football fo5 = new Football(5, "法甲", 9999L, "内马尔");

            list.add(fo1);
            list.add(fo2);
            list.add(fo3);
//            list.add(fo4);
//            list.add(fo5);

            for (int i = 0; i < list.size(); i++) {
                List<String> footlist = new ArrayList<>();
                footlist.add(list.get(i).getCode() + "");//因为定义的footlist集合是String类型的，而定义的code是int类型的，所以加上“”
                footlist.add(list.get(i).getCopname());
                footlist.add(list.get(i).getSalary() + "");
                footlist.add(list.get(i).getStarName());
                map.put(list.get(i).getCode() + "", footlist);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }*/




        /**
         * 创建excel title
         */
        public static String[] excelTitle() {
            String[] strArray = { "学号", "姓名", "年龄", "生日","俱乐部"};
            return strArray;
        }

//        public static String[] excelTitlefoot(){
//            String[] strArray = {"编号","联赛名称","平均工资","著名球星"};
//            return strArray;
//        }
    }

