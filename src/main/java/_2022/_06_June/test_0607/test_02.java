package _2022._06_June.test_0607;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Description 转换文件
 * @Author XuShen
 * @Date 2022/6/7 15:54
 */
@Slf4j
public class test_02 {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);
        String inputFile = "E:\\temp\\测试文档.doc";
        String pdfFile = "E:\\temp\\";
        if (convert2PDF(inputFile,pdfFile)){
            System.out.println("文件转为pdf成功");
        }else{
            System.out.println("文件转换失败");
        }
    }

    /**
     * 利用libreOffice将office文档转换成pdf
     *
     * @param inputFile 目标文件地址
     * @param pdfFile   输出文件夹
     * @return
     */
    public static boolean convert2PDF(String inputFile, String pdfFile) {
        long start = System.currentTimeMillis();
        String command;
        boolean flag;
        String osName = System.getProperty("os.name");
        if (osName.contains("Windows")) {
            command = "cmd /c start soffice --headless --invisible --convert-to pdf:writer_pdf_Export " + inputFile + " --outdir " + pdfFile;
        } else {
            command = "libreoffice --headless --invisible --convert-to pdf:writer_pdf_Export " + inputFile + " --outdir " + pdfFile;
        }
        flag = executeCommand(command);
        long end = System.currentTimeMillis();
        log.debug("用时:{} ms", end - start);
        return flag;
    }


    /**
     * 执行command指令
     *
     * @param command
     * @return
     */
    public static boolean executeCommand(String command) {
        log.info("开始进行转化.......");
        Process process;// Process可以控制该子进程的执行或获取该子进程的信息
        try {
            log.debug("convertOffice2PDF cmd : {}", command);
            process = Runtime.getRuntime().exec(command);// exec()方法指示Java虚拟机创建一个子进程执行指定的可执行程序，并返回与该子进程对应的Process对象实例。
            // 下面两个可以获取输入输出流
//            InputStream errorStream = process.getErrorStream();
//            InputStream inputStream = process.getInputStream();
        } catch (IOException e) {
            log.error(" convertOffice2PDF {} error", command, e);
            return false;
        }
        int exitStatus = 0;
        try {
            exitStatus = process.waitFor();// 等待子进程完成再往下执行，返回值是子线程执行完毕的返回值,返回0表示正常结束
            // 第二种接受返回值的方法
            int i = process.exitValue(); // 接收执行完毕的返回值
            log.debug("i----" + i);
        } catch (InterruptedException e) {
            log.error("InterruptedException  convertOffice2PDF {}", command, e);
            return false;
        }
        if (exitStatus != 0) {
            log.error("convertOffice2PDF cmd exitStatus {}", exitStatus);
        } else {
            log.debug("convertOffice2PDF cmd exitStatus {}", exitStatus);
        }
        process.destroy(); // 销毁子进程
        log.info("转化结束.......");
        return true;
    }

}
