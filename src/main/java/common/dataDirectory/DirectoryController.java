package common.dataDirectory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @Description 导出某数据库的数据字典操作
 * @Author XuShen
 * @Date 2022/8/23 11:10
 */
@RestController
@RequestMapping("/directory")
@Api(tags = "数据字典")
@Slf4j
public class DirectoryController {


    @Resource
    private DirectoryService directoryService;

    @GetMapping("/export")
    @ApiOperation("导出数据字典")
    public void export(HttpServletRequest request, HttpServletResponse response,
                       @ApiParam(value = "数据库名") @RequestParam String dbName,
                       @ApiParam(value = "导出密码") @RequestParam String assKey){
        //密码:E6*-mX^CkILPj5U^Y1NHu!~RpaS=(A
        if (Objects.equals(assKey,"E6*-mX^CkILPj5U^Y1NHu!~RpaS=(A")){
            directoryService.exportTableDirectory(request,response,dbName);
            log.info(dbName + "库的数据字典已经导出");
        }else{
            log.error("密码不对,无权限导出");
        }
    }
}
