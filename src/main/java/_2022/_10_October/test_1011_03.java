package _2022._10_October;

import common.CommonCalculate.ComCalculate;

/**
 * @Description 校验手机号码，邮箱的格式
 * @Author XuShen
 * @Date 2022/10/11 14:22
 */
public class test_1011_03 {
    public static void main(String[] args) {
        String email = "2342@11.com";
        boolean result  = ComCalculate.isEmail(email);
        System.out.println(result);

        //校验手机号码
        String phone = "1777543661";
        boolean pRe = ComCalculate.isPhone(phone);
        boolean pRe1 = ComCalculate.isPhone1(phone);
        System.out.println(pRe);
        System.out.println(pRe1);
    }
}
