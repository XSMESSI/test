package _2024._01_January;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author Xu Shen
 * @Date 2024/1/10 14:09
 * @Version 1.0
 * @DESC :
 */
public class test_0110 {
    public static void main(String[] args) {
        String fileUrl = "http://124.223.201.235/baseteaching/common/download?schoolNum=13011&fileName=b88b75a5-4e0e-4a13-8e1e-f65c87c62917.xlsx&oldName=%E6%B5%8B%E8%AF%95leo%E6%95%99%E5%B8%88%E8%A1%A8%E5%8D%95%E6%A8%A1%E6%9D%BF.xlsx";
        String savePath = "D:/开发工作文件/test/downloaded_file.txt";
        try {
            downloadFile(fileUrl, savePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 下载文件
     * @param fileUrl
     * @param savePath
     * @throws IOException
     */
    public static void downloadFile(String fileUrl, String savePath) throws IOException {
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (InputStream inputStream = connection.getInputStream();
                 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                 FileOutputStream fileOutputStream = new FileOutputStream(savePath);
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                    bufferedOutputStream.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("文件下载成功，保存路径：" + savePath);
        } else {
            System.out.println("文件下载失败，响应码：" + responseCode);
        }
        connection.disconnect();
    }
}
