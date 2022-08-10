package common.Excel.ExcelModel;


import lombok.extern.slf4j.Slf4j;

/**
 * <p>异常日志打印类</p>
 *
 * @author zhenWei
 * @date 2022/8/8 0008 10:52
 */
@Slf4j
public class LoggerUtil {

    /**
     * 记录日志:
     *
     * @param clazz 所在类名
     * @param str   哪里异常
     * @param e     什么异常
     */
    public static void log(Class<?> clazz, String str, Exception e) {
        log.error(clazz.getSimpleName() + ": " + str, e);
    }


    /**
     * 警告
     *
     * @param clazz 所在类名
     * @param str   异常提示
     */
    public static void warn(Class<?> clazz, String str) {
        log.warn(clazz.getSimpleName() + ": " + str);
    }




}
