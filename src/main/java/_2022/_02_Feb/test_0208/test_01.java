package _2022._02_Feb.test_0208;

/**
 * @Description 序列化
 * @Author XuShen
 * @Date 2022/2/8 10:51
 */
public class test_01 {
    /*
实现Serializable接口：
1) 系统自动存储必要的信息；
2) Java内建支持，易于实现，只需要实现接口接口，不需要任何代码支持；
3) 性能略差；

实现Externalizable接口：
1) 自己决定要序列化哪些属性；
2) 必须实现该接口内的两个方法：
void writeExternal(ObjectOutput out) throws IOException;
void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;
3) 性能略好；

 *

     */
/**
 * 序列化：将对象写入IO流中；
 * 反序列化：从IO流中恢复对象；
 */
    public static void main(String[] args) {

    }
}
