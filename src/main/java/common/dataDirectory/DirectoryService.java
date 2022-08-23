package common.dataDirectory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 数据字典导出的接口
 * @Author XuShen
 * @Date 2022/8/23 11:13
 */
public interface DirectoryService {

    /**
     * 导出数据字典
     * @param request
     * @param response
     * @param dbName
     */
    void exportTableDirectory(HttpServletRequest request, HttpServletResponse response, String dbName);
}
