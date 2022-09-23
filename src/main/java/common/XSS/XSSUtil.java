package common.XSS;

import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/13 13:43
 */
public class XSSUtil {

    private  static Pattern[] patterns = new Pattern[]{
            // Script fragments
            Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE),
            // src='...'
            Pattern.compile("src[\r\n]*=[\r\n]*\'(.*?)\'", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            Pattern.compile("src[\r\n]*=[\r\n]*\"(.*?)\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            // lonely script tags
            Pattern.compile("</script>", Pattern.CASE_INSENSITIVE),
            Pattern.compile("<script(.*?)>", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            // eval(...)
//            Pattern.compile("eval\((.*?)\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            // expression(...)
//            Pattern.compile("expression\((.*?)\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            // javascript:...
            Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE),
            // vbscript:...
            Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE),
            // 空格英文单双引号
//            Pattern.compile("[\s'"]+", Pattern.CASE_INSENSITIVE),
            // onload(...)=...
            Pattern.compile("onload(.*?)=", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            // alert
            Pattern.compile("alert(.*?)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
            Pattern.compile("<", Pattern.MULTILINE | Pattern.DOTALL),
            Pattern.compile(">", Pattern.MULTILINE | Pattern.DOTALL),
            //Checks any html tags i.e. <script, <embed, <object etc.
            Pattern.compile("(<(script|iframe|embed|frame|frameset|object|img|applet|body|html|style|layer|link|ilayer|meta|bgsound))")
    };

    //过滤替换xss脚本为空
    public static String stripXss(String value){
        if (value != null){
            value = value.replace("\0","");

            for (Pattern scriptPattern : patterns) {
                value = scriptPattern.matcher(value).replaceAll("");
            }
        }
        return value;
    }

    //含有xss脚本则返回false
    public static boolean isXssPass(String valueString){
        if(valueString != null){
            for (Pattern scriptPattern : patterns) {
                if (scriptPattern.matcher(valueString).find() == true){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
