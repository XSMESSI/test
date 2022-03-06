package SGG.JavaBase.day_面向对象.day_08;
/**
 *@Author: Leo messi
 *@Date: 2022/02/04/10:25
 *@Description:
 */

/**
 * 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long
 *
 * 对StudentTest的改进
 */
public class StudentTest1 {
    public static void main(String[] args) {

        //声明一个student类型的数组
        Student1[] stus = new Student1[20];

        for (int i = 0;i<stus.length;i++){
            //给数组元素赋值
            stus[i] = new Student1();
            //给student对象的属性赋值
            stus[i].number = (i+1);
            //年级
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩
            stus[i].score = (int)(Math.random() * (100-0+1));
        }
        StudentTest1 test1 = new StudentTest1();

}

    /**
     * 查找数组中指定的年级的信息
     * @param stus
     * @param state
     */
    public void searchState(Student1[] stus,int state){
        for (int i = 0;i<stus.length;i++){
            if (stus[i].state == state){
                System.out.println(stus[i].info());
            }
        }
    }

    /**
     * 数组进行打印信息
     */


    /**
     * stus1数组排序，
     * @param stus
     */
    public void sort(Student1[] stus){
        for (int i = 0;i<stus.length-1;i++){
            for (int j = 0;j< stus.length-1;j++){
                if (stus[j].score>stus[j+1].score){
                    //如果需要换序，交换的是数组的元素，Student对象
                    Student1 temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
    }
}

class Student1{
    int number;//学号
    int state;//年级
    int score;//成绩


    //显示学生信息的方法
    public String info(){
        return "学号："+number+"年级，"+state+"分数"+score;
    }

}
