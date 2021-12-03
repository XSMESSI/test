package _2021._11_November.test111001;




import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author mazhen
 * @className ListCombine
 * @Description 单层for循环将两个List根据某个相同字段来进行合并
 * @date 2020/11/9 15:19
 */
public class ListCombine {
    static List<_2021._11_November.test111001.Student> studentList = new ArrayList<>();
    static List<_2021._11_November.test111001.Class> classList = new ArrayList<>();
    static {
        studentList.add(new _2021._11_November.test111001.Student(1L,"张三",18,1L));
        studentList.add(new _2021._11_November.test111001.Student(2L,"李四",19,2L));
        studentList.add(new Student(3L,"王五",19,3L));

        classList.add(new _2021._11_November.test111001.Class(1L,"高三(1)班","魏乃学"));
        classList.add(new _2021._11_November.test111001.Class(2L,"高三(2)班","徐慎"));
        classList.add(new _2021._11_November.test111001.Class(3L,"高三(3)班","梅西"));
    }

    public static void main(String[] args) {
        System.out.println("合并前:"+ studentList);
        Map<Long, _2021._11_November.test111001.Class> map = classList.stream().collect(Collectors.toMap(_2021._11_November.test111001.Class::getId, Function.identity()));
        studentList.forEach(student -> {
            if (map.containsKey(student.getClassId())) {
                Class class1 = map.get(student.getClassId());
                student.setClassName(class1.getName());
                student.setMaster(class1.getMaster());
            }
        });
        System.out.println("合并后:"+studentList);
    }

}

