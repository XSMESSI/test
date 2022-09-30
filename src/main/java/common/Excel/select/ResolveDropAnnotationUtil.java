package common.Excel.select;

/**
 * @Description 处理导入excel下拉框注解的工具类
 * @Author XuShen
 * @Date 2022/9/27 11:17
 */
import java.util.Map;
import java.util.Optional;
public class ResolveDropAnnotationUtil {

    public static String[] resove(DropDownSetField dropDownSetField, String[] strings) {
        if (!Optional.ofNullable(dropDownSetField).isPresent()) {
            return null;
        }

        // 获取固定下拉信息
        String[] source = dropDownSetField.source();
        if (null != source && source.length > 0) {
            return source;
        }

        if (null != strings && strings.length > 0) {
            try {
                String[] dynamicSource = strings;
                if (null != dynamicSource && dynamicSource.length > 0) {
                    return dynamicSource;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    //插入到map中
    private void insertMap(Map<Integer, String[]> map, String[] params, DropDownSetField dropDownSetField, int i) {
        String[] sources = ResolveDropAnnotationUtil.resove(dropDownSetField, params);
        if (null != sources && sources.length > 0) {
            map.put(i, sources);
        }
    }
}


