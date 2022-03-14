//package _2022._03_March.test_0314.JsonObject;
//
//import fr.opensagres.xdocreport.document.json.JSONException;
//import fr.opensagres.xdocreport.document.json.JSONObject;
//
///**
// * @Description
// * @Author XuShen
// * @Date 2022/3/14 19:37
// */
//public class StringToJson {
//    public static <JavaBean> void main(String[] args) throws JSONException {
//        //定义JSON字符串
//        String jsonStr = "{\"id\": 2," +
//                " \"title\": \"json title\", " +
//                "\"config\": {" +
//                "\"width\": 34," +
//                "\"height\": 35," +
//                "}, \"data\": [" +
//                "\"JAVA\", \"JavaScript\", \"PHP\"" +
//                "]}";
//
//        //转换成为JSONObject对象
//        JSONObject jsonObj = new JSONObject(jsonStr);
//
//        //从JSONObject对象中获取数据
//        JavaBean bean = new JavaBean();
//
//        //根据属性名称获取int型数据;
//        bean.setId(jsonObj.getInt("id"));
//
//        //根据属性名获取String数据;
//        bean.setTitle(jsonObj.getString("title"));
//
//        //根据属性名获取JSONObject类
//        JSONObject config = jsonObj.getJSONObject("config");
//        bean.setWidth(config.getInt("width"));
//        bean.setHeight(config.getInt("height"));
//
//        //根据属性名获取JSONArray数组
//        JSONArray data = jsonObj.getJSONArray("data");
//        for(int index = 0, length = data.length(); index < length; index++) {
//        }
//    }
//}
