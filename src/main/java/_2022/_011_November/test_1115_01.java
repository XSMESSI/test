package _2022._011_November;

import common.DESUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/15 11:13
 */
public class test_1115_01 {

    @Test
    public void test1(){
        StringBuilder str = new StringBuilder("sj");
//        str.append("#").append("11114");
//        str.append("#").append("11114_bto");
        str.append("#").append("13011_dict");
//        List<String> value = Arrays.asList(str.toString().split("#"));
//        System.out.println("value = " + value);

        String entrySecret =new DESUtil("E9D53269E60F3B020257C0954A034F6A").encryptStr(str.toString());
        System.out.println("加密之后>>>>entrySecret = " + entrySecret);

        String decrSecret = new DESUtil("E9D53269E60F3B020257C0954A034F6A").decryptStr("VGwQ2UIwSMMq+PI5kPmcCeh2QHX8OGkx");
        System.out.println("解密之后>>>>decrSecret = " + decrSecret);
        List<String> value = Arrays.asList(decrSecret.split("#"));
        System.out.println("value = " + value);
    }

    @Test
    public void test2(){
        //导出数据填报的信息统计的加密信息
        List<BtoBase> value = new ArrayList<>();
        value.add(new BtoBase("sj","11114","11114_bto"));
        value.add(new BtoBase("sj","10832","10832_bto"));
        value.add(new BtoBase("sj","13011","13011_bto"));
        value.add(new BtoBase("sj","13058","13058_bto"));
        value.add(new BtoBase("sj","14240","14240_bto"));
        value.add(new BtoBase("sj","11114_base","11114_bto"));
        value.add(new BtoBase("sj","10832_base","10832_bto"));
        value.add(new BtoBase("sj","13011_base","13011_bto"));
        value.add(new BtoBase("sj","13058_base","13058_bto"));
        value.add(new BtoBase("sj","14240_base","14240_bto"));

        for (BtoBase var : value) {
            StringBuilder str = new StringBuilder(var.getSj());
            str.append("#").append(var.getSchoolName());
            str.append("#").append(var.getDbName());
            String entrySecret =new DESUtil("E9D53269E60F3B020257C0954A034F6A").encryptStr(str.toString());
            var.setSecret(entrySecret);
        }


        for (BtoBase btoBase : value) {
            System.out.println(btoBase.getSchoolName() + ">>>>>>>>>>>>" + btoBase.getSecret());
        }

        System.out.println(">>>>>>>>>导出数据字典的加密信息>>>>>>>>>");
        List<BtoBase> valueDict = new ArrayList<>();
        valueDict.add(new BtoBase("sj","11114_bto"));
        valueDict.add(new BtoBase("sj","10832_bto"));
        valueDict.add(new BtoBase("sj","13011_bto"));
        valueDict.add(new BtoBase("sj","13058_bto"));
        valueDict.add(new BtoBase("sj","14240_bto"));
        valueDict.add(new BtoBase("sj","12324"));
        valueDict.add(new BtoBase("sj","12324_bto"));
        valueDict.add(new BtoBase("sj","12345_init_bto"));

        for (BtoBase dict : valueDict) {
            StringBuilder builder = new StringBuilder(dict.getSj());
            builder.append("#").append(dict.getDbName());
            String entrySecret =new DESUtil("E9D53269E60F3B020257C0954A034F6A").encryptStr(builder.toString());
            dict.setSecret(entrySecret);
        }

        for (BtoBase btoBase : valueDict) {
            System.out.println(btoBase.getDbName() + ">>>>>>>>>>>>" + btoBase.getSecret());
        }

    }
}
