package _2022._01_January.test_0117;

/**
 * @Description 增强for循环使用
 * @Author XuShen
 * @Date 2022/1/17 18:58
 */
public class test_09 {
    /***
     * 语法格式：
     * for（声明语句 ： 表达式）{
     *     //代码句子
     * }
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7};
        //声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。起作用域限定在循环语句块，其值与此时数组元素的值相等
        //表达式：表达式是要访问的数组名，或者是返回值为数组的方法
        for (int x:a){
            System.out.println(x);
        }
    }
}
