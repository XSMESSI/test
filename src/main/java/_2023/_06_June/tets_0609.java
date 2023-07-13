package _2023._06_June;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xu Shen
 * @version 1.0
 * @description
 * @date 2023/6/9 12:37
 */
public class tets_0609 {
    public static void main(String[] args) {
        String name = "";
        String name1 = " ";
        String name2 = null;
        System.out.println("StringUtils.isBlank(name) = " + StringUtils.isBlank(name));
        System.out.println("StringUtils.isEmpty(name) = " + StringUtils.isEmpty(name));

        System.out.println("StringUtils.isBlank(name1) = " + StringUtils.isBlank(name1));
        System.out.println("StringUtils.isEmpty(name1) = " + StringUtils.isEmpty(name1));

        System.out.println("StringUtils.isBlank(name2) = " + StringUtils.isBlank(name2));
        System.out.println("StringUtils.isEmpty(name2) = " + StringUtils.isEmpty(name2));
    }
}
