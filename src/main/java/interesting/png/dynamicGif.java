package interesting.png;

import com.madgag.gif.fmsware.AnimatedGifEncoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/30 20:14
 */
public class dynamicGif {
    public static void main(String[] args) throws IOException {
        BufferedImage image1 = ImageIO.read(new File("E:/A徐慎/练习代码元素/1234/1.jpg"));
        BufferedImage image2 = ImageIO.read(new File("E:/A徐慎/练习代码元素/1234/2.jpg"));
        BufferedImage image3 = ImageIO.read(new File("E:/A徐慎/练习代码元素/1234/3.jpg"));
        BufferedImage image4 = ImageIO.read(new File("E:/A徐慎/练习代码元素/1234/4.jpg"));
        AnimatedGifEncoder e = new AnimatedGifEncoder();
        //生成的图片路径
        e.start(new FileOutputStream("E:/A徐慎/练习代码元素/1234/gif.gif"));
        //图片宽高
        e.setSize(300,190);
        //图片之间间隔时间
        e.setDelay(400);
        //重复次数
        e.setRepeat(0);
        //添加图片
        e.addFrame(image1);
        e.addFrame(image2);
        e.addFrame(image3);
        e.addFrame(image4);
        e.finish();

    }
}
