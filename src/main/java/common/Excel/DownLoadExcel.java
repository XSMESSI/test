package common.Excel;


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
        String[] strArray = excelTitle();
        ExcelUtil.createExcel(memberMap, strArray);
    }

    /**
     * 初始化数据，将会被存储到excel表格中
     * @return
     * @throws Exception
     */
    private static Map<String, List<String>> getMember() {
        List<Member> list = new ArrayList<Member>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        try {
            Member user1 = new Member(1, "梅西", 34, df.parse("1993-08-28"), "巴塞罗那");
            Member user2 = new Member(2, "C罗", 33, df.parse("1994-08-19"), "尤文图斯");
            Member user3 = new Member(4, "德布劳内", 30, df.parse("1983-11-22"), "曼城");
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

        /**
         * 创建excel title
         */
        public static String[] excelTitle() {
            String[] titleArray = { "学号", "姓名", "年龄", "生日","俱乐部"};
            return titleArray;
        }
    }

