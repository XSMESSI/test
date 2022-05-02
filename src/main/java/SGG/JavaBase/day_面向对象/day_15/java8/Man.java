package SGG.JavaBase.day_面向对象.day_15.java8;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/22:53
 * @Description:
 */
class Man extends Father implements Filial,Spoony{

    @Override
    public void help() {
        System.out.println("我该救谁呢？");
        Filial.super.help();
        Spoony.super.help();
//        Filial.super.help();
    }

}

interface Filial {// 孝顺的
    default void help() {
        System.out.println("老妈，我来救你了");
    }
}


interface Spoony {// 痴情的
    default void help() {
        System.out.println("媳妇，别怕，我来了");
    }
}

class Father{
    public void help(){
        System.out.println("儿子！救我媳妇");
    }
}