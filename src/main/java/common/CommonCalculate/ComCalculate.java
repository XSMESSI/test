package common.CommonCalculate;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Description 公用计算方法
 * @Author XuShen
 * @Date 2021/12/31 10:52
 */
public final class ComCalculate {

    private static final String POINT = ".";


    /**
     * 存储list集合中的不同对象的数量 Map<对象,数量>
     * 也可以提供数组，存储数组中的变量在list集合中的个数
     * LinkedHashMap:按照数组的顺序存储K值
     * @param list 待统计集合
     * @param arr 提供数组，存储数组中的变量在list集合中的个数
     * @param <T>
     * @return
     */
    public static <T> Map< T, Integer> countObject(List<T> list,T[] arr){
        Map<T,Integer> map = new LinkedHashMap<>();
        if (arr == null){
            List<T> disList = list.stream().distinct().collect(Collectors.toList());
            for (T var:disList){
                map.put(var, Collections.frequency(list,var));
            }
        }else{
            for (T var:arr){
                map.put(var,Collections.frequency(list,var));
            }
        }
        return map;
    }

    /**
     * 统计集合中元素的存储数量
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Map< T, Integer> countElements(List<T> data){
        Map<T,Integer> map = new LinkedHashMap<>();
        List<T> disData = data.stream().distinct().collect(Collectors.toList());
        for (T var : disData){
            map.put(var, Collections.frequency(data,var));
        }
        return map;
    }

    /**
     * 统计指定集合中的元素的存储数量
     * @param data    待统计集合
     * @param ergodic 遍历的集合(没有重复的数据)
     * @param <T>
     * @return
     */
    public static <T> Map< T, Integer> countElements(List<T> data,List<T> ergodic) throws Exception {
        Map<T,Integer> map = new LinkedHashMap<>();
        if (CollectionUtils.isEmpty(ergodic)){
            throw new Exception(">>>>遍历集合为空>>>>>");
        }
        for (T var : ergodic){
            map.put(var,Collections.frequency(data,var));
        }
        return map;
    }

    /**
     * 获取文件前缀名
     * @param fileName
     * @return
     */
    public static String filePrefix(String fileName) throws Exception {
        if (!fileName.contains(POINT)){
            throw new Exception(fileName + ">>>>error>>>文件名称异常>>>>>>");
        }
        return fileName.substring(0,fileName.lastIndexOf("."));
    }

    /**
     * 获取文件后缀名(文件类型)
     * @param fileName
     * @return
     */
    public static String fileSuffix(String fileName) throws Exception {
        if(!fileName.contains(POINT)){
            throw new Exception(fileName + ">>>>error>>>文件名称异常>>>>>>");
        }
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public void printCostTime(long start,long end){
        long time = end - start;
        System.out.println("耗费" + time + "ms");
    }

    /**
     * Map<key1,Map<key2,Integer>对应的两个键值的数量
     * @param list
     * @param type
     * @param classes
     * @return
     */
    public static  Map< String,Map<String,Integer>> countTwokey(List<Prize> list,String[] type,String[] classes){
        Map<String,Map<String, Integer>> map = new LinkedHashMap<>();
        Map<String,List<Prize>> groupMap = list.stream().collect(Collectors.groupingBy(Prize::getType));
        for (String varT : type){
            Map<String,Integer> mapC = new LinkedHashMap<>();
            List<Prize> temp = groupMap.get(varT);
            List<String> listC = new ArrayList<>();
            for (String varC : classes){
                if (CollectionUtils.isNotEmpty(temp)){
                    listC = temp.stream().map(Prize::getClasses).collect(Collectors.toList());
                }
                mapC.put(varC,Collections.frequency(listC,varC));
                map.put(varT,mapC);
            }
        }
        return map;
    }

    /**
     * map根据value值进行排序
     * @param map
     * @param flag 0:降序,1:升序
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K,V extends Comparable<? super V>> Map<K,V> sortMapByValue(Map<K,V> map,Integer flag){
        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
        if (flag.equals(0)){
            Collections.sort(list, (o1, o2) -> {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            });
        }else if(flag.equals(1)){
            Collections.sort(list, (o1, o2) -> {
                int compare = (o2.getValue()).compareTo(o1.getValue());
                return -compare;
            });
        }
        Map<K,V> returnMap = new LinkedHashMap<K,V>();
        for (Map.Entry<K,V> entry:list){
            returnMap.put(entry.getKey(),entry.getValue());
        }
        return returnMap;
    }

    /**
     * 判断字符串是否为空，这里为空的标准为字符串等于null或者去除开头结尾的空值字符长度为0
     * */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**判断collection集合和其子类是否为空，在这里都可以用这个方法
      判断标准为集合为null或者集合中没有元素
    */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() < 1;
    }

    /**判断map集合和其子类是否为空，在这里都可以用这个方法
      判断标准为集合为null或者集合中没有元素
    */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Map map) {
        return map == null || map.size() < 1;
    }

    /*通过正则表达式判断该字符串是否为邮箱格式*/
    public static boolean isEmail(String email) {
        if (email == null) {
            return false;
        }
        /**判断邮箱格式:
        ^\\w+：邮箱可以以数字或字母开始，出现一次或者多次
        ([-+.]\\w+)*：（后面可以跟着-号、+号或者.号在拼接数字或字母一次
          或多次），括号中的内容可以出现零次或者多次
        @：中间拼接上@符号
        \\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$：这部分和前面部分类似
        例如邮箱：abc-def+ghi.jkl.mno@pq.com.cn
        因为不同的邮箱服务器，域名的命名规则是有差异的，这个是比较通用的一种
        */
        return Pattern.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", email);
    }

    /*通过正则表达式判断该字符串是否为手机格式*/
    public static boolean isPhone(String phoneNum) {
        if (phoneNum == null) {
            return false;
        }
        //验证规则，手机号第一位为1，后面十位为数字
        return Pattern.matches("^1(\\d{10})$", phoneNum);
    }

    public static boolean isPhone1(String phoneNum){
        if (phoneNum == null){
            return false;
        }

        return Pattern.matches("^1([358][0-9]|4[579]|66|7[0135678]|9[589])[0-9]{8}$",phoneNum);
    }

    /**
     * 初始化map集合的容量大小
     * @param num
     * @return
     */
    private static Integer initMapCapacity(Integer num) {
        Integer number = 16;
        try {
            double count = num/0.75;
            number = (int) Math.ceil(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return number;
        }
    }



    /*通过正则表达式判断该字符串是否为身份证号码格式*/
 /**
    身份证分为15位身份证和18位身份证号码
    18位身份证号：xxxxxx yyyy MM dd *** 0     十八位
    15位身份证号：xxxxxx yy   MM dd **  0     十五位
    首先身份证是以1-9开头，前6位表示区域：^[1-9]/d{5}
    年的前两位：(18|19|([23]\d))
    年的后两位： \d{2}
    月份：((0[1-9])|(10|11|12))
    天：(([0-2][1-9])|10|20|30|31)
    三位顺序码：\d{3}
    两位顺序码：\d{2}
    校验码：[0-9Xx]
    十八位： ^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$
    十五位： ^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}$
    */
//    public static boolean isIdCard(String idCard) {
//        if (idCard == null) {
//            return false;
//        }
//
//        return Pattern.matches("(^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}$)", idCard);
//    }




}

