package _2022._01_January.test_0117;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description try_catch:异常操作处理问题
 * @Author XuShen
 * @Date 2022/1/17 16:39
 */
@Slf4j
public class test_03 {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 2;
            double num = a/0;
            System.out.println("num = " + num);
            if (a == b){
                System.out.println("数据正确");
            }
        } catch (Exception e) {
            //红色打印出错误信息
            e.printStackTrace();
            //生成错误日志信息
            log.error(">>>>数据异常操作>",e);
            System.out.println("数据异常操作" );
        } finally {
            System.out.println("数据操作异常，但是依然输出");
        }
    }
}
