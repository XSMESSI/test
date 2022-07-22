package common.Excel.exportUtil;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/7/20 16:06
 */
@RestController
@RequestMapping(value = "TestContrller")
@Api(value = "测试导出大文件方法")
public class TestController {

    @Resource
//    private GoalDownThreeDao goalDownThreeDao;

    //导出
    @RequestMapping(value = "/export",method = RequestMethod.GET)
    @ApiOperation(value = "测试导出数据")
    public String export(HttpServletRequest request, HttpServletResponse response) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("导出开始时间："+format.format(new Date()));
        List<Map<String, Object>> list = null;
//        List<Map<String, Object>> list = jkconfigDao.exportByRksj();//查询业务数据
        String[] lables = new String[]{"号码","入库时间"};//表头数组
        String[] fields = new String[]{"HM","RKSJ"};//查询数据对应的属性数组
        String title = "测试.xlsx";
        ExportExcel.export(response, list, lables, fields, title);
        System.out.println("导出结束时间："+format.format(new Date()));
        return null;
    }
}
