package _2021._12_December.test_1228;

import org.junit.Test;

import java.util.Properties;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/28 16:51
 */
public class test_01 {
    @Test
    public void printTest(){
        Properties properties=System.getProperties();
        properties.list(System.out);
    }

}
