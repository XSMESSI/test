package _2023._03_March;

import org.junit.Test;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/27 10:55
 */
public class test_0327 {

    @Test
    public void testSub(){
        String var = "0123456789012345678901";
        System.out.println("var.length() = " + var.length());

        String sub = var.substring(0,20);
        System.out.println("sub.length() = " + sub.length());
        System.out.println("sub = " + sub);
    }

    @Test
    public void test1(){
        String suff = "t_ts_customer_";
        String pre = "_202303270003";
        System.out.println("suff.length() = " + suff.length());
        System.out.println("pre = " + pre.length());
    }


    @Test
    public void etst22(){
        String value ="t_ts_customer_qzd_202303300003以下几个字段：[ColumnVisual(id=22814, formId=null, formName=null, columnName=附件, columnCode=fj, columnType=longtext, columnWidth=null, checkoutType=8, requiredFlag=0, readOnly=null, appFlag=null, appTitleFlag=null, appConditionFlag=null, conditionFlag=null, settingFlag=null, showFlag=null, separationFlag=null, conditionType=null, sourceId=null, columnIdRef=null, sorts=null, remark=null, extend=null)]数据";
        System.out.println("value.length() = " + value.length());
    }
}
