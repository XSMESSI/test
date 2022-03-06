package SGG.JavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/28/13:39
 * @Description: 值传递机制：针对引用数据类型
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m="+data.m+", n = "+data.n);

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);
        System.out.println("m="+data.m+", n = "+data.n);

    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{

    int m;
    int n;
}
