package findyou.Interface;


import com.oracle.javafx.jmx.json.JSONException;
import org.json.JSONObject;

public class Common {
    /**
     *      * 解析Json内容
     *      * 
     *      * @author Findyou
     *      * @version 1.0 2015/3/23
     *      * @return JsonValue 返回JsonString中JsonId对应的Value
     *      
     **/
    public static String getJsonValue(String JsonString, String JsonId) {
        String JsonValue = "";
        if (JsonString == null || JsonString.trim().length() < 1) {
            return null;
        }
        try {
            JSONObject obj1 = new JSONObject(JsonString);
            Object target = obj1.get(JsonId);
            if (target instanceof String) {
                JsonValue = (String) target;
            } else {
                JsonValue = obj1.getJSONObject(JsonId).toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return JsonValue;
    }
}