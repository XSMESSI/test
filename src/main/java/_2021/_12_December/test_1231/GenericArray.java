package _2021._12_December.test_1231;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/31 15:25
 */
public class GenericArray<T> {

    private Object[] array;
    public GenericArray(int size){
        array = new Object[size];
    }

    public void put(int index,T item){
        array[index] = item;
    }

    @SuppressWarnings("uncheckeds")
    public T get(int index){
        return (T)array[index];
    }

}
