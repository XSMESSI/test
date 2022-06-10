package _2022._06_June.test_0607;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/6/7 14:55
 */
public class test_01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        String libreoffice_version = "7.3";
//        String filePath = ""
//        String[] cmdA = { "sh", "-c", libreoffice_version+" --headless --convert-to pdf:writer_pdf_Export "+filePath+" --outdir "+pdfPath+" -env:UserInstallation=file:///tmp/liboffice_convert_${USER}"};
        Process ipconfig = runtime.exec("ipconfig");
        //Process ipconfig = runtime.exec("java -version");
        ipconfig.waitFor();
        InputStream inputStream = ipconfig.getInputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len,"GBK"));
        }
    }
}
