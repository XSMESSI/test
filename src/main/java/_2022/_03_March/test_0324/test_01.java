package _2022._03_March.test_0324;

import _2021._11_November.test_1110.Person;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/24 9:19
 */
public class test_01 {
    public static void main(String[] args) {
        Person param = new Person();
        param.setYear(2021);
        System.out.println();
        System.out.println("没有传到方法里面的年度数据"+param.getYear());
//        param.setYear(param.getYear()-1);
//        System.out.println("set年度值拿数据"+param.getYear());
        testChangeYear(param.getYear());

        System.out.println("判断年度值是否变化"+param.getYear());
        System.out.println();
        for (int i = 0;i < 10;i++){
            System.out.println(i);
        }
    }

    /**
     * 改变传过来的年度值
     * 在这里是重新定义的值，没有用到set方法
     * @param year
     */
    private static void testChangeYear(Integer year) {
        System.out.println("传到方法里面的没有改变的年度数据"+year);
        System.out.println("传到方法里面的改变的年度数据"+(year-1));
    }
}
