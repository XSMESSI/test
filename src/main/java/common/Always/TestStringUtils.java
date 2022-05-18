package common.Always;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/5/17 9:22
 */

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * Java之StringUtils的常用方法 :
 */
public class TestStringUtils {

    /**
     *  1）boolean StringUtils.isBlank(String str)
     *  2）boolean StringUtils.isEmpty(String str)
     *  3）boolean StringUtils.isNotBlank(String str)
     *  4）boolean StringUtils.isNotEmpty(String str)
     *  5）boolean StringUtils.isAnyBlank(CharSequence… css)
     *  6）boolean StringUtils.isAnyEmpty(CharSequence… css)
     *  7）boolean StringUtils.isNoneBlank(CharSequence… css)
     *  8）boolean StringUtils.isNoneEmpty(CharSequence… css)
     *  9）boolean StringUtils.isWhitespace(CharSequence cs)
     */
    @Test
    public void testEmpty(){
        String str1 = "Leo";
        System.out.println("StringUtils.isBlank(str1) = " + StringUtils.isBlank(str1));
        System.out.println("StringUtils.isEmpty(str1) = " + StringUtils.isEmpty(str1));
        System.out.println("StringUtils.isNotBlank(str1) = " + StringUtils.isNotBlank(str1));
        System.out.println("StringUtils.isNotBlank(str1) = " + StringUtils.isNotEmpty(str1));
        System.out.println("str1 = " + str1);
    }

}
