package _2022._01_January.test_0106;

import org.junit.Test;

import java.util.Base64;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/6 14:14
 */
public class test_01md5 {

    @Test
    public void testMd(){
        String id1 = "34";
        String idmd = MD5Tool.encodeMD5(id1);
        System.out.println("id1 = " + id1);
        System.out.println("idmd = " + idmd);
        System.out.println(delMdId(idmd));


    }

    //解密方法
    private String delMdId(String idMd) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] by = decoder.decode(idMd);
        return new String(by);
    }
}
