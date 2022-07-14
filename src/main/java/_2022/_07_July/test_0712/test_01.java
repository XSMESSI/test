package _2022._07_July.test_0712;

/**
 * @Description 修改替换操作
 * @Author XuShen
 * @Date 2022/7/12 14:59
 */
public class test_01 {

    public static void main(String[] args) {
        String str = "{\"comKey\":\"1655958543374\",\"componentType\":\"input\",\"defaultPrompt\":\"\",\"defaultValue\":\"\",\"des\":\"\",\"fieldName\":\"cloum0_0\",\"hiddenHeadlines\":0,\"isDefaultValue\":0,\"isLimitedNumber\":0,\"isOnly\":0,\"isRequired\":1,\"isSearchColumn\":0,\"maxNumber\":300,\"minNumber\":0,\"readOnly\":1,\"size\":1,\"textType\":0,\"title\":\"专业名称\",\"titleLayout\":0,\"isUse\":1,\"pId\":2738,\"id\":2738}";
        System.out.println(str);
        String result = str.replace("\"readOnly\":0","\"readOnly\":1");
        System.out.println(result);
    }
}
