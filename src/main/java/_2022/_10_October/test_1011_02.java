package _2022._10_October;

import common.CommonCalculate.ComCalculate;

/**
 * @Description 获取文件名（前缀） 后缀
 * @Author XuShen
 * @Date 2022/10/11 9:50
 */
public class test_1011_02 {
    public static void main(String[] args){
        try {
            String name = "论文 ..盛湄.pdf";
            //获取文件前缀名
            String caselsh = ComCalculate.filePrefix(name);
            System.out.println("文件前缀名caselsh = " + caselsh);

            //获取文件后缀名
            String fileType = ComCalculate.fileSuffix(name);
            System.out.println("文件后缀名fileType = " + fileType);

            String data = caselsh + "-" + fileType;

            System.out.println("data = " + data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("1111");
        }


    }
}
