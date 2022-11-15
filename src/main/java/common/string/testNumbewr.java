package common.string;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.regex.Pattern;


/**
 * @Description 判断字符串所属的数据
 * @Author XuShen
 * @Date 2022/11/14 10:26
 */
public class testNumbewr {

    /**
     * 三种需求:
     * 1.判断字符串是否是数字字符串(可以是正整数,0,负整数或者小数);
     * 2.判断字符串是否是纯数字,也就是说我们数学上的整数(可以是正整数，0，负整数,不包含小数位);
     * 3.判断字符串是否是小数,小数点左边是整数(只有小数点,小数点左边是整数,右边至少包含一位数(0-9))
     */
    @Test
    public  void test1(){
        String number = "1";
        boolean value1 = isNumber(number);
        System.out.println( value1);
    }

    /**
     * 数字校验 判断字符串是否是数字字符串
     * @param number
     */
    private static boolean isNumber(String number) {
        if (StringUtils.isEmpty(number)){
            return false;
        }

        //数字校验(可以包含小数 ,可以是1,0,-1,1.1,-1.1 不能是 +1.1，+1)
        Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
        if (!pattern.matcher(number).matches()){
            return false;
        }
        return true;
    }

    /**
     * 判断字符串是否是纯数字(整数)
     * 不包含小数位
     * @param wholeNumber
     * @return
     */
    private static boolean isWholeNumber(String wholeNumber){
        if (StringUtils.isEmpty(wholeNumber)){
            return false;
        }

        //整数校验
        Pattern pattern = Pattern.compile("[+-]?[0-9]+?");
        if (!pattern.matcher(wholeNumber).matches()){
            return false;
        }
        return true;
    }

    /**
     * 判断字符串是否是小数
     * 小数校验（至少包含一位小数）
     */
    private static boolean isDecimal(String decimal){
        //
        if (StringUtils.isEmpty(decimal)){
            return false;
        }

        //小数校验
        Pattern pattern = Pattern.compile("[+-]?[0-9]+\\.([0-9]+)?");
        if (!pattern.matcher(decimal).matches()){
            return false;
        }
        return true;
    }




}
