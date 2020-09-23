package com.beibei.utils;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.oracle.javafx.jmx.json.JSONException;
import org.json.JSONObject;

public class JSONUtil {
    /**
     *      * 解析Json内容
     *      * @author Findyou
     *      * @version 1.0 2015/3/23
     *      * @return JsonValue 返回JsonString中JsonId对应的Value
     *      
     **/
    public static String getValue(String JsonString, String key) {
        String value = "";
        if (JsonString == null || JsonString.trim().length() < 1) {
            return value;
        }
        try {
            JSONObject jsonObject = new JSONObject(JsonString);
            Object target = jsonObject.get(key);
            if (target instanceof String) {
                value = (String) target;
            } else {
                value = jsonObject.getJSONObject(key).toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return value;
    }
}