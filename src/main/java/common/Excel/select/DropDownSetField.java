package common.Excel.select;

import java.lang.annotation.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/27 11:16
 */
@Documented
// 作用在字段上
@Target(ElementType.FIELD)
// 运行时有效
@Retention(RetentionPolicy.RUNTIME)
public @interface DropDownSetField {
    // 固定下拉内容
    String[] source() default {};

    // 注解内的名称，解析时要注意对应
    String name() default "";
}
