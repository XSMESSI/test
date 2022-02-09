package _2022._02_Feb.test_0228;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/8 11:29
 */
public class WriteObject {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Linux.txt"));
        SerPerson p = new SerPerson("ps","12");
        oos.writeObject(p);
    }
}
