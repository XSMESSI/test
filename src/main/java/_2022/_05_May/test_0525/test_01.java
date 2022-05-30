//package _2022._05_May.test_0525;
//
//import java.io.File;
//
///**
// * @Description
// * @Author XuShen
// * @Date 2022/5/26 16:31
// */
//public class test_01 {
//    public static void main(String[] args) {
//        Runtime r = Runtime.getRuntime();
//        try{
//            Process proc = r.exec("cmd /c dir > %dest%", new String[]{"dest=c:\\dir.txt", new File("d:\\test")});
//            int exitVal = proc.waitFor(); // 阻塞当前线程，并等待外部程序中止后获取结果码
//            System.out.println(exitVal == 0 ? "成功" : "失败");
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}
